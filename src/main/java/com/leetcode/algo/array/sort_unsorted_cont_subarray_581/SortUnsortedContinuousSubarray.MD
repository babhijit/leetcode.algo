Given an integer array `nums`, you need to find one **continuous subarray***
that if you only sort this subarray in ascending order, then the whole array
will be sorted in ascending order.

Return *the shortest such subarray and output its length*.

Example 1:
---------
<code>
<b>Input</b>: nums = [2,6,4,8,10,9,15] <br />  
<b>Output</b>: 5  <br />
<b>Explanation</b>: <br />  
You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
</code>

Example 2:
----------
<code>
<b>Input</b>: nums = [1,2,3,4] <br />  
<b>Output</b>: 0  <br />
</code>

Example 3:
----------
<code>
<b>Input</b>: nums = [1] <br />
<b>Output</b>: 0 <br />
</code>


Constraints:
===========
*    <code>1 <= nums.length <= 10<sup>4</sup> </code>
*    <code>-10<sup>5</sup> <= nums[i] <= 10<sup>5</sup> </code>
