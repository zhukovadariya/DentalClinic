function searchProcedures(procedureName) {
    let request = new XMLHttpRequest();

    request.open('GET', 'search/byName?procedureName=' + procedureName);

    request.onload = function() {
        if (request.status === 200) {
            let response = JSON.parse(request.response);
            let tableBody = document.getElementById('procedureRows');
            tableBody.innerHTML = '';

            for (let i = 0; i < response.length; i++){
                let row = tableBody.insertRow();
                let nameCell = row.insertCell();
                nameCell.appendChild(document.createTextNode(response[i]['name']));

                let priceCell = row.insertCell();
                priceCell.appendChild(document.createTextNode(response[i]['price']));
            }
        } else {
            alert('Error');
        }
    };

    request.send();
}