# Disjoint Interval

Given a list of intervals `[start, end]`, 
find the length of the maximal set of mutually disjoint intervals.

Constraints
===========
* <code> 1 <= N <= 10<sup>5</sup> </code>
* <code> 1 <= A[i][0] <= A[i][1] <= 10<sup>9</sup> </code>


Examples
--------

### Example 1
**Input**: `[ [1, 2], [2, 10], [4, 6] ]`   <br />
**Output**: `2`   <br />
**Explanation**:   <br />
* Select `[1, 2]` and `[4, 6]`
* Selecting `[2, 10]` will block `[1, 2]` and `[4, 6]`

### Example 2
**Input**: `[ [1, 4], [2, 3], [4, 6], [8, 9] ]`  <br />
**Output**: `3`  <br />
**Explanation**:  <br />
* Select `[2, 3]`, `[4, 6]` and `[8, 9]`
* Selecting `[1, 4]` will block `[2, 3]` and `[4, 6]`
