

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
        <label>Contact Number *</label>
        <g:textField name="contact" class="form-control" value="${team?.contact}" placeholder="Please Enter Contact Number"/>
    </div>

    <div class="form-group">
        <label>Email address *</label>
        <g:textField name="email" class="form-control" value="${team?.email}" placeholder="Please Enter Email"/>
    </div>




