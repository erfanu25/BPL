package bpl

import grails.transaction.Transactional
import grails.web.servlet.mvc.GrailsParameterMap

@Transactional
class TeamService {

    GlobalConfigService globalConfigService

    def list(GrailsParameterMap params) {
        params.max = params.max?:globalConfigService.itemsPerPage()
        List<Team> teamList = Team.createCriteria().list(params) {
            if (params?.colName && params?.colValue){
                like(params.colName, "%" +  params.colValue + "%")
            }
            if (!params.sort){
                order("id","desc")
            }
        }
        return [list:teamList, count:Team.count()]
    }

    def get(Serializable id) {
        return Team.get(id)
    }

    def update(Team team, GrailsParameterMap params) {
        team.properties = params
        def response = AppUtil.saveResponse(false, team)
        if (team.validate()) {
            response.isSuccess = true
            team.save(flush:true)
        }
        return response
    }


    def delete(Team team) {
        try {
            team.delete(flush: true)
        } catch (Exception e) {
            println(e.getMessage())
            return false
        }
        return true
    }



}
