<meta name="layout" content="main"/>

<div class="card">
    <div class="card-header">
        <g:message code="team" args="['List Of']"/>
        <span class="float-right">
            <div class="btn-group">
                <g:link controller="team" action="show" class="btn btn-primary"><g:message code="reload"/></g:link>
            </div>
        </span>
    </div>
    <div class="card-body">
        <table class="table table-bordered">
            <thead class="thead-dark">
            <tr>
                <g:sortableColumn property="teamName" title="${g.message(code: "team.name")}"/>
                <g:sortableColumn property="ownerName" title="${g.message(message: "Owner Name")}"/>

                <th class="action-row"><g:message code="action"/></th>
            </tr>
            </thead>
            <tbody>
            <g:each in="${team}" var="group">
                <tr>
                    <td>${group?.teamName}</td>
                    <td>${group?.ownerName}</td>

                    <td>
                        <div class="btn-group">
                            <g:link controller="team" action="edit" class="btn btn-secondary" id="${team.id}"><i class="fa fa-pencil fa-lg"></i></g:link>
                            <g:link controller="team" action="delete" id="${team.id}" class="btn btn-secondary delete-confirmation"><i class="fa fa-remove fa-lg"></i></g:link>
                        </div>
                    </td>
                </tr>
            </g:each>
            </tbody>
        </table>
        <div class="paginate">
            <g:paginate total="${total ?: 0}" />
        </div>
    </div>
</div>