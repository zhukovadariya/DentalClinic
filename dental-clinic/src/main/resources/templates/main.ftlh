<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/main.css">
    <title>Main Page</title>
    <#include "components/allcss.ftlh">
</head>
<body>
<#include "components/navbar.ftlh">
<div id="carouselExampleFade" class="carousel slide carousel-fade" data-bs-ride="carousel">
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="static/img/clinic/clinic1.jpg" class="d-block w-100" alt="...">
        </div>
        <div class="carousel-item">
            <img src="static/img/clinic/clinic2.jpeg" class="d-block w-100" alt="...">
        </div>
        <div class="carousel-item">
            <img src="static/img/clinic/clinic6.png" class="d-block w-100" alt="...">
        </div>
        <div class="carousel-item">
            <img src="static/img/clinic/clinic7.jpg" class="d-block w-100" alt="...">
        </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>
</div>

<div class="container p-3">
    <p class="text-center fs-2 ">Key Features of our Dental Clinic</p>
    <div class="row">
        <div class="col-md-8 p-5">
            <div class="row">
                <div class="col-md-6">
                    <div class="card paint-card">
                        <div class="card-body">
                            <p class="fs-5">100% Safety</p>
                            <p>We attach great importance to the safety of our patients. All our doctors and medical staff undergo mandatory training on compliance with hygiene and safety standards. We use only high-quality materials and tools to ensure the safety and comfort of our patients.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="card paint-card">
                        <div class="card-body">
                            <p class="fs-5">High-quality equipment</p>
                            <p>In the clinic, we use modern equipment that allows for accurate diagnosis and effective dental treatment. Our equipment meets all medical standards and provides a high level of service quality. Every year we purchase certified equipment and tools from Germany.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 mt-2">
                    <div class="card paint-card">
                        <div class="card-body">
                            <p class="fs-5">Friendly Doctors</p>
                            <p>Our doctors are highly qualified specialists with many years of experience. They constantly improve their skills and monitor the latest technological and medical advances in the field of dentistry. Our doctors have excellent communication skills with patients and are always ready to help you with any dental problems.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 mt-2">
                    <div class="card paint-card">
                        <div class="card-body">
                            <p class="fs-5">Affordable prices</p>
                            <p>We strive to make dental care accessible to everyone. Therefore, we offer various treatment and payment programs, as well as work with various insurance companies. We are sure that dental health should not be a luxury, so we do our best to make our services available to everyone.  In our dentistry there are a huge number of benefits.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-4">
            <img alt="" src="static/img/colum.jpg" style="position: relative; top: 99px;">
        </div>
    </div>
</div>
<hr>
<div class="container p-2">
    <p class="text-center fs-2 ">Our Team</p>
    <div class="row">
        <div class="col-md-3">
            <div class="card paint-card">
                <div class="card-body text-center">
                    <img src="static/img/doctor/doctor1.jpg" width="250px" height="300px" style="position: relative; right: 10px;">
                    <p class="fw-bold fs-5">Benjamin Taylor</p>
                    <p class="fs-7">Dentist-therapist</p>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card paint-card">
                <div class="card-body text-center">
                    <img src="static/img/doctor/doctor2.jpg" width="250px" height="300px" style="position: relative; right: 10px;">
                    <p class="fw-bold fs-5">Lucas Martin</p>
                    <p class="fs-7">Dentist-orthodontist</p>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card paint-card">
                <div class="card-body text-center">
                    <img src="static/img/doctor/doctor3.jpg" width="250px" height="300px" style="position: relative; right: 10px;">
                    <p class="fw-bold fs-5">Emily Parker</p>
                    <p class="fs-7">Orthopedic dentist</p>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card paint-card">
                <div class="card-body text-center">
                    <img src="static/img/doctor/doctor4.jpg" width="250px" height="300px" style="position: relative; right: 10px;">
                    <p class="fw-bold fs-5">Samantha Lee</p>
                    <p class="fs-7">Dentist-surgeon</p>
                </div>
            </div>
        </div>
        <p class="empty-line"></p>
        <div class="col-md-3">
            <div class="card paint-card">
                <div class="card-body text-center">
                    <img src="static/img/doctor/doctor5.jpg" width="250px" height="300px" style="position: relative; right: 10px;">
                    <p class="fw-bold fs-5">Jacob Brown</p>
                    <p class="fs-7">Implantologist</p>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card paint-card">
                <div class="card-body text-center">
                    <img src="static/img/doctor/doctor6.jpg" width="250px" height="300px" style="position: relative; right: 10px;">
                    <p class="fw-bold fs-5">Olivia Davis</p>
                    <p class="fs-7">Pediatric Dentist</p>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card paint-card">
                <div class="card-body text-center">
                    <img src="static/img/doctor/doctor7.jpg" width="250px" height="300px" style="position: relative; right: 10px;">
                    <p class="fw-bold fs-5">Grace Roberts</p>
                    <p class="fs-7">Dentist-periodontist</p>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="card paint-card">
                <div class="card-body text-center">
                    <img src="static/img/doctor/doctor8.jpg" width="250px" height="300px" style="position: relative; right: 10px;">
                    <p class="fw-bold fs-5">Michael Johnson</p>
                    <p class="fs-7">Dental hygienist</p>
                </div>
            </div>
        </div>
    </div>
</div>
<#include "components/footer.ftlh">
</body>
</html>