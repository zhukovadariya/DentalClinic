function validateForm() {
    // Получаем значения полей формы
    var name = document.getElementById('firstName').value.trim();
    var surname = document.getElementById('lastName').value.trim();
    var email = document.getElementById('email').value.trim();
    var password = document.getElementById('password').value.trim();

    // Регулярные выражения для проверки
    var nameRegex = /^[A-Z][a-z]+$/;
    var emailRegex = /^[A-Za-z0-9!#$%&'*+-.=?^_`{}½~]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;

    // Проверка имени и фамилии
    if (!nameRegex.test(name) || !nameRegex.test(surname)) {
        alert("The first and last name must consist of letters from A to Z (upper or lower case) without spaces!");
        return false;
    }

    // Проверка email
    if (!emailRegex.test(email)) {
        alert("Please enter a valid email address!");
        return false;
    }

    // Проверка длины пароля
    if (password.length < 3) {
        alert("The password must contain at least 4 characters!");
        return false;
    }

    // Проверка успешна
    return true;
}