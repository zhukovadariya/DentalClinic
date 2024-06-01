document.getElementById('paymentMethod').addEventListener('change', function() {
    var insuranceField = document.getElementById('insuranceField');
    if (this.value === 'insurance') {
        insuranceField.style.display = 'block';
    } else {
        insuranceField.style.display = 'none';
    }
});
