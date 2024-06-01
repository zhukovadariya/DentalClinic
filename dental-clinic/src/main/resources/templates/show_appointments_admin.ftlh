<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/admin_crud.css">
    <title>Show appointment</title>
    <#include "components/allcss.ftlh">
</head>
<body>
<#include "components/navbar_admin.ftlh">
<div class="container">
    <div class="empty-line"></div>
    <h2>Appointments:</h2>

    <#if appointments?has_content>
        <table class="table">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Duration</th>
                <th>Date</th>
                <th>Price</th>
                <th>Payment method</th>
                <th>PATIENT'S INFORMATION</th>
            </tr>
            </thead>
            <tbody>
            <#list appointments as appointment>
                <tr>
                    <td>${appointment.id}</td>
                    <td>${appointment.procedureName.name}</td>
                    <td>${appointment.procedureName.duration}</td>
                    <td>${appointment.date}</td>
                    <td>${appointment.procedureName.price}</td>
                    <td>${appointment.paymentMethod}</td>
                    <td><i>ID:</i> ${appointment.patient.id}, <i>EMAIL:</i> ${appointment.patient.email},
                            <i>FIRST NAME:</i> ${appointment.patient.firstName}, <i>LAST NAME:</i> ${appointment.patient.lastName},
                                    <i>DATE OF BIRTH:</i> ${appointment.patient.dateOfBirth?string["yyyy-MM-dd"]}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    <#else>
        <p>There are no appointments in the list.</p>
    </#if>
</div>
</body>
</html>