package Tasks;

public class Subset_Of_array {

    /** Find whether an array is a subset of another array
     Problem Description : Given two integer array A[] and B[] of size m
     and n(n <= m) respectively. We have to check whether B[] is a
     subset of A[] or not. An array B is a subset of another array A if
     each element of B is present in A. (There are no repeated
     elements in both the arrays)
     For example
     input : A[] = { 3, 5, 7, 12, 1, 9, 10, 0, 2 }, B[] = { 1, 3, 5, 9 }
     Output : True (B[] is subset of A[])
     Input : A[] = { 3, 5, 7, 12, 1, 9, 10, 0, 2 }, B[] = { 6, 3, 8 }
     Output: False (B[] is not a subset of A[]) **/

    public static void main(String[] args) {
        int A[] = { 3, 5, 7, 12, 1, 9, 10, 0, 2 };
        int B[] = { 1, 3, 5, 9 };
        System.out.println(Subset(A,B));
    }

    public static boolean Subset(int[] A, int[] B){

        boolean ans=true;
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (B[i] != A[j]){
                    ans=false;
                }else{
                    ans = true;
                    break;
                }
            }
        }
        return ans;
    }
}
