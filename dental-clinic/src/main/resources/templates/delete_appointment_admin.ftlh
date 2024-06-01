<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/admin_crud.css">
    <title>Delete appointment</title>
    <#include "components/allcss.ftlh">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
<#include "components/navbar_admin.ftlh">
<p class="empty-line"></p>
<div class="container">
    <form action="/admin/deleteAppointmentAdmin" method="post" enctype="application/x-www-form-urlencoded" class="mt-5">
        <div class="card p-4">
            <h2>To delete select appointment's ID</h2>
            <div class="form-group">
                <label for="iddelete">Id:</label>
                <input type="text" class="form-control" id="iddelete" name="iddelete">
            </div>

            <button type="submit" class="btn btn-primary">Delete</button>
        </div>
<#--        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">-->
    </form>
</div>

</body>
</html>