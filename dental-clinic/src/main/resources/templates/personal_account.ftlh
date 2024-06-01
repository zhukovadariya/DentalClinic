<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/static/css/personal_account.css">
    <title>Personal Account</title>
    <#include "components/allcss.ftlh">
</head>
<body>
<#include "components/navbar.ftlh">
<p class="empty-line"></p>
<h1>Your personal account</h1>

<div class="welcome-box">
    <p><strong>First Name:</strong> ${ user.getUser().firstName }</p>
    <p><strong>Last Name:</strong> ${ user.getUser().lastName }</p>
    <p><strong>Date of birth:</strong> ${ user.getUser().dateOfBirth?string["yyyy-MM-dd"] }</p>
    <p><strong>Email:</strong> ${ user.getUser().email }</p>
</div>

    <div class="boxes">
        <div class="box">
                <a style="font-size: 18px" href="/createAppointment">
                    <i class="fa-solid fa-calendar-check"></i> Make an appointment</a>
        </div>

        <div class="box">
            <h3>If you don't know about the available procedures yet,
                you can view the list of procedures and choose the one that is right for you!</h3>
                <a style="font-size: 18px" href="/procedureList">
                    <i class="fa-solid fa-list"></i> Procedure List</a>
        </div>

        <div class="box">
            <h3>You're appointments </h3>
                <a style="font-size: 18px" href="/patientAppointmentsList">
                    <i class="fa-solid fa-list"></i> Appointments List</a>
        </div>
    </div>
</body>
</html>