//program to double a penny every day until the inputed day is reached

//takes input from the user
const days = prompt("Enter an amount of days: ");

//declares a variable to track the number of days its been for each for loop iteration
let numDays = 1;
//declares starting money
let money = 0.01;

console.log(`Days    Pennies\n\n------------------\n\n${numDays}         $${money}`); // displays the initial values.

//loops the program until i value reaches the amount of days inputed
//every iteration, i increases by 1
for(i = 1; i < days; i++){
    money *= 2; // doubles money value
    numDays += 1; // 

    console.log(`${numDays}         $${money}`); //outputs the current iterations results
}

//outputs the results
console.log(`After ${days} days, Your salary would be to $${money}.`);