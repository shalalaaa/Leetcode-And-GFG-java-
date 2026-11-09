public class ZeroAndOne {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 0, 1, 1, 0, 1};

        int countZero = 0;
        //int countOne = 0;

        // Count zeros and ones
        for (int ele : arr) {
            if (ele == 0)
                countZero++;
            //else
                //countOne++;
        }

        // Fill zeros
        for (int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }

        // Fill ones
        for (int i = countZero; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}

