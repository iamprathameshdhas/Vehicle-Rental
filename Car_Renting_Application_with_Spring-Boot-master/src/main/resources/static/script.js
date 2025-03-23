document.addEventListener("DOMContentLoaded", function () {
    document.querySelector("form").addEventListener("submit", function (event) {
        let isValid = true;
 
        // Regex patterns
        const usernamePattern = /^[a-zA-Z0-9]{3,15}$/;
       // const passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
        // const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
        const phonePattern = /^\d{10}$/;
        const namePattern = /^[a-zA-Z]{2,20}$/; // For First Name, Last Name, and City
 
        // Get input fields
        const username = document.getElementById("username").value.trim();
        // const password = document.getElementById("password").value.trim();
        // const email = document.getElementById("email").value.trim();
        const phone = document.getElementById("phoneNumber").value.trim();
        const firstName = document.getElementById("firstName").value.trim();
        const lastName = document.getElementById("lastName").value.trim();
        const city = document.getElementById("city").value.trim();
 
        // Validate username
        if (!usernamePattern.test(username)) {
            alert("Username must be 3-15 characters long and contain only letters and numbers.");
            isValid = false;
        }
 
        // Validate password
//        if (!passwordPattern.test(password)) {
//            alert("Password must be at least 8 characters, include an uppercase letter, a lowercase letter, a digit, and a special character.");
//            isValid = false;
//        }
		
        // Validate email
        /*
		if (!emailPattern.test(email)) {
            alert("Invalid email format.");
            isValid = false;
        }
		*/
 
        // Validate phone number
        if (!phonePattern.test(phone)) {
            alert("Phone number must be exactly 10 digits.");
            isValid = false;
        }
 
        // Validate first name
        if (!namePattern.test(firstName)) {
            alert("First name must be 2-20 characters long and contain only letters.");
            isValid = false;
        }
 
        // Validate last name
        if (!namePattern.test(lastName)) {
            alert("Last name must be 2-20 characters long and contain only letters.");
            isValid = false;
        }
 
        // Validate city
        if (!namePattern.test(city)) {
            alert("City name must be 2-20 characters long and contain only letters.");
            isValid = false;
        }
 
        // Prevent form submission if validation fails
        if (!isValid) {
            event.preventDefault();
        }
    });
});