
/**
 * Given a list of integers, 
 * write a function that returns the largest sum of non-adjacent numbers.
 */
public class CP9
{
    public static void main(String[] args){
        int[] a = {5,1,3,2,9,9,7};
        System.out.println(solution(a));
    }
    public static int solution(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
		int[] maxes = new int[arr.length*2];
		int counter = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]==max){
				int max2 = Integer.MIN_VALUE;
        		for(int j = 0; j < arr.length; j++){
					
        		    if(arr[j] > max2 && Math.abs(j-i)>1){
        		        max2 = arr[j];
            		}
        		}
				int m1 = max + max2;
				if(i != 0 && i != arr.length-1){
            		int r = arr[i-1] + arr[i+1];
            		if(r > m1){
                		maxes[counter]=r;
            		}
					else{
						maxes[counter]=m1;
					}
        		}
				else{
					maxes[counter]=m1;
				}
				counter++;
			 }
		}
		
		int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < maxes.length; i++){
			if(maxes[i] > maxVal){
				maxVal = maxes[i];
			}
		}
        return maxVal;
    }
}
