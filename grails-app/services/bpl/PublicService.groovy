package bpl

import grails.transaction.Transactional
import grails.web.servlet.mvc.GrailsParameterMap

@Transactional
class PublicService {

    def registerTeam(GrailsParameterMap params){
        Team team = new Team(params)
        def response = AppUtil.saveResponse(false, team)
        if(team.validate()) {
            response.isSuccess = true
            team.save(flush: true)
        }

        return response
    }


}
