console.log("hello");
/* ==== WARM-UP SET 1 ====
Directions: Replace the blanks '__' for each of the `console.log()` statements below with comparison operators (>, <, >=, <=, ===, !==). 
The goal is to make each statement print a value of `true` to the console. 
Be sure to uncomment each statement before pressing the `run` button. 
Test each statement before moving on to the next one. 
Feel free to comment out any previous code if the console becomes crowded. 
(Helpful Tip: try to use a different comparison operator each time.) 
*/ 

console.log("hello");
/*
Example: 
console.log(45 __ 45)
*/
// Solution:
console.log(45 === 45)

console.log(-9 < 9)
console.log(100 != 100000)
console.log(5.6 > 5.5)
console.log("hello" >= "dog")
console.log("Danny" === "Danny")


/* ==== WARM-UP SET 2 ====
Directions: Replace the blanks '__' for each of the `console.log()` statements below with comparison operators (>, <, >=, <=, ===, !==). The goal is to make each statement print a value of `false` to the console. Be sure to uncomment each statement before pressing the `run` button. Test each statement before moving on to the next one. Feel free to comment out any previous code if the console becomes crowded. (Helpful Tip: try to use a different comparison operator each time.) 
*/

/*
Example: 
console.log(2 __ 10)
*/
// Solution:
console.log(2 > 10)
console.log(22 !== 22)
console.log( 0 < -5)
console.log(3.3 == 3.5)
console.log("frog" === "prince")


/* ==== EXERCISE 1 ====
Directions: Replace the blank after the word `if` with a conditional statement so that the 
lunch invitation is only printed if the variable `isHungry` is true.
 Change the boolean value of the isHungry variable to check and see if your conditional statement works. (Helpful Hint: Don't forget to uncomment the code below to test your conditional statement!)
*/
let isHungry = true;

if (isHungry == true) {
     console.log("Do you want to grab some lunch?");
}

/* ==== EXERCISE 2 ====
Directions: Begin by assigning the variable,`firstNumber` a positive or negative number.
Then, replace the blank after the word `if` with a conditional statement that tests to see if the number stored in the variable is positive or negative.  Make sure to change the value of `firstNumber` to ensure that your conditional statement works for (+) or (-) numbers! 

(Helpful Hint: Think of a number line (or Google it!). 
The number 0 is neither positive nor negative. If a number is greater than 0, then it is considered a positive number...)
*/

let firstNumber = 5;
if (firstNumber <= 0) {
        console.log("That number is negative!")
} 

else {
        console.log("That number is positive!")
}

/* ==== EXERCISE 3 ====
Directions: Begin by assigning the variable,`secondNumber` a random number. Then replace the blank with a conditional statement that tests to see if a number is even. Make sure to change the value of `secondNumber` to ensure that your conditional statement works for both even and odd numbers!

(Helpful Hint: The % (remainder or modulus) operator might be useful here. When an even number is divided by 2, the remainder is 0. Can the same be said about odd numbers?)
*/

let secondNumber = 22;
if (secondNumber % 2 == 0) {
        console.log("That number is even!")
} else {
        console.log("That number is odd!")
}
8


/* ==== EXERCISE 4 ====
Directions: Replace the blank below with a conditional statement that only adds a fee to the ticket price if the luggage weight is over 50 pounds. Update the console.log() statements by concatenating the variable `ticketPrice` to let the customer know the total price of their trip. Change the value of `luggageWeight` to check that all conditions work for the code below.
*/

let luggageWeight = 55
let ticketPrice = 150

if (luggageWeight >= 50) {
    ticketPrice += 20
    console.log("An extra $20.00 fee was added to the plane ticket for going over the maximum weight.")
} else {
    console.log("No extra fees, have a nice flight!")
}



/* ==== EXERCISE 5 ====
Directions: Begin by assigning the variable `carSpeed` a number. Replace the blanks with a conditional statement that prints the correct statement depending on the carSpeed that you input.

(Helpful Hint: Consider which logical operators would best help you compare `carSpeed` with the min or max speed limit values.)
*/ 

let carSpeed = 60;
const maximumSpeed = 70;
const minimumSpeed = 45;


if (carSpeed > maximumSpeed) {
    console.log("Slow down, you're speeding!")
} else if (carSpeed <= minimumSpeed) {
    console.log("Speed up, you're holding up traffic!")
} else {
    console.log("You are at a great speed, just keep driving.")
}



/* ==== EXERCISE 6: CHALLENGE ====
Write a conditional statement that mimics an automatic checkout machine at a store.

===== This example is pseudocode, but it describes what our challenge program should do! ======
if customerPayment is greater than the totalCheckoutCost, calculate the customer's change and print a statement like this:
        Your change is $3.25. Thank you for shopping with us today.
if customerPayment is less than the totalCheckoutCost, calculate the remaining balance and print a statement like this:
        There is still $2.75 remaining on your balance.
if customerPayment is equal to the totalCheckoutCost, print a statement wishing the customer a nice day like this:
        Thanks and have a nice day!

Helpful Hint:
- There are multiple conditions needed for this exercise. Consider using `else if` as shown in exercise 5.
- There is some arithmetic involved. A remaining balance must be calculated along with how much change is due to the customer.
*/

let customerPayment = 100;
let totalCheckoutCost = 100;


// write conditional statement below:

if (customerPayment > totalCheckoutCost){
        let change = customerPayment - totalCheckoutCost;
        change = (Math.round(100*change)/100).toFixed(2); 
        console.log("Your change is $" + change +". Thank you for shopping with us today.");
}
else if(customerPayment < totalCheckoutCost){
        let remainingBalance = totalCheckoutCost - customerPayment;
        remainingBalance = (Math.round(100*remainingBalance)/100).toFixed(2); 

        console.log("There is still $" + remainingBalance +" remaining on your balance.");
}
else{
        console.log("Thanks and have a nice day!");
}
