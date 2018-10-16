package bpl

class AuthenticationController {

    AdminService adminService

    def index() {
        render(panel())
    }

    def login(){

    }
    def doLogin() {
        if (adminService.doLogin(params.email, params.password)) {
            redirect(controller: "dashboard", action: "index")
        } else {
            redirect(controller: "authentication", action: "login")
        }
    }



}
