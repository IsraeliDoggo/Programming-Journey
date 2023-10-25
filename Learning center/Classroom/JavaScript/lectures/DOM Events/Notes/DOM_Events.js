/*      Intro DOM Events
    let inputs = document.querySelectorAll("input");

for (let i=0; i < inputs.length; i++) {
    let input = inputs[i];
    input.style.border = "1px solid red";

    input.addEventListener("focus", function() {
        this.style.border = "1px solid green";
    });

    input.addEventListener("blur", function() {
        this.style.border = "1px solid blue";
    });
}
*/

/*      Registering event handlers (part 1)
document.querySelector("#myButton").addEventListener("click", clickHandler);

function clickHandler() {
    alert("Hello There");
}
*/

/*      Registering event handlers (part 2)
window.addEventListener("DOMContentLoaded", loadedHandler);

function loadedHandler() {
    let textBox = document.querySelector("#name");
    textBox.addEventListener("keyup", keyupHandler);
}

function keyupHandler(event) {
    if(event.key == "Enter") {
        let textBox = event.target;
        alert("Hello, " + textBox.value + "!");
    }
}
*/

/*      Event Capturing and bubbling
list = document.getElementById("strikeList");

list.addEventListener("mouseover", function(e) {
    e.target.style.color = "red";
});

list.addEventListener("mouseout", function(e) {
    e.target.style.color = "black";
}, true);
*/

/*      Preventing Default Behavior

// stopPropagation() stops the event capturing and bubbling process

// Register event handlers
let passwordInput = document.querySelector("#password");
passwordInput.addEventListener("keydown", preventSpaces);
passwordInput.addEventListener("input", checkPassword);

function preventSpaces(event) {
    // Ignore space input
    if(event.key === " ") {
        event.preventDefault();
    }
}

function checkPassword() {
    let password = this.value;
    let passwordStrength = 0;

    // Password Should be long enough
    if (password.length >= 6) {
        passwordStrength++;
    }

    // Password should contain at least one uppercase letter
    if (password.toLowerCase() !== password) {
        passwordStrength++;
    }

    // Password should have at least one digit
    let containsDigit = false;
    for(let i=0; i < password.length; i++) {
        if(password[i] >= "0" && password[i] <= "9") {
            containsDigit = true;
        }
    }

    if(containsDigit) {
        passwordStrength++;
    }

    // Convert passwordStrength into a descriptive word
    let strengthWord = "weak";

    if(passwordStrength === 1) {
        strengthWord = "Stronger";
    }
    else if(passwordStrength == 2) {
        strengthWord = "Moderate";
    }
    else if (passwordStrength === 3) {
        strengthWord = "Strong";
    }

    //Display strengthWord
    document.querySelector("#strength").innerHTML = strengthWord;w
}
*/

