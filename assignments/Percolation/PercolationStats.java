/***********************************************************************
 * Data Structures Assignment 1
 * 
 * Name: Your name
 * ID: Your student number
 * Course: Your programme 
 */
public class PercolationStats{

	
	public PercolationStats( int N, int T){
		// YOUR CODE HERE
	}

	public double mean(){
		// YOUR CODE HERE
		return 0;
	}
	
	public double stddev(){
		// YOUR CODE HERE
		return 0;
	}
	
	public double confidenceLo(){
		// YOUR CODE HERE
		return 0;
	}
	
	public double confidenceHi(){
		// YOUR CODE HERE
		return 0;
	}
	
	public static void main( String [] args){
		if (args.length != 2){
			System.out.println( "Usage: java PercolationStats <N> <T> \n");
			System.out.println( "where N is the size of the grid to use");
			System.out.println( "and T is the number of experiments to run");
			System.exit(1);
		}
		//int N = Integer.parseInt( args[0]);
		//int T = Integer.parseInt( args[1]);

		int N = 20;
		int T = 100;

		PercolationStats ps = new PercolationStats( N, T);
		
		System.out.println( "Mean: " + ps.mean());
		System.out.println( "Std Dev: " + ps.stddev());
		System.out.println( "95% confidence interval: " + ps.confidenceLo() + ", " + ps.confidenceHi());
	}
}
