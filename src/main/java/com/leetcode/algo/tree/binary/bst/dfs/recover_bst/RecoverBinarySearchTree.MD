You are given `root` of a BST, where values of **exactly** `two` nodes
of the tree were swapped by mistake. *Recover the tree without changing its structure*.

## Example 1:

<img src="recover1.jpg" />

**Input**: <code><b>root</b> = [1,3,null,null,2]</code> <br>
**Output**: `[3,1,null,null,2]` <br>
**Explanation**: 
3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.

## Example 2:

<img src="recover2.jpg" />

**Input**: <code><b>root</b> = [3,1,4,null,null,2]</code> <br>
**Output**: `[2,1,4,null,null,3]` <br>
**Explanation**:
2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 and 3 makes the BST valid.


Constraints:
============

*    The number of nodes in the tree is in the range `[2, 1000]`.
*    <code> -2<sup>31</sup> <= Node.val <= 2<sup>31</sup> - 1 </code>

