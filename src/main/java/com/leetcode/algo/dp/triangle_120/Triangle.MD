#120. Triangle   

-------------------------------------------

Given a triangle array, return the minimum path sum from top to bottom.

* For each step, you may move to an adjacent number of the row below. 
* More formally, if you are on index i on the current row:
    * you may move to either index i or 
    *  index i + 1 on the next row.

Constraints:
------------
*    <code>1 <= triangle.length <= 200</code>
*    <code>triangle[0].length == 1</code>
*    <code>triangle[i].length == triangle[i - 1].length + 1</code>
*    <code> -10<sup>4</sup> <= triangle[i][j] <= 10<sup>4</sup> </code>

=========================================================

## Examples

### Example 1
**Input**: triangle = `[[2],[3,4],[6,5,7],[4,1,8,3]]`  
**Output**: 11                                          
**Explanation**: The triangle looks like:                
||||      <u>2</u>    ||||  <br />
|||     <u>3</u> 4    |||  <br />
||   6 <u>5</u> 7     ||  <br /> 
|  4 <u>1</u> 8 3     |  <br />
The minimum path sum from top to bottom is `2 + 3 + 5 + 1` = `11` (underlined above).
-----------------------  
### Example 2
**Input**: triangle = `[[-10]]`  
**Output**: `-10`                 
-----------------------  