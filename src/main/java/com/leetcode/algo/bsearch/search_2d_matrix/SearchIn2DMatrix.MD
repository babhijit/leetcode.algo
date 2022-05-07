Write an efficient algorithm that searches for a value `target` in an `m x n`
integer matrix `matrix`. This matrix has the following properties:
* Integers in each row are sorted from left to right.
* The first integer of each row is greater than the last integer of the previous row.
------------------------------------
## Constraints
* <code>m == matrix.length</code>
* <code>n == matrix[i].length</code>
* <code>1 <= m, n <= 100</code>
* <code> -10<sup>4</sup> <= matrix[i][j] <= 10<sup>4</sup> </code>
-----------------------------------

### Example 1
<img src="matrix_1.jpg"></img> <br />
<code>
<strong>Input</strong>:  
* matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]],   
* target = 3  <br />

<strong>Output</strong>: true
</code>

### Example 2
<img src="matrix_2.jpg"></img> <br />
<code>
<strong>Input</strong>:
* matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]],
* target = 13  <br />

<strong>Output</strong>: false
</code>