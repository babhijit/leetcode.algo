package com.leetcode.algo.string.cont_chars;

import java.util.ArrayList;
import java.util.List;

public class ContiguousCharacters {

    private static class CharSequenceCounter {
        int index;
        int count;

        public CharSequenceCounter(int index, int count) {
            this.index = index;
            this.count = count;
        }
    }

    private static class FindMaxContiguousLength {
        private final List<CharSequenceCounter> sequenceCounters = new ArrayList<>();

        private final String characters;
        private final int replacementsAllowed;
        private int replacementsLeft;
        private final char target;
        private int maxCount = 0;

        public FindMaxContiguousLength(String characters, int replacementsAllowed, char target) {
            this.characters = characters;
            this.replacementsLeft = this.replacementsAllowed = replacementsAllowed;
            this.target = target;

            findMaxLength();
        }

        private void findMaxLength() {
            int currentLength = 0;
            int startSequence;
            int index = 0;
            int curSeqStart = -1;

            final int N = characters.length();
            while (index < N) {
                var curChar = characters.charAt(index);
                if (curChar == target) {
                    ++currentLength;
                    if (curSeqStart == -1) {
                        curSeqStart = index;
                    }
                    incrementSequenceCount(curSeqStart);
                } else {
                    curSeqStart = -1;
                    if (replacementsLeft > 0) {
                        ++currentLength;
                        --replacementsLeft;
                    } else {
                        maxCount = Math.max(maxCount, currentLength);
                        startSequence = getNextStartSequence(index);
                        currentLength = index - startSequence + 1; // 0-based indexing
                    }
                }
                ++index;
            }
            maxCount = Math.max(maxCount, currentLength);
        }

        private int getNextStartSequence(final int index) {
            int startSequence = index;
            int totalRepeatingChars = 0;
            int subStrLength;
            int replacementsLeft = 0;

            for (int i = sequenceCounters.size() - 1; i >= 0; --i) {
                var counter = sequenceCounters.get(i);
                subStrLength = index - counter.index + 1;
                int mismatches = subStrLength - (totalRepeatingChars + counter.count);
                replacementsLeft = replacementsAllowed - mismatches;
                if (replacementsLeft >= 0) {
                    totalRepeatingChars += counter.count;
                    startSequence = counter.index;
                } else {
                    break;
                }
            }

            // edge case : the first few characters in the string are all mismatches
            if ((startSequence > 0) && (replacementsLeft > 0)) {
                --startSequence;
                --replacementsLeft;
            }

            subStrLength = index - startSequence + 1;
            this.replacementsLeft = replacementsAllowed - (subStrLength - totalRepeatingChars);
            return startSequence;
        }

        private void incrementSequenceCount(final int index) {
            boolean addNew = sequenceCounters.isEmpty();
            if (!addNew) {
                var counter = sequenceCounters.get(sequenceCounters.size() - 1);
                if (counter.index == index) {
                    ++counter.count;
                } else {
                    addNew = true;
                }
            }

            if (addNew) {
                sequenceCounters.add(new CharSequenceCounter(index, 1));
            }
        }

        public int maxLength() {
            return maxCount;
        }
    }

    public int getLongestContiguousCharLength(String characters, int replacements, char target) {
        FindMaxContiguousLength findMaxLength = new FindMaxContiguousLength(characters, replacements, target);
        return findMaxLength.maxLength();
    }
}
