/**
 *
 * Cook, Christina
 * CS170-02
 * Lab One
 * 
 * Description: 
 * This is a program that converts from either Fahrenheit to Celsius, 
 * or Celsius to Fahrenheit. 
 * You are able to input any temperature wanted, 
 * and the program will show you the converted temperature. 
 */

import javax.swing.JOptionPane;

public class TempConverter {
  
	
  /* Function to convert Fahrenheit to Celsius */ 
  public void FtoC(double temp)
  { 
   // creating a type double to get the Celsius after converted 
   double convertedCelsius = (((temp - 32)*5)/9);
   
   //Showing the message in a box to show a neat conversion 
   JOptionPane.showMessageDialog(null, temp + " F" + " -> " + convertedCelsius + " C" );
  }
  
  /*Function to convert Celsius to Fahrenheit */ 
  public void CtoF(double temp)
  {   
      double convertedFahrenheit = (((temp * 9)/5)+32);
      JOptionPane.showMessageDialog(null,temp + " F" + "-> " + convertedFahrenheit + " F");       
  }
  
  
  public static void main(String[] args) {

  // creates new temporary converter
  TempConverter tc = new TempConverter();
  
  //setting variables 
    String str;
    String input;
    double temp;
    
  while (true) {
  //input data with the choice to convert from Fahrenheit or Celsius 
		  str = JOptionPane.showInputDialog(
		              "Please press for:  \n F - Fahrenheit to Celsius "
		              + "\n C - Celsius to Fahrenheit" + "\n N - to exit");
		  
		  // if statement that checks both lower and upper case for Fahrenheit
		  if (str.equalsIgnoreCase("F")){
		    input = JOptionPane.showInputDialog("Enter Temp"); //input Fahrenheit degree
		    temp = Double.parseDouble(input);	//convert string to double
		    tc.FtoC(temp);	//convert over to celsius in FtoC function 
		  }
		  
		  // else if that checks if they are choosing to convert to Celsius
		  else if (str.equalsIgnoreCase("C")) {	  
			input = JOptionPane.showInputDialog("Enter Temp"); // input Celsius degree 
			temp = Double.parseDouble(input); // convert string to double 
			tc.CtoF(temp); // convert over to fahrenheit in CtoF function 
		   }
		  
		  // if the person presses "n" regardless of lettercase, the program will stop running
		  else if (str.equalsIgnoreCase("N")) {
	            break;
	        }
		  
		  // else statement to check if they press something other than F, C, or N 
		  else{
		   System.out.println("Please try again. It didnt work");
		    }
		  
   	 }
  }
}