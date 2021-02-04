import java.util.Scanner;

public class StatisticsCalculator {

	public static void main(String[] args) {
		
		//Declare a Scanner object
		Scanner  input = new Scanner(System.in);
		
		//declare variables
		final int NUM_OF_COUNTS = 10;	//total number of iterations
		int count = 1;					//counter for iteration
		double number;					//store the input entered
		double squaredInput;			//square the input entered
		double total = 0;				//store the sum of inputs
		double totalSquared = 0;		//store the sum of squared inputs
		double mean;					//calculate mean
		double deviation;				//calculate standard deviation
		
		//Use while loop to ask the user to enter number 10 times
		while(count <= NUM_OF_COUNTS) {
			
			//Ask user to enter number
			System.out.print("Enter a number at " + count + ": ");
			number = input.nextDouble();		//store user's data in double variable number
			//get square of each value entered
			squaredInput = Math.pow(number, 2);
			count++;							//goto next count
			
			//Add the number input to total in-order to accumulate the total sum of number inputs
			total += number;
			//sum of each input squared
			totalSquared += squaredInput;
			
		}
		System.out.println("Total is: " + total + " Sqaured total is: " + totalSquared);
		
		//Calculate the Mean, (mean = total / number of counts)
		mean = total / NUM_OF_COUNTS;
		System.out.println("Mean is: " + mean);
		
		//squared mean inputs
		double SquaredInputmean = totalSquared / NUM_OF_COUNTS;
		System.out.println("Squared mean is: " + SquaredInputmean);
		
		//Solve equation inside the loop
		double insideEquation = SquaredInputmean - ((Math.pow(mean, 2)) / NUM_OF_COUNTS);
		
		//dive the inside equation
		double wholeEquationDivided = (insideEquation) / (NUM_OF_COUNTS - 1);
		
		//solve for standard deviation
		deviation = Math.pow(wholeEquationDivided, 0.5);
		
		//print out all result
		System.out.println("The standard deviation is " + deviation);
		

	}

}
