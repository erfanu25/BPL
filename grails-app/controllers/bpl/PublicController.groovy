package bpl

class PublicController {

    PublicService publicService

    def index() { }

    def panel(){

    }

    def teamRegistration(){

    }

    def registerTeam(){
        def response = publicService.registerTeam(params)
        if (response.isSuccess) {
            flash.message = AppUtil.infoMessage(g.message(code: "saved"))
            redirect(controller: "public", action: "panel")
        } else {
            flash.redirectParams = response.model
            flash.message = AppUtil.infoMessage(g.message(code: "unable.to.save"), false)
             redirect(controller: "public", action: "teamRegistration")

        }
    }
}
