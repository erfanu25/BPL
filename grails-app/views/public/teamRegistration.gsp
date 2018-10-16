<meta name="layout" content="public"/>

<div class="card">
    <div class="card-header">
        Team Registration
    </div>
    <div class="card-body">
<g:form controller="public" action="registerTeam">
        <g:render template="form"/>
    <div class="form-action-panel">
        <g:submitButton name="registration" value="Registration" class="btn btn-primary"/>
        <g:link controller="public" action="panel" class="btn btn-primary"><g:message code="back.to.home"/></g:link>
    </div>
</g:form>
    </div>
</div>