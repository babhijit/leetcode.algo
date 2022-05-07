package com.leetcode.algo.array.threesum_with_multiplicity;

import java.util.Arrays;

public class ThreeSumMultiplicity_Optimal {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        final int MOD = 1_000_000_007;
        long count = 0;

        final int N = arr.length;
        for (int i = 0; i < N - 2; ++i) {
            int left = i + 1;
            int right = N - 1;

            while (left < right) {
                int total = arr[i] + arr[left] + arr[right];
                if (total < target) {
                    ++left;
                } else if (total > target) {
                    --right;
                } else {
                    if (arr[left] == arr[right]) {
                        count += (long) (right - left) * (right - left + 1) / 2;
                        count %= MOD;
                        break;
                    } else {
                        int leftCount = 1;
                        while (left < right) {
                            if (arr[left] == arr[++left]) {
                                ++leftCount;
                            } else {
                                break;
                            }
                        }

                        int rightCount = 1;
                        while (left < right) {
                            if (arr[right] == arr[--right]) {
                                ++rightCount;
                            } else {
                                break;
                            }
                        }

                        count += leftCount * rightCount;
                        count %= MOD;
                    }
                }
            }
        }

        return (int) count;
    }
}
