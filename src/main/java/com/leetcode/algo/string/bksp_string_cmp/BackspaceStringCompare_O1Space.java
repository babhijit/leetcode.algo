package com.leetcode.algo.string.bksp_string_cmp;

public class BackspaceStringCompare_O1Space {
    public boolean backspaceCompare(String s, String t) {
        int sPointer = s.length() - 1;
        int tPointer = t.length() - 1;

        while ((sPointer >= 0) || (tPointer >= 0)) {
            sPointer = getValidPrevCharIndex(s, sPointer);
            tPointer = getValidPrevCharIndex(t, tPointer);

            if (isBackSpaceChar(s, sPointer) || isBackSpaceChar(t, tPointer)) {
                continue;
            }

            // right now we are assured that there's no backspace '#' as the current character
            if ((sPointer >= 0) && (tPointer >= 0)) {
                if (s.charAt(sPointer) == t.charAt(tPointer)) {
                    --sPointer;
                    --tPointer;
                } else {
                    return false;
                }
            } else {
                return isEmpty(sPointer) && isEmpty(tPointer);
            }
        }

        return true;
    }

    private boolean isEmpty(int stringIndex) {
        return stringIndex < 0;
    }

    private int getValidPrevCharIndex(String s, int i) {
        if (i < 0) {
            return -1;
        }

        int leapBy = 0;

        do {
            if (isBackSpaceChar(s, i)) {
                ++leapBy;
                --i;
            } else if (leapBy > 0) { // backspaces in queue
                --leapBy;
                --i; // effectively deletes character             }
            }
        } while ((i >= 0) && (leapBy > 0));

        // backspaces still in queue and no more characters left to process!
        if (leapBy > 0) {
            return -1;
        }

        // index of the next valid char
        return i;
    }

    private boolean isBackSpaceChar(String s, int index) {
        if (index < 0) return false;

        return s.charAt(index) == '#';
    }
}
