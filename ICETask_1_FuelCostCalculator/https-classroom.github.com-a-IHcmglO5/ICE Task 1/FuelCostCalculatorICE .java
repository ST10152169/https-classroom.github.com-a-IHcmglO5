
package com.mycompany.fuelcostcalculatorice;

/**
 *
 * @ST10152169, Ryan Samuels,Gr 3.
 */
// Shaik(2026) rules that importing scanner allows for user to add input
   

//JOption Pane (Farrel,2023,pg 27)

import javax.swing.JOptionPane; 
import java.text.DecimalFormat;
// Shaik (2026) states that a public class serves as a blueprint for the program
public class FuelCostCalculatorICE {   
    
 // Shaik (2026) implies that this line is known as the method signiture for program
    public static void main(String[] args) {  
       
      //Main Method for Joption dialog boxes(Farrel,2023,pg 64)
      String distanceString;
      String fuelEfficiencyString;
      String fuelPriceString;
      
      //Decimal Format method line(Lambda, 2023)
      DecimalFormat fmt1=new DecimalFormat("#.##");
      
      //Declaring Variables
      double distance; 
      double fuelEfficiency;
      double fuelPrice;
      
      //Showing user input dialog boxes
      distanceString = JOptionPane.showInputDialog(null,"Distance(km)","Enter total trip distance (km): ",JOptionPane.INFORMATION_MESSAGE);
      fuelEfficiencyString =JOptionPane.showInputDialog(null,"Fuel Efficiency(Litres)","Enter Fuel Efficiency (L/km): ",JOptionPane.INFORMATION_MESSAGE);
      fuelPriceString = JOptionPane.showInputDialog(null,"Fuel Price(R)", "Enter fuel price per litre (R): ",JOptionPane.INFORMATION_MESSAGE);
      
      JOptionPane.showMessageDialog(null, "Distance(km): " +distanceString+" km"+ "| Fuel Efficiency(Litres): "+fuelEfficiencyString+ " L/km"+ "| Fuel price:R " +fuelPriceString);
      
      //Further classification of converting Strings (Farrel, 2023)
      distance= Double.parseDouble(distanceString);
      fuelEfficiency= Double.parseDouble(fuelEfficiencyString);
      fuelPrice=Double.parseDouble(fuelPriceString);
      
      //Fuel needed and Total Cost Calculations , calculation method adopted by (Farrel,2023)
      double fuelNeeded;
      fuelNeeded= distance/fuelEfficiency;
       
      JOptionPane.showMessageDialog(null,"Fuel needed: "+(fmt1.format(fuelNeeded))+"L");
      
      //Final Double used to indiacte final answer which is a constant that doesnt change value anymore
      final double totalCost;
      totalCost=fuelNeeded*fuelPrice;
      
      JOptionPane.showMessageDialog(null,"Total fuel cost :R "+(fmt1.format(totalCost)));
     
      
    }          
}


/*
Reference List:
1. Shaik,F., (2026),Emeris(distance learning).online lecture youtube lessons[Prog5121].nt[online via internal Virtual Learning(VLE),
The IndepenThe Indepedant Institute of Education.Available at: <https://www.youtube.com/playlist?list=PLDFRY8oCw2wDf5cS-Jg1DQb_aLoNnjIwX>
[Accessed Date 21 March 2026].
2.Farrel, J.,(2023),Java Programming Tenth Edition. Boston: Cengage.
3.Logic Lambda.,(2023),Using the Java DecimalFormat Class to Format Floating Point Values.Youtube Video.Available at:<https://www.youtube.com/watch?v=WgT7T6B5l8E>
*/