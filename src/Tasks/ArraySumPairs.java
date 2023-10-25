package Tasks;

public class ArraySumPairs {



        public static void main(String[] args) {

            /**1. Check for pair in an array with a given sum
             Problem Description: Given an array of n integers and given a
             number K, determines whether there is a pair of elements in the
             array that sums to exactly K.
             For example :
             Input : A[] = [-5, 1, -40, 20, 6, 8, 7 ], K=15
             Output: true ( 7, 8 and -5, 20 are the pairs with sum 15)
             Input : A[] = [-5, 4, -2, 16, 8, 9], K=15
             Output: false (There is no pair of elements whose sum is equal to
             15)**/

            int[] arr={-5, 4, -2, 16, 8, 9};
            int k=15;

            for (int i=0;i<arr.length;i++){
                for (int j=1;j<arr.length;j++){
                    if (arr[i]+arr[j]== k){
                        System.out.println(arr[i] +" "+arr[j]);
                    }
                }
            }
            System.out.println("There is no pair of elements whose sum is equal to " +k);

        }

}
