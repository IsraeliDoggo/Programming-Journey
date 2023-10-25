/*
 * JavaSinCosTan.java - COUNTING LOOP
 *    Compute the sin and cos of angles 0 to 90 degrees in steps of 3 degrees
 * 
 * Programmer: Not me... :(
 */

public class SinCosTan {

    public static void main(String[] args) {
        
        // display a title at the top of the table
        System.out.printf ("Degrees  sin        cos        tan\n");
        
        // display sine, cosine, tangent every 3 degrees
        for (int degrees = 0; degrees <= 90; degrees += 3) {    // step size = 3°
            
           // trig functions work in radians 
           double radians = degrees/360.0 * 2.0 * Math.PI;
           double sin = Math.sin(radians);
           double cos = Math.cos(radians);
           double tan = Math.tan(radians);
           
           // no tangent value at 90° because it approaches infinity
           if (degrees < 90) {
                System.out.printf ("%4d%c  %8.6f   %8.6f   %8.6f\n", 
                degrees, '°', sin, cos, tan);
           }
           else {
                System.out.printf ("%4d%c  %8.6f   %8.6f\n", 
                degrees, '°', sin, cos);
           }
           
        } // end of for loop        

    } // end of main   

}  // end of class









