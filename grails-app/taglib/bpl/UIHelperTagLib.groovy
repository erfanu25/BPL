package bpl


class UIHelperTagLib {

    static namespace = "UIHelper"

    AdminService adminService


    def publicActionMenu = { attrs, body ->
        out << '<li class="">'
        out << g.link(controller: "fixture", action: "index"){g.message(code:"fixture")}+"    "
        out << g.link(controller: "public", action: "teamRegistration"){g.message(code:"team.registration")}+"    "
        out << g.link(controller: "authentication", action: "login"){g.message(code:"login")}
        out << "</div></li>"
    }

    def adminActionMenu = { attrs, body ->
        out << '<li class="nav-item dropdown show">'
        out << g.link(class:"nav-link dropdown-toggle", "data-toggle":"dropdown"){adminService.getAdminName()}
        out << '<div class="dropdown-menu">'
        out << g.link(controller: "authentication", action: "panel", class: "dropdown-item"){g.message(code:"change.password")}
        out << g.link(controller: "authentication", action: "panel", class: "dropdown-item"){g.message(code:"logout")}
        out << "</div></li>"
    }


    def appMenu = { attrs, body ->
        [
                [controller: "team", action: "show", name: "team"],
                [controller: "group", action: "index", name: "group"],
                [controller: "fixture", action: "index", name: "generate.fixture"],
                [controller: "group", action: "index", name: "assign.group"],
        ].each { menu ->
            out << '<li class="list-group-item">'
            out << g.link(controller: menu.controller, action: menu.action) { g.message(code: menu.name, args: ['']) }
            out << '</li>'
        }
    }

    def renderErrorMessage = { attrs, body ->
        def model = attrs.model
        String fieldName = attrs.fieldName
        String errorMessage = attrs.errorMessage? g.message(code: attrs.errorMessage): g.message(code: "invalid.input")
        if (model && model.errors && model.errors.getFieldError(fieldName)){
            out << "<small class='form-text text-danger''><strong>${errorMessage}</strong></small>"
        }
    }


}
