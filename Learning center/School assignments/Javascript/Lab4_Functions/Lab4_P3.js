let temp;

let degreeChoice = prompt("Converter\n--------------\n1.Celcius to Fahrenheit\n2.Fahrenheit to Celsius\nEnter choice (1 or 2) : ");
degreeChoice = parseFloat(degreeChoice);

if(degreeChoice === 1) {
    temp = prompt("Enter Celsius");
    celsiusToFahrenheit(temp);
}
else if(degreeChoice === 2) {
    temp = prompt("Enter Fahrenheit");
    fahrenheitToCelsius(temp);
}

function celsiusToFahrenheit() {
    const fahrenheit = (temp * 9/5) + 32;
    alert(temp + "°C is " + fahrenheit +"°F")

    return fahrenheit;
}

function fahrenheitToCelsius() {
    const celsius = ((temp - 32) * 5) / 9;
    alert(temp + "°F is " + celsius +"°C")

    return celsius;
}