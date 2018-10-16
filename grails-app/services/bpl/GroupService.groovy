package bpl

import grails.transaction.Transactional
import grails.web.servlet.mvc.GrailsParameterMap

@Transactional
class GroupService {

    GlobalConfigService globalConfigService

    def list(GrailsParameterMap params) {
        params.max = params.max?:globalConfigService.itemsPerPage()
        def groupList = Group.list()
        return [list:groupList, count:Group.count()]
    }
}
