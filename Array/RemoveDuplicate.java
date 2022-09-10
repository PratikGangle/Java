package Array;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int count = 1;
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int[] arr1 = new int[arr.length];

        int j = 0;

        arr1[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr1[j]) {
                arr1[++j] = arr[i];
                count++;

            }

        }

        for (int i = 0; i < count; i++) {
            System.out.println(arr1[i]);
        }

        // System.out.println(count);

    }
}

