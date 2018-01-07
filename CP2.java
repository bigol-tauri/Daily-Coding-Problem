
/**
 * Given an array of integers, return a new array such that:
 * each element at index i of the new array 
 * is the product of all the numbers in the original array
 * except the one at i. 
 * Solve it without using division and in O(n) time.
 */
public class CP2
{

	public static void main(String[] args){
	    int size = 5;
		int[] input = new int[size];
		
		//test with an array of random integers
		for(int i = 0; i<size; i++){
		    input[i] = (int)((Math.random()*7)-2);
		}
		for(int i : input){
			System.out.print(i + " ");
		}
		int[] output = WithoutDivisionSolution(input);
		System.out.println();
		for(int i : output){
			System.out.print(i + " ");
		}
	}

	//O(n)
	public static int[] WithDivisionSolution(int[] arr){
		int currentProduct=1;
		for(int i = 0; i < arr.length; i++){
			currentProduct*= arr[i];
		}
		for(int i = 0; i < arr.length; i++){
			arr[i] = currentProduct/i;
		}
		return arr;
	}
	
	//O(n)
	public static int[] WithoutDivisionSolution(int[] arr){
		int fProduct = 1;
		int bProduct = 1;
		int n = arr.length;
		
		int[] forwards = new int[n];
		int[] backwards = new int[n];
		int[] output = new int[n];
		
		
		for(int i = 0; i < n; i++){
			fProduct *= arr[i];
			forwards[i] = fProduct;
			bProduct *= arr[n-1-i];
			backwards[i] = bProduct;
		} 

		output[n-1] = forwards[n-2];
		output[0] = backwards[n-2];
		

		for(int i = 0; i < n-2; i++){
			output[i+1] = forwards[i] * backwards[n-3-i];
		}

		return output;
	}

}
