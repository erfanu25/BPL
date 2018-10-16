package bpl

class TeamController {

    TeamService teamService


    def show(){

        def response = teamService.list(params)
        [team: response.list, total:response.count]
    }

    def edit(Integer id){
        if (flash.redirectParams) {
            [contactGroup: flash.redirectParams]
        }
        else
        {
            def response = teamService.get(id)
            if (!response) {
                flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
                redirect(controller: "team", action: "index")
            } else {
                [team: response]
            }
        }

    }




    def update() {
        def response = teamService.get(params.id)
        if (!response){
            flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
            redirect(controller: "team", action: "edit")
        }else{
            response = teamService.update(response, params)
            if (!response.isSuccess){
                flash.redirectParams = response.model
                flash.message = AppUtil.infoMessage(g.message(code: "unable.to.update"), false)
                redirect(controller: "team", action: "edit")
            }else{
                flash.message = AppUtil.infoMessage(g.message(code: "updated"))
                redirect(controller: "team", action: "show")
            }
        }
    }

    def delete(Integer id) {
        def response = teamService.get(id)
        if (!response){
            flash.message = AppUtil.infoMessage(g.message(code: "invalid.entity"), false)
            redirect(controller: "team", action: "show")
        }else{
            response = teamService.delete(response)
            if (!response){
                flash.message = AppUtil.infoMessage(g.message(code: "unable.to.delete"), false)
            }else{
                flash.message = AppUtil.infoMessage(g.message(code: "deleted"))
            }
            redirect(controller: "team", action: "show")
        }
    }

}
