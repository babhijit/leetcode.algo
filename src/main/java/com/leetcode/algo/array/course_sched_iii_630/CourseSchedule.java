package com.leetcode.algo.array.course_sched_iii_630;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CourseSchedule {

    private static final int DURATION = 0;
    private static final int LAST_DAY =  1;

    public int scheduleCourse(int[][] courses) {
        Comparator<int[]> lastDayComparator = Comparator.comparingInt((int[] c) -> c[LAST_DAY]);
        Arrays.sort(courses, lastDayComparator);

        var coursesList = new PriorityQueue<Integer>((a, b) -> b - a);
        int duration = 0;

        for(var course: courses) {
            if (duration + course[DURATION] <= course[LAST_DAY]) {
                coursesList.offer(course[DURATION]);
                duration += course[DURATION];
            } else if (!coursesList.isEmpty() && coursesList.peek() > course[DURATION]) {
                duration += course[DURATION] - coursesList.poll();
                coursesList.offer(course[DURATION]);
            }
        }

        return coursesList.size();
    }
}
