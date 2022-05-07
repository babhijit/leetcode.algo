package com.leetcode.algo.array.boats_save_people;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoatsToSavePeopleTest {

    private BoatsToSavePeople solution = new BoatsToSavePeople();

    @Test
    void testInputPeople2() {
        final int[] people = {1, 2};
        final int limit = 3;

        final int expectedNumberOfBoats = 1;

        assertEquals(expectedNumberOfBoats, solution.numRescueBoats(people, limit));
    }

    @Test
    void testInputPeople4_limit3() {
        final int[] people = {3, 2, 2, 1};
        final int limit = 3;

        final int expectedNumberOfBoats = 3;

        assertEquals(expectedNumberOfBoats, solution.numRescueBoats(people, limit));
    }

    @Test
    void testInputPeople4_limit5() {
        final int[] people = {3, 5, 3, 4};
        final int limit = 5;

        final int expectedNumberOfBoats = 4;

        assertEquals(expectedNumberOfBoats, solution.numRescueBoats(people, limit));
    }

}