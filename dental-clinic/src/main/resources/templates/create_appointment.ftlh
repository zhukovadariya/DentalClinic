<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/main.css">
    <title>Appointment Form</title>
    <#include "components/allcss.ftlh">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
<#include "components/navbar.ftlh">

    <div class="container">
        <div class="mt-5">
            <div class="card p-4">
                <h2>Appointment Form</h2>
                <div class="form-group">
                    <label for="procedure">Procedure:</label>
                    <select id="procedure" name="procedure">
                        <#list procedures as procedure>
                            <option value="${procedure.id}">${procedure.name}</option>
                        </#list>
                    </select>
                </div>

                <div class="form-group">
                    <label for="timeSlot">Date:</label>
                    <select id="timeSlot" name="timeSlot">
                        <#if timeSlots??>
                            <#list timeSlots as timeSlot>
                                <option value="${timeSlot.id}">${timeSlot.freeTime}</option>
                            </#list>
                        <#else>
                            <option value="" disabled selected>No dates available</option>
                        </#if>

                    </select>

                </div>

                <div class="form-group">
                    <label for="paymentMethod">Payment Method:</label>
                    <select id="paymentMethod" name="paymentMethod">
                        <option value="cash">Cash</option>
                        <option value="card">Bank card</option>
                        <option value="insurance">Insurance</option>
                    </select>
                </div>

                <div class="form-group" id="insuranceField" style="display: none;">
                    <label for="insuranceName">Insurance's number:</label>
                    <input type="text" id="insuranceName" name="insuranceName">
                </div>

                <button type="submit" class="btn btn-primary" id="btn-submit">Continue</button>
            </div>
            <script src="/static/js/time_slots.js"></script>
            <script src="/static/js/insurance_name.js"></script>
            <script>
                document.getElementById("btn-submit").addEventListener("click", function () {
                    const data = {
                        paymentMethod: document.getElementById("paymentMethod").value,
                        insuranceName: document.getElementById("insuranceName").value,
                        date: document.getElementById("timeSlot").value,
                        procedureName: document.getElementById("procedure").value
                    };

                    // Send the POST request using fetch
                    fetch('/createAppointment', {
                        method: 'POST',
                        headers: {
                            'Content-Type': 'application/json'
                        },
                        body: JSON.stringify(data)
                    })
                        .then(response => {
                            if (response.status === 200) {
                                alert('Success');
                            } else {
                                alert('Failed');
                            }
                        })
                        .catch(error => {
                            console.error('Error:', error);
                            alert('Failed');
                        });
                })
            </script>
        </div>
    </div>

</body>
</html>