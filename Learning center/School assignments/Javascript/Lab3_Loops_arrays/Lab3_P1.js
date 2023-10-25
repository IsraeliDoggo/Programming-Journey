//declares two arrays, one for usernames, and the other for passwords
let usernames = ["smith",  "tron",      "ace",      "ladyj",    "anon"];
let passwords = ["qwerty", "EndOfLine", "year1942", "ladyj123", "PASSWORD"];

// prompts user for a username input and password input and stores the variable
let userAttempt = prompt("Enter the Username: ");
let passwordAttempt = prompt("Enter the Password: ");

//searches the arrays for the username inputed from prompt
userGuess = usernames.indexOf(userAttempt);
passGuess = passwords.indexOf(passwordAttempt);

//if the userGuess and PassGuess are found within the array, the indexOf will return a 1, otherwise, it will run the else statement.
if(userGuess >= 0 && passGuess >= 0){
    console.log(`Username "${userAttempt}" and/or password "${passwordAttempt}" found. Access Granted`);
}
else{
    console.log(`Username "${userAttempt}" and/or password "${passwordAttempt}" not found. Access Denied.`)
}