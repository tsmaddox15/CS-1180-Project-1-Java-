/*
 * Project 1 for CS 1180
 * This program is designed to provide experience in using input & output statements.
 This program will promt the user to enter data from their workout to give 
 data back results on the workout.(example calories burned & and average speed)
 */
package cs1180_project1_taylormaddox;
import java.util.Scanner;
/**
 *
 * @author Taylor Maddox
 * CS 1180 L
 * Instructor: Heather Lingg
 * Ta: Sai Polamarasetty 
 */
public class CS1180_Project1_TaylorMaddox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
      
       //inputs
       System.out.println("This program calculates the distance traveld, rate ot travel, and calories burned by \ndoing three diffrent activities: walking, running, and bike.\nDistance and speed are presented based on both miles and kilometers.");
       System.out.println("Enter Name and weight: ");
       String name = keyboard.next();
       double weightPounds = keyboard.nextDouble();
       System.out.println("Enter length of walking stride in inches, number of strides and time in seconds: ");
       double strideWalking = keyboard.nextDouble();
       double numWalkingStrides = keyboard.nextDouble();
       double walkingSeconds = keyboard.nextDouble();
       System.out.println("Enter length of running stride in inches, number of strides, and time in seconds: ");
       double strideRunning = keyboard.nextDouble();
       double numRunningStrides = keyboard.nextDouble();
       double runningSeconds = keyboard.nextDouble();
       System.out.println("Enter radius of bicycle wheel in inchs, number of revolutions, and time in seconds: ");
       double bikeRadius = keyboard.nextDouble();
       double bikeRevolutions = keyboard.nextDouble();
       double bikeSeconds = keyboard.nextDouble();
       
       //Constants
       final double INCH_MILE =  1.57828e-5;
       final double MILE_KILO = 1.60934;
       final double SECOND_HOUR = 0.0002777780;
       final double POUND_KILO = 2.2046;
       final double METABOLIC_WALKING = 3.80;
       final double MEATBOLIC_RUNNING = 7.50;
       final double METABOLIC_BIKE = 9.00;
                    
               
       //Calcuations for distances
       double distanceWalkingM = ((strideWalking * numWalkingStrides) * INCH_MILE);
       double distanceRunningM = ((strideRunning * numRunningStrides) * INCH_MILE);
       double distanceBikeM = ((bikeRevolutions * (2 * Math.PI * bikeRadius)) * INCH_MILE);
       double distanceWalkingK = (distanceWalkingM * MILE_KILO);
       double distanceRunningK = (distanceRunningM * MILE_KILO);
       double distanceBikeK = (distanceBikeM * MILE_KILO);
      
       //Caculations for seconds to hours for walking and the speed of the walking exercise
       double walkingHour = ((walkingSeconds * SECOND_HOUR));
       double speedWalkingM = (distanceWalkingM / walkingHour);
       double speedWalkingK = (speedWalkingM * MILE_KILO);
       
       //Caculation for seconds to hours for running and the speed of the running exercise
       double runningHour = (runningSeconds * SECOND_HOUR);
       double speedRunningM = (distanceRunningM / runningHour);
       double speedRunningK = (speedRunningM * MILE_KILO);
       
        //Caculations for coverting seconds to hours and finding the average speed of the bike exercise
        double bikeHour = (bikeSeconds * SECOND_HOUR);
        double speedBikeM = (distanceBikeM / bikeHour);
        double speedBikeK = (speedBikeM * MILE_KILO);
        
        //Weight calculation and calculations for the calories burned in the different exercises
        double weightKilo = (weightPounds / POUND_KILO);
        double walkingCalories = ( weightKilo * METABOLIC_WALKING * walkingHour);
        double runningCalories = (weightKilo * MEATBOLIC_RUNNING * runningHour);
        double bikeCalories =(weightKilo * METABOLIC_BIKE * bikeHour);
        
       //Chart 
       System.out.print("\nActivity    Distance    Speed     Calories");
        System.out.print("\n          (miles) (km) (mph) (kph)");
            System.out.printf("\nWalking %8.2f%6.2f%6.2f%6.2f%8.2f", distanceWalkingM, distanceWalkingK, speedWalkingM, speedWalkingK, walkingCalories);
                System.out.printf("\nRunning %8.2f%6.2f%6.2f%6.2f%8.2f", distanceRunningM, distanceRunningK, speedRunningM, speedRunningK, runningCalories);
                    System.out.printf("\nBiking  %8.2f%6.2f%6.2f%6.2f%8.2f", distanceBikeM, distanceBikeK, speedBikeM, speedBikeK, bikeCalories);
                        
    }
    
}
