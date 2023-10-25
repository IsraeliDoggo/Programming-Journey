let str = prompt ("please enter a string: ");
wordFrenquency(str);

function wordFrenquency(str) {
    const arrWords = str.split(' ');

    // creates an empty object
    const wordCount = {};

    // counts each word in the array and stores each word once in wordCount
    for (let i = 0; i < arrWords.length; i++) {
        const word = arrWords[i];

        // if i's current place has a word not in the wordCount object, it will add the word and give is a value of one
        if (!wordCount[word]) {
            wordCount[word] = 1;
        }

        // if the word in wordCount is already there, adds one to count.
        else {
            wordCount[word]++;
        }
    }

    // goes through the object and displays the word with its count.
    for (const word in wordCount){
        console.log(word + " " + wordCount[word]);
    }
}