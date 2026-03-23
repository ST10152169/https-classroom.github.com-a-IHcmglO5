
package com.mycompany.fuelcostcalculatorice;

/**
 *
 * @ST10152169, Ryan Samuels
 */
// Shaik(2026) rules that importing scanner allows for user to add input
import java.util.Scanner;   

//Decimal format import taught by Lambda(2023)
import java.text.DecimalFormat; 

//JOption Pane (Farrel,2023,pg 27)
import javax.swing.JOptionPane; 

// Shaik (2026) states that a public class serves as a blueprint for the program
public class FuelCostCalculatorICE {   
    
 // Shaik (2026) implies that this line is known as the method signiture for program
    public static void main(String[] args) {  
       
      //Main Method (Farrel,2023,pg 59)
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
       
      //Closing Scanner
      inputDevice.close();
        
      System.out.println("Distance: " + distance +"km" + " ;fuel efficiency: " + fuelEfficiency +"km/litre " + ";fuel price per litre:R " + fuelPrice);      
        
        DecimalFormat fmt1 =new DecimalFormat("#.##");
        
       //Arithmetic method for "fuelNeededCalculation" credited to (Farrel,2023)    
       String fuelNeededCalculation;  
       
        
        double fuelNeeded;
        double average;
        average = distance/fuelEfficiency;
        fuelNeeded=average;
        System.out.print(fmt1.format(average) + " Litres" + " is how much fuel is needed");
        
       // Arithmetic method for "TotalCostCalculation" credited to (Farrel,2023) 
       String TotalCostCalculation;         
        
        
        double totalCost;
        totalCost = fuelNeeded * fuelPrice;
        
        System.out.println(" and the total Cost for trip will then be " + "R"+ fmt1.format(totalCost));
        
        //(lambda,2023)
        System.out.println("R" +fmt1.format(totalCost)); 
        
        //(Farrel,2023,pg27)
        JOptionPane.showMessageDialog(null,"Total Cost for Trip: R" + fmt1.format(totalCost)); 
        
    }          
}


/*
Reference List:
1. Shaik,F., (2026),Emeris(distance learning).online lecture youtube lessons[Prog5121].nt[online via internal Virtual Learning(VLE),
The IndepenThe Indepedant Institute of Education.Available at: <https://www.youtube.com/playlist?list=PLDFRY8oCw2wDf5cS-Jg1DQb_aLoNnjIwX>
[Accessed Date 21 March 2026].
2.Farrel, J.,2023.Java Programming Tenth Edition. Boston: Cengage.
3.Logic Lambda.,(2023)Using the Java DecimalFormat Class to Format Floating Point Values.Youtube Video.Available at:<https://www.youtube.com/watch?v=WgT7T6B5l8E>
*/