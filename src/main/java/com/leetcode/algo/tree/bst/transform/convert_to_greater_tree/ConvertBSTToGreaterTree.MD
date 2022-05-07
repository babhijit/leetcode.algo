Given a `root` of a `BST`, convert it to a <b>Greater Tree</b> such that 
every key of the original BST is changed to the original key plus the sum of all keys greater than original key in BST.

As a reminder, a <em>binary search tree</em> is a tree that satisfies the following constraints:
* Left subtree of a node contains only nodes with keys <b>less than</b> the node's key.
* Right subtree of a node contains only nodes with keys <b>greater than</b> the node's key.
* Both left and right subtrees must also be binary search trees.

## Example 1:

<img src="tree.png" />
<b>Input</b>: `root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]` <br />
<b>Output</b>: `[30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]`

## Example 2:

<b>Input</b>: `root = [0,null,1]` <br />  
<b>Output</b>: `[1,null,1]`


Constraints:
-----------------------
*    The number of nodes in the tree is in the range <code>[0, 10<sup>4</sup>]</code>.
*    <code> -10<sup>4</sup> <= Node.val <= 10<sup>4</sup></code>
*    All the values in the tree are **unique**.
*    `root` is guaranteed to be a valid binary search tree.
