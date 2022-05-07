Given an array of integers `nums` and an integer `target`, 
return _indices of the two numbers such that they add up_ to <code><i>target</i></code>.

You may assume that each input would have **_exactly one solution_**, and you may not use the same element twice.

You can return the answer in any order.
________________________

### Example 1:

**Input**: nums = [2,7,11,15], target = 9  
**Output**: [0,1]  
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

### Example 2:

**Input**: nums = [3,2,4], target = 6  
**Output**: [1,2]  

### Example 3:

**Input**: nums = [3,3], target = 6  
**Output**: [0,1]  

## Constraints:

* <code>2 <= nums.length <= 10<sup>4</sup> <br /></code>
* <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup> <br /></code>
* <code>-10<sup>9</sup> <= target <= 10<sup>9</sup> <br /></code>
* **Only one valid answer exists.**

