Given the `root` of a binary search tree, <em>rearrange</em> the tree in <b>in-order</b> 
so that the ***leftmost node*** in the tree is <u>now the root of the tree</u>,
and <em><u>every node has no left child and only one right child</u></em>.

## Example 1
<img src="ex1.jpg" />

**Input**: root = [5,3,6,2,4,null,8,1,null,null,null,7,9] <br >
**Output**: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

## Example 2
<img src="ex2.jpg" />

**Input**: root = [5,1,7] <br >
**Output**: [1,null,5,null,7]


Constraints:
============
*   The number of nodes in the given tree will be in the range `[1, 100]`.
*    `0 <= Node.val <= 1000`
