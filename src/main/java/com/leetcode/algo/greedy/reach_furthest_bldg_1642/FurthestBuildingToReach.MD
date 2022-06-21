# 1642. Furthest Building You Can Reach

You are given an integer array `heights` representing the heights of buildings, some `bricks`, and some `ladders`.

You *start your journey* from building `0` and *move to the next* building by <u>possibly using bricks or ladders</u>.

While moving from building `i` to building `i+1` (**0-indexed**),
*    If the current building's height is **greater than or equal to** the next building's height, 
     you do <u>not</u> need a ladder or bricks.
*    If the current building's height is **less than** the next building's height, 
     you can either use <u>one ladder</u> or <u>`(h[i+1] - h[i])` bricks</u>.

Return *the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally*.

Constraints:
============
*    <code>1 <= heights.length <= 10<sup>5</sup></code>
*    <code>1 <= heights[i] <= 10<sup>6</sup></code>
*    <code>0 <= bricks <= 10<sup>9</sup></code>
*    <code>0 <= ladders <= heights.length</code>

## Examples

### Example 1


<img src="q4.gif" alt=" />

**Input**: `heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1` <br/>
**Output**: `4` <br/>
**Explanation**: Starting at building 0, you can follow these steps:
- Go to building 1 without using ladders nor bricks since `4 >= 2`. <br />
- Go to building 2 using 5 bricks. You must use either bricks or ladders because `2 < 7`. <br />
- Go to building 3 without using ladders nor bricks since `7 >= 6`. <br />
- Go to <u>building 4 using your only ladder</u>. You must use either bricks or ladders because `6 < 9`. <br />
**  It is impossible to go beyond building 4 because you do not have any more bricks or ladders.**

### Example 2:

**Input**: `heights = [4,12,2,7,3,18,20,3,19], bricks = 10, ladders = 2` <br/>
**Output**: `7` <br/>
