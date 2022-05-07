package com.leetcode.algo.bsearch.firstbadversion;

public class FirstBadVersion {

    private final int BAD_VERSION;

    public FirstBadVersion(int BAD_VERSION) {
        this.BAD_VERSION = BAD_VERSION;
    }

    private boolean isBadVersion(final int version) {
        return version >= BAD_VERSION;
    }

    public int firstBadVersion(final int n) {
        int low = 1;
        int high = n;

        int mid;
        int badVersion = 0;

        while (low <= high) {
            mid = low + ((high - low) >> 1);
            if (isBadVersion(mid)) {
                badVersion = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return badVersion;
    }
}
