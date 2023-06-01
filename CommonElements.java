import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] A = {2, 2};
        int[] B = {2, 2};
        int[] res = solve(A, B);

        for(int element: res) {
            System.out.print(element+ " ");
        }
    }
    
    public static int[] solve(int[] A, int[] B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
      
      HashMap<Integer, Integer> hmapA = new HashMap<Integer, Integer>();
      HashMap<Integer, Integer> hmapB = new HashMap<Integer, Integer>();
          
      for(int i = 0; i < A.length; i++) {
        if(hmapA.get(A[i]) == null) {
            hmapA.put(A[i], 1);
        }
        else {
            hmapA.put(A[i], hmapA.get(A[i]) + 1);
        }
      }
  
      for(int i = 0; i < B.length; i++) {
        if(hmapB.get(B[i]) == null) {
            hmapB.put(B[i], 1);
        }
        else {
            hmapB.put(B[i], hmapB.get(B[i]) + 1);
        }
      } 
      
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int element: hmapA.keySet()) {
        int bCount = hmapB.get(element) == null ? 0: hmapB.get(element);
        int aCount = hmapA.get(element);
        int minCount = Math.min(bCount, aCount);
        if(minCount != 0) {
            int j = 0;
            while(j < minCount) {
                list.add(element);
                j++;
            }
        }
      }
  
      int k = 0;
      int[] res = new int[list.size()];
      for(int element: list) {
          res[k] = element;
          k++; 
      }
  
      return res;
    }
}
