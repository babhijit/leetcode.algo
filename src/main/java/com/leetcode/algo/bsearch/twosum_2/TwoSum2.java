package com.leetcode.algo.bsearch.twosum_2;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[] {low + 1, high + 1};
            }
            if (sum < target) { // move the search to the right
                low = binarySearch(numbers, low + 1, high - 1, target - numbers[high]);
            } else { // move the search to the left
                high = binarySearch(numbers, low + 1, high - 1, target - numbers[low]);
            }
        }

        throw new UnsupportedOperationException();
    }

    private int binarySearch(int numbers[], int start, int end, int target) {
        int mid;
        while (start < end) {
            mid = start + ((end - start) >> 1);
            if (numbers[mid] == target) {
                return mid;
            }

            if (target < numbers[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
