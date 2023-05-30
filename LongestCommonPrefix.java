public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"abcd", "abcd", "abcd"};
        System.out.print(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] A) {
        int minLength = Integer.MAX_VALUE;
        int minLengthIndex = -1;
        for(int i = 0; i < A.length; i++) {
            if(A[i].length() < minLength) {
                minLength = A[i].length();
                minLengthIndex = i;
            }
        }

        System.out.print("minLength: "+minLength+", minLengthIndex: "+minLengthIndex);

        int maxPrefix = Integer.MAX_VALUE;
        String maxPrefixString = ""; 
        for(int k = 0; k < A.length; k++) {
            if(k != minLengthIndex) {
                int i = 0, j = 0;
                int count = 0;
                String str = "";
                while(i < A[k].length() && j < A[minLengthIndex].length()) {
                    if(A[k].charAt(i) == A[minLengthIndex].charAt(j)) {
                        count++;
                        str = str + A[k].charAt(i);
                    }
                    i++;
                    j++;
                }
                if(count < maxPrefix) {
                    maxPrefix = count;
                    maxPrefixString = str;
                }
            }
        }

        return maxPrefixString;
    }
}
