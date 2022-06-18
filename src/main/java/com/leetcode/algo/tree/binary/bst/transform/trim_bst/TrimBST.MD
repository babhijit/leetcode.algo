Given the `root` of a binary search tree and the `lowest` and `highest` boundaries as `low` and `high`, 
trim the tree so that all its elements lies in `[low, high]`. Trimming the tree should **not** change the relative structure 
of the elements that will remain in the tree (i.e., any node's descendant should remain a descendant). 
It can be proven that there is a **unique answer**.

Return *the root of the trimmed binary search tree.* 
Note that the root may change depending on the given bounds.

## Example 1

<img src="trim1.jpg" />

**Input**: <code> <b>root</b> = [1,0,2], 
                    <b>low</b> = 1, 
                    <b>high</b> = 2 </code> <br />
**Output**: `[1,null,2]`

## Example 2

<img src="trim2.jpg" />

**Input**: <code> <b>root</b> = [3,0,4,null,2,null,null, null, null,1, null], 
                <b>low</b> = 1, 
                <b>high</b> = 3 </code> <br />
**Output**: `[3,2,null,1, null]`


Constraints:
----------------
*    <code>The number of nodes in the tree in the range <em>[1, 10<sup>4</sup>]</em>.
*    0 <= Node.val <= 10<sup>4</sup>
*    The value of each node in the tree is <b>unique</b>.
*    <b><em>root</em></b> is guaranteed to be a valid binary search tree.
*    0 <= low <= high <= 10<sup>4</sup> </code>
