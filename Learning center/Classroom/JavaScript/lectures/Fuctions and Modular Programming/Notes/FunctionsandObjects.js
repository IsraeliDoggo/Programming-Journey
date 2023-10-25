//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////Basic Functions!!!!!!//////////////////////////////////////////////////////////////////////////////
/* 

    //declaring and calling functions.
    function displaySum(x, y, z) {
        let sum = x + y + z;
        console.log(sum);
    }

    displaySum(2, 3, 5);

/////////////////////////////////////////////////////////////////////////////

    //returnning a value
    function findAverage(num1, num2) {
        return (num1 + num2) /2;
    }

    console.log(findAverage(5, 10));

/////////////////////////////////////////////////////////////////////////////

    //function name is ommitted

    let twoNumAverage = function(x, y) {
        return (x + y) / 2;
    }

    let average = twoNumAverage(5, 7); // returns 6

////////////////////////////////////////////////////////////////////////////

    let areaOfTriangle = (x, y) => (x * y) / 2;

    let triangle = areaOfTriangle(3, 6);
    console.log(triangle);

///////////////////////////////////////////////////////////////////////////

    let square = x => x * x;

    console.log(square(5));


    let countCapitals = (str) => {

        let count = 0;
    
        for (let i = 0; i < str.length; i++) {
        let ch = str.charAt(i);
        
        if (ch >= 'A' && ch <= 'Z') {
            count++;
        }
        }       
        return count;
    }

    let str = "ComE On EiLine";

    let capitalCount = countCapitals(str);

    console.log(capitalCount);

    let twoNumAverage = function(x, y) {
        return (x + y) / 2;
    }

    let average = twoNumAverage(5, 7); // returns 6

    let areaOfTriangle = (x, y) => (x * y) / 2;

    let triangle = areaOfTriangle(3, 6);
    console.log(triangle);

*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////Objects!!!!!///////////////////////////////////////////////////////////////////////////////////////
/*

    // creating the 'book' object literal
    let book = {

        // object properties
        title: "Outliers",
        published: 2011,
        keywords: ["success", "high-achievers"],
        
        // imbedded object 'author'
        author: {
            firstName: "Malcolm",
            lastName: "Gladwell"
        }
    };

    console.log(book.title);
    console.log(book.keywords[0]);

    console.log(book.author.lastName);

//////////////////////////////////////////////////////////////////////////////////////////////// Defining a method

    let book = {
        title: "Quiet",
        author: {
            firstName: "Susan",
            lastName: "Cain"
        },

        // define a method
        getAuthorName: function() {
            return this.author.firstName + " " + this.author.lastName;
        }
    };

    let name = book.getAuthorName();

//////////////////////////////////////////////////////////////////////////////////////////////// Accessor Properties

    // Accessor Properties
    let rectangle = {
        width: 5,
        height: 8,

        // getter retrieves objects property
        get area() {
            return this.width * this.height;
        },
        
        // setter sets a value to object property
        set area(value) {
            //set width and height to the square root of the value
            this.width = math.sqrt(value);
            this.height = this.width;
        }
    };

    let area = rectangle.area;  // calling getter and returns the area 40

    rectangle.area = 100;       // calling setter and sets the width and height to 10

    console.log(rectangle.width)// returns width 10

//////////////////////////////////////////////////////////////////////////////////////// Passing objects to functions

    // Passing objects to functions
    function changeThings (x, y, z) {
        x = 33;
        y.width = 20;
        z = {
            title: "The Hunger Games",
            author: "Suzanne Collins"
        };
    }

    // primitive type
    let level = 5;

    // object
    let rectangle = {
        width: 3,
        height: 16
    };

    // object
    let book = {
        title: "Twilight",
        author: "Stephanie Meyer"
    };

    //changes the rectangle value
    changeThings(level, rectangle, book);

    console.log(level);
    console.log(rectangle.width);
    console.log(book.title);

*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////Objects as Maps!!!/////////////////////////////////////////////////////////////////////////////////
/*

    // State capitals in an object map
    let stateCapitals = {
        AR: "Little Rock",
        CO: "Denver",
        NM: "Sante Fe"
    };

    console.log("CO capital is " + stateCapitals["CO"]);

    //adds capital 'Austin' to new element 'TX'
    stateCapitals["TX"] = "Austin";

////////////////////////////////////////////////////////////////////////////////////////////For-in Loop!!!

    ////////////////////////////////
    // for(let variable in object) {
    //     body
    // }

    // Looping through an object map
    let stateCapitals = {
        AR: "Little Rock",
        CO: "Denver",
        NM: "Sante Fe"
    };

    console.log("All capitals:");


    // for-in statements good for looping through object map's elements.
    for (let state in stateCapitals) {
        console.log(state + " is " + stateCapitals[state]);
    }

/////////////////////////////////////////////////////////////////////////////////////////Map object!!! 

    let stateCapitals = {
        AR: "Little Rock",
        CO: "Denver",
        NM: "Sante Fe"
    };

    let states = Object.keys(stateCapitals);    // keys() returns an array of an object's property names

    console.log(states);                        // AR, CO, NM
    console.log(states.length);                 // 3

    //evaluates true
    if("NM" in stateCapitals) {
        console.log("NM exists");
    }

    delete stateCapitals["NM"];                 // removes the NM/Sante Fe pair

    //outputs undefined
    console.log(stateCapitals["NM"]);

    // I fucking hate my teacher

    let contacts = {
        Rosa: {
        phone: "303-555-4321",
        email: "rosa@gmail.com"
        },

        Dave: {
        phone: "501-533-9988",
        email: "dave@yahoo.com"
        },

        Li: {
        phone: "213-511-6758",
        email: "li@msn.com"
        }
    };

    for (let name in contacts) {
        let email = contacts[name].email;
        
        
        if(email.includes("msn")) {
            console.log(name)
        }
        console.log(email)
    }


*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////String Object!!!!//////////////////////////////////////////////////////////////////////////////////
/*

    let s = "I Love JS";    // declares s as a string
    let totalSpaces = 0;    // tracks the amount of white-spaces


    // parses the string while i is less than the string length
    for(let i = 0; i < s.length; i++) {
        // if if the char at i is a white space, adds 1 to total spaces
        if (s.charAt(i) === " "){
            totalSpaces++;
        }
    }

    // outputs results
    console.log(totalSpaces + " Spaces");


    // searching for a string with indexOf() and lastIndexOf()
    let s = "Seek and you will find.";

    s.indexOf("And");   // 5
    s.indexOf("e");      // e (first occurrence)
    s.lastIndexOf("e");  // 2 (last occurrence)
    s.indexOf("SEEK");   // -1 (case-sensitive search)


    // replacing a string with replace()'
    let s = "Seek and you will find";

    s = s.replace("find", "discover");   // "Seek and you will discover"
    s = s.replace("Seek", "Search");     // "Search and you will discover"
    s = s.replace("SEARCH", "search");   // No change (case-sensitive search)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////// Other String Methods
/*
    // substr() - returns the substring between two idices, not including the second index
    s = "As you wish."

    s.substring(3, 6);  // "you"
    s.substring(3); // "you wish." (2nd index optional)

    // split() - returns an array of strings formed by splitting the string into substrings. The given delimiter separates substrings.
    s = "As you wish";

    s.split(" "); // ["As", "you", "wish."]

    // toLowerCase() - Returns the string converted to lowercase characters.
    s = "WHAT!";
    s.toLowerCase() // "what?"

    // toUpperCase() - Returns the sring converted to uppercase characters.
    s = "what!";
    s.toUpperCase() // "WHAT?"

    // trim() - returns the string with leading and trailing whitespace removed.
    s = " test ";
    s.trim(); //"test"

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////Template Literals
/*

    // template literal is a string literal enclosed by the back-tick (`) that alllows embedding expressions with a dollar sign and braces (${expression}).
    x = 2;
    y = 3;

    result = x + " * " + y + " = " + (x * y);
    console.log(result);

    result = `${x} * ${y} = ${x * y}`;
    console.log(result);

    console.log(`line 1 
    line 2`);

*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////Date Object!!!!////////////////////////////////////////////////////////////////////////////////////
/*

    // Constructor - a function that creates an instance of an object

    // Date object constructor
    let currDateTime = new Date();
    console.log(currDateTime);

    let oneSecPastEpoch = new Date(1000);
    console.log(oneSecPastEpoch);

    // Feb 22, 1732
    let georgeBirthday = new Date(1732, 1, 22);
    console.log(georgeBirthday);

    // Oct 21, 2035 at 7:28:00
    let theFuture = new Date(2035, 9, 21, 7, 28, 0);
    console.log(theFuture);

///////////////////////////////////////////////////////////////////////////////////////////// Date Methods

    // getDate() - gets the date relative to the current set month
    // setDate() - sets the day relative to the current set month
    let day = new Date(2016, 0, 30);

    day.getDate();  // 30
    day.setDate(21); // 30 -> 21

    // getDay() - returns the day of the week (0-6)
    let day = new Date(2016, 0, 30);

    day.getDay();   // 6 = saterday

    // getFullYear() - gets the 4 digit year
    // setFullYear() - sets the 4 digit year

    let day = new Date(2016, 0, 30);

    day.getFullYear();  // 2016
    day.setFullYear(2017);  // 2016 -> 2017

    // getHours() - gets the hour (0-23)
    // setHours() - sets the hour (0-23)

    let day = new Date(2016, 0, 30);

    day.getHours(); // 5
    day.setHours(2) // 5 -> 2

    // getMilliseconds() - gets the milliseconds (0-999)
    // setMilliseconds() - sets the milliseconds (0-999)

    let day = new Date(2016, 0, 1, 5, 20, 10, 250)

    day.getMilliseconds();      // 250
    day.setMilliseconds(500);   // 250 -> 500

    // getMinutes() - gets the minutes (0-59)
    // setMinutes() - sets the minutes (0-59)

    let day = new Date(2016, 0, 30, 5, 20);

    day.getMinutes();   // 20
    day.setMinutes(35); // 20 -> 35

    // getMonth() - gets the month (0-11)
    // setMonth() - sets the month (0-11)

    let day = new Date(2016, 0, 30, 5, 20);

    day.getMonth();     // 0
    day.setMonth(3);    // 0(Jan) -> 3(Apr)

    // getSeconds() - gets the seconds (0-59)
    // setSeconds() - sets the seconds (0-59)

    let day = new Date(2016, 0, 1, 5, 20, 10, 250);

    day.getSeconds();   // 10
    day.setSeconds(45)  // 10 -> 45

    // getTime() - gets the number of milliseconds since jan 1, 1970, 00:00:00 UTC
    // setTime() - sets the number of milliseconds since jan 1, 1970, 00:00:00 UTC

    let day = new Date(2016, 0, 30, 5, 20);

    day.getTime();                  // 1454152800000
    day.setTime(1454152800000);     // Sat Jan 30 2016 05:35:00 GMT-0600

*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////Math Object!!!!////////////////////////////////////////////////////////////////////////////////////
/*
//////////////////////////////////////////////////////////////////////////////////////////////////// Math Properties

    // Math.PI - Value of π, approximately 3.142 (π is the ratio of a circle's circumference to the circle's diameter)
    // Math.E - Euler's number, approximately 2.718 (Euler's number is the base of natural logarithms)
    // Math.LN2 - Natural logarithm of 2, approximately 0.693 (Math.LN10 is the natural log of 10)
    // Math.LOG10E - Base 10 Logarithm of E, approximately 0.434 (Math.LOG2E is the base 2 log of E)
    // Math.SQRT2 - Square root of 2, approximately 1.414 (Math.SQRT1_2 is the square root of 1/2)

////////////////////////////////////////////////////////////////////////////////////////////////// Math Methods

    // abs(x) - Returns the absolute value of x
    Math.abs(-5)    // 5

    // ceil(x) - Returns x rounded up to the nearest integer
    Math.ceil(2.1)  // 3

    // cos(x) - Returns the cosine of the radians x
    Math.cos(Math.PI)   // -1

    // floor(x) - Returns x rounded down to the nearest integer
    Math.floor(2.9) // 2

    // log(x) - returns the natural logarithm of x
    Math.log(Math.E)    // 1

    // max(n1, n2, n3, ...) - Returns the largest number
    Math.max(5, 2, 8, 1)    // 8
    
    // min(n1, n2, n3, ...) - Returns the smallest number
    Math.min(5, 2, 8, 1)    // 1

    // pow (x, y) - Returns x to the power of y
    Math.pow(2, 3)      // 8

    // round(x) - Returns x rounded to the nearest integer
    Math.round(3.5)     // 4
    
    // sin(x) - Returns the sine of radians x
    Math.sine(Math.PI)      // 0

    // sqrt(x) - Returns the square root of x
    Math.sqrt(25)       // 5

    // tan(x) - Returns the tangent of radians x
    Math.tan(Math.PI / 4)       // 1

/////////////////////////////////////////////////////////////////////////////////////////////////// Producing random numbers

    // Math.random() - Returns a pseudo-random number >= 0 and < 1
    // A pseudo-random number is a number generated by an algorithm that approximates randomness, but is not truly random.

    // Display 5 random numbers with Math.random()
    for (let i = 0; i < 5; i++) {

        console.log(Math.random());

    }

    // Display five random numbers between 1 and 10

    function getRandomNumber(min, max) {
        return Math.floor(Math.random() * (max - min + 1)) + min
    }

    for (let i = 0; i < 5; i++) {
        console.log(getRandomNumber(1, 10));
    }
*/
