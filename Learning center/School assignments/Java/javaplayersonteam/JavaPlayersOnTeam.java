package javaplayersonteam;

/*
MaxPlayers - determine if there are not enough, too many
or just the right number of players on a team
Alexander Bentley
CIS084 Java Programming
September 24, 2023
*/

import java.util.Scanner;

public class JavaPlayersOnTeam {

    // variables
    static Scanner stdin; // still needs to be initialized as an object

    public static void main(String[] args) {
        int teamSize;
        int playersOnTeam;
        int morePlayersNeeded;
        int extraPlayers;
        // Create the Scanner object. Name it stdin
        stdin = new Scanner(System.in);
        // Input the data
        teamSize = SelectTeamSize();
        // use function shown below
        System.out.println("There should be " + teamSize + " players");
        System.out.print("How many players are currently on the team? ");
        playersOnTeam = stdin.nextInt();
        // Process and output
        if (playersOnTeam < teamSize) {
            System.out.println("There are not enough players");
            morePlayersNeeded = teamSize - playersOnTeam;
            System.out.println(morePlayersNeeded + " more players are needed");
        }

        else if (playersOnTeam > teamSize) {
            System.out.println("There are too many players");
            extraPlayers = playersOnTeam - teamSize;
            System.out.println(extraPlayers + " players need to be removed");
        } else {
            System.out.println("You have the correct number of players\n");
        }

    } // end of public static void main String[] args)

    //////////////////////////////////////////////////////////////
    // SelectTeamSize() is a function that returns the size of a
    // based on the user's selection of a team sport
    static int SelectTeamSize() {
        int teamSelection; // team selection entered at the keyboard 1-4
        int teamSize; // return # players that should be on a team

        do {
            // display a menu of team sports
            System.out.println("Select a professional sport");
            System.out.println("1 - NFL Football");
            System.out.println("2 - NBA Basketball");
            System.out.println("3 - MLB Baseball");
            System.out.println("4 - NHL Hockey");
            System.out.print("Select (1-4): ");
            teamSelection = stdin.nextInt();

            if (teamSelection == 1)
                teamSize = 53; // NFL
            else if (teamSelection == 2)
                teamSize = 13; // NBA
            else if (teamSelection == 3)
                teamSize = 25; // ML.B
            else if (teamSelection == 4)
                teamSize = 23; // NHL
            else {
                System.out.println("Illegal selection - try again");
                teamSize = 0; // error flag
            }

        } while (teamSize == 0); // loop until a valid selection is made

        return teamSize; // to be used by the main program
    } // end of static int SelectTeamSize()

} // end of class JavaPlayersOnTeam
