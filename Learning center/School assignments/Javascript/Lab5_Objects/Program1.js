// declares object "game"
let game = {
    // declares imbedded object "winner"
    winner: {
        name: "49ers",
        score: 17
    },
    
    // declares imbedded object "loser"
    loser: {
        name: "lions",
        score: 10
    },

    // creates method getMarginOfVictory
    getMarginOfVictory: function(){
        return this.winner.score - this.loser.score;
    },

    // creates method showSummary
    showSummary: function(){
        console.log(this.winner.name + ": " + this.winner.score);       // displays winner score
        console.log(this.loser.name + ": " + this.loser.score);         // displays loser score
        console.log("Margin of Victory: " + this.getMarginOfVictory()); // displays margin of victory
    }
};

// displays the summary
game.showSummary();
