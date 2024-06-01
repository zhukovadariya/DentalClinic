<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/procedure_list.css">
    <title>Procedure list</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <#include "components/allcss.ftlh">
</head>
<body>
<#include "components/navbar.ftlh">

<a style="font-size: 18px; color: #333333; text-align: center; background-color: #cccccc; text-decoration: none;
padding: 10px; border-radius: 5px; display: block; transition: all 0.3s ease;" href="/search">
    <i class="fa-solid fa-list" style="margin-right: 5px;"></i>Procedure Search
</a>
<p class="empty-line"></p>

<main>
    <section>
        <h2>Catalog of services</h2>
        <div class="boxes">
            <div class="box">
                <img src="static/img/tooth/tooth1.jpg" alt="procedure1">
                <p><strong>Treatment of pulpitis</strong></p>
                <p>Price: 5 000</p>
                <p>Duration: 20 minutes</p>
                <p>Doctor: Benjamin Taylor</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth2.jpg" alt="procedure2">
                <p><strong>Treatment of dental caries</strong></p>
                <p>Price: 4 000</p>
                <p>Duration: 30 minutes</p>
                <p>Doctor: Benjamin Taylor</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth3.jpg" alt="procedure3">
                <p><strong>Treatment of periodontitis</strong></p>
                <p>Price: 4 500</p>
                <p>Duration: 35 minutes</p>
                <p>Doctor: Benjamin Taylor</p>
            </div>

            <div class="box">
                <img src="static/img/tooth/tooth4.jpg" alt="procedure4">
                <p><strong>Installation of veneers</strong></p>
                <p>Price: 500 000</p>
                <p>Duration: 2 hours</p>
                <p>Doctor: Lucas Martin</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth5.jpg" alt="procedure5">
                <p><strong>Installation of "Star Smile" aligners</strong></p>
                <p>Price: 150 000</p>
                <p>Duration: 2 hours</p>
                <p>Doctor: Lucas Martin</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth6.jpg" alt="procedure6">
                <p><strong>Installing braces "Damon"</strong></p>
                <p>Price: 300 000</p>
                <p>Duration: 2 hours</p>
                <p>Doctor: Lucas Martin</p>
            </div>

            <div class="box">
                <img src="static/img/tooth/tooth7.jpg" alt="procedure7">
                <p><strong>Production of crowns from zirconium dioxide</strong></p>
                <p>Price: 50 000</p>
                <p>Duration: 1 hour</p>
                <p>Doctor: Emily Parker</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth8.jpg" alt="procedure8">
                <p><strong>Production of ceramic tabs</strong></p>
                <p>Price: 35 000</p>
                <p>Duration: 1 hour 15 minutes</p>
                <p>Doctor: Emily Parker</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth9.jpg" alt="procedure9">
                <p><strong>Manufacture of metal-ceramic crowns</strong></p>
                <p>Price: 40 000</p>
                <p>Duration: 45 minutes</p>
                <p>Doctor: Emily Parker</p>
            </div>

            <div class="box">
                <img src="static/img/tooth/tooth10.jpg" alt="procedure10">
                <p><strong>Tooth extraction surgery</strong></p>
                <p>Price: 50 000</p>
                <p>Duration: 1 hour</p>
                <p>Doctor: Samantha Lee</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth11.jpg" alt="procedure11">
                <p><strong>Plasmolifting</strong></p>
                <p>Price: 20 000</p>
                <p>Duration: 25 minutes</p>
                <p>Doctor: Samantha Lee</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth12.jpg" alt="procedure12">
                <p><strong>Plastic surgery of the frenulum of the tongue and lips</strong></p>
                <p>Price: 15 000</p>
                <p>Duration: 30 minutes</p>
                <p>Doctor: Samantha Lee</p>
            </div>

            <div class="box">
                <img src="static/img/tooth/tooth13.jpg" alt="procedure13">
                <p><strong>Bone grafting</strong></p>
                <p>Price: 75 000</p>
                <p>Duration: 2 hours</p>
                <p>Doctor: Jacob Brown</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth14.jpg" alt="procedure14">
                <p><strong>Sinus lifting</strong></p>
                <p>Price: 150 000</p>
                <p>Duration: 1 hour 25 minutes</p>
                <p>Doctor: Jacob Brown</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth15.jpg" alt="procedure15">
                <p><strong>Installation of dental implants</strong></p>
                <p>Price: 90 000</p>
                <p>Duration: 1 hour 55 minutes</p>
                <p>Doctor: Jacob Brown</p>
            </div>

            <div class="box">
                <img src="static/img/tooth/tooth16.jpg" alt="procedure16">
                <p><strong>Treatment of stomatitis</strong></p>
                <p>Price: 6 000</p>
                <p>Duration: 20 minutes</p>
                <p>Doctor: Olivia Davis</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth17.jpg" alt="procedure17">
                <p><strong>Correction of bite</strong></p>
                <p>Price: 10 000</p>
                <p>Duration: 30 minutes</p>
                <p>Doctor: Olivia Davis</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth18.jpg" alt="procedure18">
                <p><strong>Help with teething</strong></p>
                <p>Price: 1 500</p>
                <p>Duration: 20 minutes</p>
                <p>Doctor: Olivia Davis</p>
            </div>

            <div class="box">
                <img src="static/img/tooth/tooth19.jpg" alt="procedure19">
                <p><strong>Removal of dental stones</strong></p>
                <p>Price: 15 000</p>
                <p>Duration: 40 minutes</p>
                <p>Doctor: Grace Roberts</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth20.jpg" alt="procedure20">
                <p><strong>Sanitation of the oral cavity</strong></p>
                <p>Price: 10 000</p>
                <p>Duration: 35 minutes</p>
                <p>Doctor: Grace Roberts</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth21.jpg" alt="procedure21">
                <p><strong>Prosthetics of teeth</strong></p>
                <p>Price: 50 000</p>
                <p>Duration: 1 hour</p>
                <p>Doctor: Grace Roberts</p>
            </div>

            <div class="box">
                <img src="static/img/tooth/tooth22.jpg" alt="procedure22">
                <p><strong>Hygienic cleaning</strong></p>
                <p>Price: 25 000</p>
                <p>Duration: 25 minutes</p>
                <p>Doctor: Michael Johnson</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth23.jpg" alt="procedure23">
                <p><strong>Sealing of the chewing surface</strong></p>
                <p>Price: 15 000</p>
                <p>Duration: 20 minutes</p>
                <p>Doctor: Michael Johnson</p>
            </div>
            <div class="box">
                <img src="static/img/tooth/tooth24.jpg" alt="procedure24">
                <p><strong>Individual selection of oral hygiene and protection products</strong></p>
                <p>Price: 2 000</p>
                <p>Duration: 15 minutes</p>
                <p>Doctor: Michael Johnson</p>
            </div>

        </div>
    </section>
</main>
<#include "components/footer.ftlh">
</body>
</html>