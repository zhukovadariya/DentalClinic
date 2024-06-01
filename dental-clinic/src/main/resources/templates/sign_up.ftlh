<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/sign_up.css">
    <title>Sign Ug Page</title>
    <#include "components/allcss.ftlh">
</head>
<body>
<div class="container p-5">
    <div class="row">
        <div class="col-md-4 offset-md-4">
            <div class="card paint-card">
                <div class="card-body">
                    <p class="fs-4 text-center">Sign Up</p>
                    <form action="/signUp" method="post" onsubmit="return validateForm()">
                            <div class="mb-3">
                                <label class="form-label">First name <span style="color:red">*</span></label> <input required
                                                                                                                     id="firstName"
                                                                                                                     name="firstName"
                                                                                                                     type="text"
                                                                                                                     class="form-control">
                            </div>

                            <div class="mb-3">
                                <label class="form-label">Last name <span style="color:red">*</span></label> <input required
                                                                                                                    id="lastName"
                                                                                                                    name="lastName"
                                                                                                                    type="text"
                                                                                                                    class="form-control">
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Date of birth<span style="color:red">*</span></label> <input required
                                                                                                                       id="dateOfBirth"
                                                                                                                       name="dateOfBirth"
                                                                                                                       type="date"
                                                                                                                       class="form-control">
                            </div>

                            <div class="mb-3">
                                <label class="form-label">Email address <span style="color:red">*</span></label> <input required
                                                                                                                        id="email"
                                                                                                                        name="email"
                                                                                                                        type="email"
                                                                                                                        class="form-control" >
                            </div>

                            <div class="mb-3">
                                <label class="form-label">Password <span style="color:red">*</span></label> <input required
                                                                                                                   id="password"
                                                                                                                   name="password"
                                                                                                                   type="password"
                                                                                                                   class="form-control" >
                                <input type="checkbox" onclick="myFunction()"> Show Password

                                <script>
                                    function myFunction() {
                                        var x = document.getElementById("password");
                                        if (x.type === "password") {
                                            x.type = "text";
                                        } else {
                                            x.type = "password";
                                        }
                                    }
                                </script>
                            </div>
                            <button type="submit" class="btn bg-primary text-white col-md-12">Register</button>
<#--                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">-->
                        </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="/static/js/validate_form.js"></script>

</body>
</html>