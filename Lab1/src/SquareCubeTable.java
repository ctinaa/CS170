/** 
 * Cook, Christina
 * CS170-02
 * Lab One
 * 
 * Description: This is discover the square and cube of a particular number. 
 * It is customized to the idividual's preference as you can choose the starting and ending number. 
 * 
**/


import javax.swing.JOptionPane;

public class SquareCubeTable {
	
	public static void SquareCubeloop(){
		String start; 
		String end; 
		int total = 0; 
		
		
		start = JOptionPane.showInputDialog("Starting Number"); // Input box for the Starting Number 
		int startnum = Integer.parseInt(start); // converting string to an int 
		
		end = JOptionPane.showInputDialog("Ending Number"); // Input box for Ending Number 
		int endnum = Integer.parseInt(end); // converting string to an int 
		
		System.out.print("\n Number \tSquare  \tCube \n "); // printing the columns out 
		
		// building a for loop to how the number, square and cube results 
		for(int num = startnum; num <= endnum; num ++){
			total = num; 
			System.out.println("\n"+ total + "\t\t" + total * total + "\t\t" + total * total * total );
			
		}
	}
}

	


