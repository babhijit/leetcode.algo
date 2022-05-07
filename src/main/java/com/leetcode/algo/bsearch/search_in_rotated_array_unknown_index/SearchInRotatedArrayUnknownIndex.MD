There is an integer array `nums` sorted in non-decreasing order (not necessarily with **distinct** values).

Before being passed to your function, `nums` is rotated at an unknown pivot index `k (0 <= k < nums.length)`
such that the resulting array is `nums[k], nums[k+1], ..., nums[n - 1], nums[0], nums[1]..., nums[k-1]]` (**0-indexed**).
For example, `[0, 1, 2, 4, 4, 4, 5, 6, 6, 7]` might be rotated at pivot index `5` amd become `[4,5,6,6,7,0,1,2,4,4]`.

Given the array `nums` *after* the rotation and an integer `target`,
return `true` _if_ `target` _is in_ `nums`,_or_
return `false`, _if it is not in_ `nums`.

You must decrease the overall operation steps as much as possible.

-----------------------------
## Constraints

*  <code> 1 <= nums.length <= 5000 </code>
*  <code> -10<sup>4</sup> <= nums[i] <= 10<sup>4</sup> </code>
*  <code> nums is guaranteed to be rotated at some pivot. </code>
*  <code> -10<sup>4</sup> <= target <= 10<sup>4</sup> </code>

-----------------------------
### Example 1:

**Input**: <br>
```
    nums = [2,5,6,0,0,1,2],  
    target = 0
```  
**Output**:```true```

### Example 2:

**Input**: <br>

    nums = [2,5,6,0,0,1,2], 
    target = 3
**Output**:```false```
