// Changed text to "Lab 6 DOM Manipulation"
document.querySelector("h1").innerHTML = "Lab 6 DOM Manipulation"; // the rubric says to change this to Welcome to DOM Manipulation but the instructions say to set the h1 element to this?

// makes background lightblue using querySelector
let p1 = document.querySelector("p").style.backgroundColor = "lightblue";

// creates a paragraph tag with the class para and has the text "I am a new paragraph"
let paragraphNode = document.createElement("p");    // creates a new p element
let textNode = document.createTextNode("I am a new paragraph"); // creates a new text node
paragraphNode.setAttribute("class", "newPara");     // gives the new p element a class of "newPara"
paragraphNode.appendChild(textNode);    //puts text node within the p element

// inserts paragraph below the sample paragraph
let newPara = document.querySelector("div").appendChild(paragraphNode);

// updates all the text with the tag "li"
let listItems = document.getElementsByTagName("li");
for(let i = 0; i < listItems.length; i++) {
    listItems[i].textContent = "Updated Text!";
}

// Changes the background color for the ordered list to light green
let list = document.querySelector("ol");
list.style = "background-color: lightgreen";