# 630. Course Schedule III

There are `n` different online courses numbered from `1` to `n`. 
You are given an array `courses` 
where <code>course[i] = [duration<sub>i</sub>, lastDay<sub>i</sub>]</code>
    indicate that the <code>i<sup>th</sup></code> course should be taken **continously** for 
<code>duration<sub>i</sub></code> days and must be finished before or on <code>lastDay<sub>i</sub></code>.

You will start on the <code>1<sup>st</sup></code> day and you can not take two or more courses continously.

Return *the **maximum number** of courses you can take*.

Constraints:
============
*    <code>1 <= courses.length <= 10<sup>4</sup></code>
*    <code>1 <= durationi, lastDayi <= 10<sup>4</sup></code>

Examples
--------

### Example 1:

**Input**: <code>courses = [[100,200],[200,1300],[1000,1250],[2000,3200]]</code> <br />
**Output**: <code>3</code> <br />
**Explanation**:
There are totally *4 courses*, but you **can take 3 courses at most**: <br />
* First, take the **1st** course, it **costs 100 days** so you will *finish it on the 100th day*, and ready to take the <u>next course on the 101st day</u>.
* Second, take the **3rd** course, it **costs 1000 days** so you will *finish it on the 1100th day*, and ready to take the <u>next course on the 1101st day</u>.
* Third, take the **2nd course**, it **costs 200 days** so you will *finish it on the 1300th day*.
* The **4th course cannot** be taken now, since you will **finish it on the 3300th day**, which <u>exceeds the closed date</u>.

### Example 2:

**Input:** `courses = [[1,2]]`       <br />
**Output:** `1`                      <br />

### Example 3:

**Input**: `courses = [[3,2],[4,3]]` <br />
**Output**: 0`                       <br />
