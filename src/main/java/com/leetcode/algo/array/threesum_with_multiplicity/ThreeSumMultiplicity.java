package com.leetcode.algo.array.threesum_with_multiplicity;

import java.util.*;

public class ThreeSumMultiplicity {
    private static class Range {
        private int start;
        private int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int size(int k) {
            if (k > end) {
                return 0;
            }

            if (k < start) {
                k = start;
            }
            return end - k + 1;
        }
    }

    private Map<Integer, Range> memo = new HashMap<>();

    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);

        final int N = arr.length;
        long count = 0;
        final int MOD = 1_000_000_007;

        for (int i = 0; i < N - 2; ++i) {
            for (int j = i + 1; j < N - 1; ++j) {
                int remainder = target - (arr[i] + arr[j]);
                int k = j + 1;
                var range = getRange(arr, k, remainder);
                if (Objects.nonNull(range)) {
                    count += range.size(k);
                    count %= MOD;
                }
            }
        }

        return (int)(count);
    }

    private Range getRange(final int[] arr, final int k, final int target) {
        if (!memo.containsKey(target)) {
            if ((target < arr[k]) || (target > arr[arr.length -1])) {
                return null;
            }
            var range = binarySearch(arr, k, arr.length, target);
            memo.put(target, range);
            return range;
        }
        return memo.get(target);
    }

    // binary search will always return the last possible match
    private Range binarySearch(int[] arr, final int start, final int end, final int target) {
        int low = start;
        int high = end;
        while (low < high) {
            int mid = low + (high - low)/2;
            if (target < arr[mid]) {
                high = mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                int left = mid;
                int right = mid;
                while (left > 0) {
                    if (arr[left - 1] == target) {
                        --left;
                    } else {
                        break;
                    }
                }
                while (right < arr.length - 1) {
                    if (arr[right + 1] == target) {
                        ++right;
                    } else {
                        break;
                    }
                }

                return new Range(left, right);
            }
        }
        return null;
    }
}
