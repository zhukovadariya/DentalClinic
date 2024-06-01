<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/sign_in.css">
    <title>Sign In Page</title>
    <#include "components/allcss.ftlh">
</head>
<body>
<div class="container p-5">
    <div class="row">
        <div class="col-md-4 offset-md-4">
            <div class="card paint-card">
                <div class="card-body">
                    <p class="fs-4 text-center">Sign In</p>
                        <form action="/signIn" method="post" enctype="application/x-www-form-urlencoded">
                            <#if error??>
                                <h3>Wrong email or password! Try again.</h3>
                            </#if>
                            <div class="mb-3">
                                <label class="form-label">Email address</label> <input required
                                                                                       name="email"
                                                                                       type="email"
                                                                                       class="form-control">
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Password</label> <input required
                                                                                  name="password"
                                                                                  type="password"
                                                                                  class="form-control"
                                                                                  id="myInput">

                                <input type="checkbox" onclick="myFunction()"> Show Password
                            </div>
                            <button type="submit" class="btn bg-primary text-white col-md-12">Login</button>
                            <script src="/static/js/show_password.js"></script>
<#--                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">-->
                        </form>
                    <br> Don't have an account? <a href="/signUp"
                                                   class="text-decoration-none"> Create one</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>