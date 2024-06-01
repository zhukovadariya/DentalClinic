<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/admin_crud.css">
    <title>Update appointment</title>
    <#include "components/allcss.ftlh">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
<#include "components/navbar_admin.ftlh">

<div class="container">
    <form action="/admin/updatePatientAdmin" method="post" enctype="application/x-www-form-urlencoded" class="mt-5">
        <div class="card p-4">
            <h2>To update select patient's ID and enter new values</h2>
            <div class="form-group">
                <label for="idupdate">Patient's ID:</label>
                <input type="text" class="form-control" id="idupdate" name="idupdate">
            </div>

            <div class="form-group">
                <label for="firstnameupdate">Patient's First name:</label>
                <input type="text" class="form-control" id="firstnameupdate" name="firstnameupdate">
            </div>

            <div class="form-group">
                <label for="lastnameupdate">Patient's Last name:</label>
                <input type="text" class="form-control" id="lastnameupdate" name="lastnameupdate">
            </div>

            <div class="form-group">
                <label for="dateofbirthupdate">Patient's date of birth:</label>
                <input type="date" class="form-control" id="dateofbirthupdate" name="dateofbirthupdate">
            </div>

            <div class="form-group">
                <label for="emailupdate">Patient's email:</label>
                <input type="email" class="form-control" id="emailupdate" name="emailupdate">
            </div>

            <div class="form-group">
                <label for="passwordupdate">Patient's password:</label>
                <input type="password" class="form-control" id="passwordupdate" name="passwordupdate">
            </div>

            <div class="form-group">
                <label for="stateupdate">Patient's state(ACTIVE or BANNED):</label>
                <input type="text" class="form-control" id="stateupdate" name="stateupdate">
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
<#--        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">-->
    </form>
</div>
</body>
</html>