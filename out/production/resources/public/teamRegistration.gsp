<meta name="layout" content="public"/>

<div class="card">
    <div class="card-header">
        Team Registration
    </div>
    <div class="card-body">
        <g:form controller="public" action="registerTeam">
            <div class="form-group">
                <label>Team Name *</label>
                <g:textField name="teamName" class="form-control" value="${team?.teamName}" placeholder="Please Enter Team Name"/>
                <UIHelper:renderErrorMessage fieldName="teamName" model="${team}" errorMessage="please.enter.first.name"/>
            </div>
            <div class="form-group">
                <label>Owner Name</label>
                <g:textField name="ownerName" class="form-control" value="${team?.ownerName}" placeholder="Please Owner Name"/>

            </div>
            <div class="form-group">
                <label>Email address *</label>
                <g:textField name="email" class="form-control" value="${team?.email}" placeholder="Please Enter Email"/>

            </div>
            <div class="form-group">
                <label>Contact Number *</label>
                <g:passwordField name="contact" class="form-control" value="${team?.contact}" placeholder="Please Enter Contact Number"/>

            </div>
            <g:submitButton name="registration" value="Registration" class="btn btn-primary"/>
            <g:link controller="public" action="panel" class="btn btn-primary"><g:message code="back.to.home"/></g:link>
        </g:form>
    </div>
</div>