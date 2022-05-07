package com.leetcode.algo.array.boats_save_people;

import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int begin = 0;
        int end = people.length - 1;
        int numBoats = 0;

        while (begin < end) {
            if ((people[begin] + people[end]) <= limit) {
                ++begin;
                --end;
                ++numBoats;
            } else if (people[begin] < limit) {
                --end;
                ++numBoats;
            } else {
                break;
            }
        }

        return numBoats + (end - begin + 1);
    }
}
