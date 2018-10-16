package bpl

class GroupController {

    GroupService groupService
    def index() {
        def response = groupService.list(params)
        [groupList: response.list, total:response.count]
    }
}
