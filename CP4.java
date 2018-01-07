
/**
 * Given an array of integers, find the first missing positive integer in linear time and constant space. 
 * In other words, find the lowest positive integer that does not exist in the array. 
 * The array can contain duplicates and negative numbers as well.
 */
public class CP4
{
    public static void main(String[] args){
        int[] input = {1,6,2,4,10,-2};
        System.out.println(BestSolution(input));
    }
    
    public static int BestSolution(int[] arr){
        int low=1;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]==low){
                low++;
            }
        }
        return low;
    }
}
