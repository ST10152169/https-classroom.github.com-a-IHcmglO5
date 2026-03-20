
package com.mycompany.fuelcostcalculatorice;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class FuelCostCalculatorICE {

    public static void main(String[] args) {
          
      String userInputs;
      double distance;
      Scanner inputDevice = new Scanner (System.in);
        System.out.print("Enter total trip distance (km): ");
      distance = inputDevice.nextDouble();
      double fuelEfficiency;
        System.out.print("Enter Fuel efficiency (km/litre): ");
      fuelEfficiency = inputDevice.nextDouble();
      double fuelPrice;
        System.out.print("Enter price per litre (R): ");
      fuelPrice =inputDevice.nextDouble();
       
        System.out.println("Distance: " + distance +"km" + " ,fuel efficiency: " + fuelEfficiency +"km/l " + ",fuel price per litre:R " + fuelPrice);      
        
    
    }
}
