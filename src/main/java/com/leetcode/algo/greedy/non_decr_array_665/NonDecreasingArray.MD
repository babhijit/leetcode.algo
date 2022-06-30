# 665. Non-decreasing Array

Given an `array` with `n` integers, your task is to check if it could become
**non-decreasing** by modifying ***at most one element***.

We define an array is non-decreasing if `nums[i] <= nums[i + 1]`
holds for every `i (0-based)` such that `(0 <= i <= n - 2)`.

Constraints:
============

*   <code> n == nums.length </code>
*   <code> 1 <= n <= 10<sup>4</sup> </code>
*   <code> -10<sup>5</sup> <= nums[i] <= 10<sup>5</sup> </code>

Examples
--------

### Example 1:

**Input**: `nums = [4,2,3]`  <br />
**Output**: `true`  <br />
**Explanation**: You could modify the first 4 to 1 to get a non-decreasing array.  <br />

### Example 2:

**Input**: `nums = [4,2,1]`        <br />
**Output**: `false`       <br />
**Explanation**: You can't get a non-decreasing array by modify at most one element.     <br />
