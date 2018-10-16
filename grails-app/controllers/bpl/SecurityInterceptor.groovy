package bpl


class SecurityInterceptor {

    AdminService adminService

    SecurityInterceptor() {
        matchAll().excludes(controller: "authentication").excludes(controller: "public")

    }


    boolean before() {
        if (!adminService.isAuthenticated()) {
            redirect(controller: "public", action: "panel")
            return false
        }
        return true
    }

}
