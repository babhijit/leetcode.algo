Given an array `nums` which consists of non-negative integers and an integer `m`,
you can split the array into `m` non-empty continuous subarrays.  

Write an algorithm to minimize the largest sum among these `m` subarrays.

## BEST SOLUTION: 
* <u>Method:</u> Binary Search
* <u>Space Complexity:</u> O(1)
* <u>Time Complexity:</u> nO(log S) ```S: sum(array)```


----------------------------------------
Constraints
----------------------------------------
* ``` 1 <= nums.length <= 1000 ```
* <code>0 <= nums[i] <= 10<sup>6</sup></code>
* ``` 1 <= m <= min(50, nums.length) ```


### Example 1
<code> <strong>Input</strong>: <br />
    </tab>nums = [7, 2, 5, 10, 8]  <br />
    m = 2 <br>
<strong>Output</strong>: 18
</code>

_There are for ways to split `nums` into two subarrays. <br />
The best way to split it into [7, 2, 5] and [10, 8], <br />
where the largest sum among the two subarrays is only 18_