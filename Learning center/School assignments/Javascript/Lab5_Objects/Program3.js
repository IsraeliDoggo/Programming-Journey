// rank should be a number between 1 and 13, and suit between 0 and 3.
function displayCard(rank, suit) {
    switch ( rank) {
        case 1: rank = "A";
            break;       
        case 10: rank = "T";
            break;
        case 11: rank = "J";
            break;
        case 12: rank = "Q";
            break;
        case 13: rank = "K";
            break;
        default: if ( rank < 1 || rank > 13) {
            console.log("Bad rank value: " + rank);
        }    
    }    
    
    switch (suit) {
        case 0: suit = "♥";
            break;
        case 1: suit = "♦";
            break;
        case 2: suit = "♣";
            break;
        case 3: suit = "♠";
            break;
        default: console.log("Bad suit value: " + suit);
    }

    console.log("┌─────┐");
    console.log("│" + rank + suit + "   │");
    console.log("│ │");
    console.log("│   "   + rank + suit + "│");
    console.log("└─────┘");
}

// Displays random numbers between the min and the max
function getRandomNumber(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min
}


for (let i = 0; i < 10; i++) {
    // declares 2 variables that store a random rank and random suit
    randomRank = getRandomNumber(1, 13);
    randomSuit = getRandomNumber(0, 3);

    // displays card for random rank and suit
    displayCard(randomRank, randomSuit);
}
