import java.util.*;
public class Rotate_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of d:-");
        int d = sc.nextInt();

        int[] arr = {8, 9, 10, 4, 5, 3, 7, 6};
        int n = arr.length;

        // Handle cases where d is greater than n
        d = d % n;

        // Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining elements
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Print the rotated array
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
                        //SHORT CUT USING FUCTION

// class Solution {
//     public void rotateArr(int arr[], int d) {
//         int n = arr.length;
//         d=d % n;
//         reverse(arr, 0, d - 1);
//         reverse(arr, d, n-1);
//         reverse(arr, 0, n-1);
//     }
//     static void reverse (int[] arr, int i, int j){
//         while(i<j){
//             int temp = arr[i];
//             arr[i]= arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//     }
