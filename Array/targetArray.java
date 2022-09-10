// Create Target Array in the Given Order

// https://leetcode.com/problems/create-target-array-in-the-given-order/

package Array;

public class targetArray {

    public static void main(String[] args) {

        int[] nums = { 0, 1, 2, 3, 4 };

        int[] index = { 0, 1, 2, 2, 1 };

        int size = index.length;

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        int[] output = new int[size];

        // print the given arrray

        for (int i = 0; i < nums.length; i++) {

            solve(output, nums[i], index[i]);
        }

        // print the output array
        for (int i = 0; i < index.length; i++) {

            System.out.print(output[i] + " ");
        }

    }

    // fuction to insert value of the given index
    static void solve(int[] output, int num, int index) {
        for (int i = output.length - 1; i > index; i--) {

            output[i] = output[i - 1];
        }
        output[index] = num;

    }





    }


