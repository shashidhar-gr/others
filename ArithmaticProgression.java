public class ArithmaticProgression {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        System.out.print(solve(arr));
    }

    static int solve(int[] A) {
        if(A.length == 1)
            return 0;

        A = sort(A);

        int diff = A[1] - A[0]; 
        for(int i = 0; i < A.length-1; i++) {
            if(A[i] + diff != A[i+1]) {
                return 0;
            }
        }

        return 1;
    }

    static int[] sort(int[] A) {
        for(int i = 1; i < A.length; i++) {
            int j = i - 1;
            int key = A[i];

            while(j >= 0 && A[j] > key) {
                A[j+1] = A[j];
                j--;
            }

            A[j+1] = key;
        }

        return A;
    }

    static void print(int[] A) {
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
    }
}
