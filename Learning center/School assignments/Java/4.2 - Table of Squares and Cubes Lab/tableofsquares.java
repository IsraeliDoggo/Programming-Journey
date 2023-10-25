/*
 * tableofsquares.java - counting loop
 * 
 * Programmer: ALexander Bentley
 * Date: 10/8/2023
 */

public class tableofsquares {
    public static void main(String[] args) {

        // display the title at the top of the table
        System.out.printf ("Val Square Cube\n");

        // loops and displays the square and cube for val until 20.
        for (int val = 1; val <= 20; val++) {

            // declare square and cube variables
            double square = Math.pow(val, 2);   // squares the current val iteration
            double cube = Math.pow(val, 3);     // cubes the current val iteration
            
            // displays information
            System.out.printf ("%3d  %3.0f %5.0f\n", val, square, cube);
        }

    }

}
