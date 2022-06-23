package com.leetcode.algo.array.course_sched_iii_630;

import com.leetcode.algo.AbstractExecuteTests;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleTest extends AbstractExecuteTests<TestCase> {

    public CourseScheduleTest() {
        super("CourseScheduleTests.json", TestCase.class);
    }

    @Override
    protected void executeTest(TestCase testCase) {
        executeTest(testCase.courses, testCase.output);
    }

    private void executeTest(int[][] courses, int expected) {
        var solution = new CourseSchedule();
        int actual = solution.scheduleCourse(courses);
        assertEquals(expected, actual);
    }
}