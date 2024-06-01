<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/admin_crud.css">
    <title>Show Appointment</title>
    <#include "components/allcss.ftlh">
</head>
<body>
<#include "components/navbar_admin.ftlh">

<div class="container">
    <div class="empty-line"></div>
    <h2>Patients:</h2>

    <#if patients?has_content>
        <table class="table">
            <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Date of Birth</th>
                <th>Email</th>
            </tr>
            </thead>
            <tbody>
            <#list patients as patient>
                <tr>
                    <td>${patient.id}</td>
                    <td>${patient.firstName}</td>
                    <td>${patient.lastName}</td>
                    <td>${patient.dateOfBirth?string('dd.MM.yyyy')}</td>
                    <td>${patient.email}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    <#else>
        <p>There are no patients in the list.</p>
    </#if>
</div>
</body>
</html>