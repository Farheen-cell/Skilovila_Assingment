package problem2;

import java.util.HashSet;

public class PythagoreanTriplet {

    public static boolean hasPythagoreanTriplet(int[] nums) {
        // Create a HashSet to store the squares of the elements
        HashSet<Integer> set = new HashSet<>();

        // Populate the HashSet with the squares of the elements
        for (int num : nums) {
            set.add(num * num);
        }

        // Check for the Pythagorean triplet
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sumOfSquares = nums[i] * nums[i] + nums[j] * nums[j];
                if (set.contains(sumOfSquares)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums = {3, 1, 4, 6, 5}; // This array has a Pythagorean triplet (3, 4, 5)
        boolean result = hasPythagoreanTriplet(nums);
        System.out.println("Does the array have a Pythagorean triplet? " + result);
    }
}
