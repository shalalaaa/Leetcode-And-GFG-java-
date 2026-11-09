
import java.util.*;

public class Missing_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        inputArray(arr, sc);

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int a = n + 1;
        int sum1 = (a * (a + 1)) / 2;

        int miss = sum1 - sum;

        System.out.println(miss);
    }

    public static void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}


// Solution of GFG and Leetcode


// class Solution {
//     int missingNum(int arr[]) {
//         int n = arr.length + 1;

//         long sum = (long) n * (n + 1) / 2;//if the n is in lakhs or crore the int would not store that big value so we have to store that in int 

//         long arraySum = 0;

//         for (int ele : arr) {
//             arraySum += ele;
//         }

//         return (int)(sum - arraySum); because we want the answer in int 
//     }
// }
