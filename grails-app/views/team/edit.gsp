<meta name="layout" content="main"/>
<div class="card">
    <div class="card-header">
        <g:message code="team" args="['Update']"/>
    </div>
    <div class="card-body">
        <g:form controller="team" action="update">
            <g:hiddenField name="id" value="${team.id}"/>
            <g:render template="form"/>
            <div class="form-action-panel">
                <g:submitButton class="btn btn-primary" name="login" value="${g.message(code: "update")}"/>
                <g:link controller="team" action="show" class="btn btn-primary"><g:message code="cancel"/></g:link>
            </div>
        </g:form>
    </div>
</div>