package bpl

import grails.transaction.Transactional

@Transactional
class AdminService {

    private static final String AUTHORIZED = "AUTHORIZED"



    boolean isAuthenticated(){
        def authorization = AppUtil.getAppSession()[AUTHORIZED]
        if (authorization && authorization.isLoggedIn){
            return true
        }
        return false
    }

    def setAuthorization(Admin admin){
        def authorization = [isLoggedIn: true, admin: admin]
        AppUtil.getAppSession()[AUTHORIZED] = authorization
    }

    def doLogin(String email, String password){
        password = password.encodeAsMD5()
        Admin admin = Admin.findByEmailAndPassword(email, password)
        if (admin){
            setAuthorization(admin)
            return true
        }
        return false
    }

    def getAdmin(){
        def authorization = AppUtil.getAppSession()[AUTHORIZED]
        return authorization?.admin
    }

    def getAdminName(){
        def admin = getAdmin()
        return "${admin.name}"
    }


}
