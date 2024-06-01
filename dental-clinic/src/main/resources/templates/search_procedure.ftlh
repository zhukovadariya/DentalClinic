<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="/static/css/search.css">
    <title>Search Procedures</title>
    <#include "components/allcss.ftlh">
</head>
<body>
<#include "components/navbar.ftlh">

<main style="margin-left: 20px;">
    <div class="search-container">
        <h1>Live Search for Procedures</h1>
        <input type="text" id="searchInput" oninput="searchProcedures(this.value)" placeholder="Search for procedures...">
    </div>

    <table id="proceduresTable">
        <thead>
        <tr>
            <th>NAME</th>
            <th>PRICE</th>
        </tr>
        </thead>
        <tbody id="procedureRows">
        </tbody>
    </table>
</main>
<script src="/static/js/search.js"></script>

</body>
</html>