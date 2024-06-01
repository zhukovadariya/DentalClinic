<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/procedure_list.css">
    <title>Procedure list</title>
    <#include "components/allcss.ftlh">
</head>
<body>
<#include "components/navbar.ftlh">

<div class="container">
    <div class="empty-line"></div>
    <h2>Your appointments:</h2>

    <#if appointments?has_content>
        <table class="table">
            <thead>
            <tr>
                <th>Name</th>
                <th>Duration</th>
                <th>Date</th>
                <th>Price</th>
                <th>Payment method</th>
            </tr>
            </thead>
            <tbody>
            <#list appointments as appointment>
                <tr>
                    <td>${appointment.procedureName.name}</td>
                    <td>${appointment.procedureName.duration}</td>
                    <td>${appointment.date}</td>
                    <td>${appointment.procedureName.price}</td>
                    <td>${appointment.paymentMethod}</td>
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