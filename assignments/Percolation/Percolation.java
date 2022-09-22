/******************************************************************************
* Data Structures Assignment 1
*
* Name: YOUR NAME HERE
* ID: YOUR K NUMBER HERE
* Course: YOUR COURSE HERE
*
******************************************************************************/
public class Percolation{

	WeightedQuickUnionUF uf;
	
	public Percolation( int N){
		// YOUR CODE HERE
		uf = new WeightedQuickUnionUF(N*N);
	}

	public void open( int i, int j){
		// YOUR CODE HERE

	}
	
	public boolean isOpen( int i, int j){
		// YOUR CODE HERE
		return false;
	}
	
	public boolean isFull( int i, int j){
		// YOUR CODE HERE
		return false;
	}
	
	public boolean percolates(){
		// YOUR CODE HERE
		return false;
	}

	private void printArray2D(boolean [][] arr){
		for (int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(arr[i][j] == true)
					System.out.print("T ");
				else{
					System.out.print("F ");
				}
			}
			System.out.println();
		}
	}


	
	public static void main(String [] args){
	    int N = 5;
	    Percolation p4 = new Percolation(N);

	    p4.open(1,4);
	    p4.open(6,3);

deputydog
	    p4.isOpen(1,4);
	    p4.isOpen(2,3);


	    boolean [][] test = new boolean[5][5];
		p4.printArray2D(test);
		System.out.println();

		test[0][1] = true;
		p4.printArray2D(test);
		// 1 -> 5 		=>  0 -> N-1
	    
	}
}
