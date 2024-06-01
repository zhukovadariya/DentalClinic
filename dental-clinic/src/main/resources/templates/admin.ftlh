<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/static/css/personal_account.css">
    <title>Personal Account</title>
    <#include "components/allcss.ftlh">
</head>
<body>
<#include "components/navbar_admin.ftlh">
<p class="empty-line"></p>
<h1>Your personal account</h1>
    <div class="welcome-box">
        <h2>Welcome, Admin!</h2>
    </div>
    <div class="box">
        <h2>Appointments</h2>
            <a style="font-size: 18px" href="/admin/createAppointmentAdmin"><i class="fa-solid fa-plus"></i>   Create appointment</a>

            <a style="font-size: 18px" href="/admin/showAppointmentsAdmin"><i class="fa-solid fa-border-all"></i>   Show all appointments</a>

            <a style="font-size: 18px" href="/admin/deleteAppointmentAdmin"><i class="fa-solid fa-delete-left"></i>   Delete appointment</a>
    </div>

    <div class="box">
        <h2>Patients</h2>
            <a style="font-size: 18px" href="/admin/createPatientAdmin"><i class="fa-solid fa-plus"></i>   Create Patient</a>

            <a style="font-size: 18px" href="/admin/showPatientsAdmin"><i class="fa-solid fa-border-all"></i>   Show all Patients</a>

            <a style="font-size: 18px" href="/admin/updatePatientAdmin"><i class="fa-solid fa-pen-nib"></i>   Update Patient</a>

            <a style="font-size: 18px" href="/admin/deletePatientAdmin"><i class="fa-solid fa-delete-left"></i>   Delete Patient</a>
    </div>
</body>
</html>