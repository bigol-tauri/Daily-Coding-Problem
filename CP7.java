
/**
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, 
 * count the number of ways it can be decoded. 
 * For example, the message '111' would give 3, 
 * since it could be decoded as 'aaa, 'ka', and 'ak'.
 */

import java.util.HashMap;

public class CP7
{
    public static void main(String[] args){
        System.out.println(solution("3925511233"));
    }
    
    public static int solution(String s){
        int ways = 1;
        for(int i = 0; i<s.length()-1; i++){
            if(Integer.parseInt(""+s.charAt(i)) == 1 || Integer.parseInt(""+s.charAt(i)) ==2){
                ways+= fibB(s.length()-1-i);
            }
        }
        return ways;
    }
    
    
    public static int fibB(int n){
        HashMap<Integer, Integer> dictionary = new HashMap<Integer, Integer>();
        dictionary.put(1, 1);
        dictionary.put(2, 1);
        return fibA(n, dictionary);
    }
    public static int fibA(int n, HashMap<Integer, Integer> d){
        if(d.containsKey(n)){
            return d.get(n);
        }
        else{
            int k = fibA(n-1, d) + fibA(n-2, d);
            d.put(n, k);
            return k;
        }
    }
}
