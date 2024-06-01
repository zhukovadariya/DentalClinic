<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/admin_crud.css">
    <title>Create Patient</title>
    <#include "components/allcss.ftlh">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
<#include "components/navbar_admin.ftlh">
<div class="container">
    <form action="/admin/createPatientAdmin" method="post" enctype="application/x-www-form-urlencoded" class="mt-5">
        <div class="card p-4">
            <h2>Create New Patient</h2>
            <div class="form-group">
                <label for="patientfirstname">First Name:</label>
                <input type="text" class="form-control" id="patientfirstname" name="patientfirstname">
            </div>

            <div class="form-group">
                <label for="patientlastname">Last Name:</label>
                <input type="text" class="form-control" id="patientlastname" name="patientlastname">
            </div>

            <div class="form-group">
                <label for="patientdateofbirth">Date of Birth:</label>
                <input type="date" class="form-control" id="patientdateofbirth" name="patientdateofbirth">
            </div>

            <div class="form-group">
                <label for="patientemail">Email:</label>
                <input type="email" class="form-control" id="patientemail" name="patientemail">
            </div>

            <div class="form-group">
                <label for="patientpassword">Password:</label>
                <input type="password" class="form-control" id="patientpassword" name="patientpassword">
            </div>

            <button type="submit" class="btn btn-primary">Create</button>
        </div>
<#--        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">-->
    </form>
</div>
</body>
</html>