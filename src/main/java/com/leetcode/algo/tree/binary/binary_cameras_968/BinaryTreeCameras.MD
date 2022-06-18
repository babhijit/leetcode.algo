# 968. Binary Tree Cameras

You are given the `root` of a **binary tree**. 
We install cameras on the tree nodes where each camera at a node can monitor:
* its parent, 
* itself, 
* its immediate children.

*Return the minimum number of cameras needed to monitor all nodes of the tree.*

Constraints:
============
*    `The number of nodes in the tree is in the range [1, 1000].`
*    `Node.val == 0`


Examples
--------

### Example 1

<img src="bst_cameras_01.png"  alt=""/>

**Input**: `root = [0,0,null,0,0]` <br />
**Output**: `1` <br />
**Explanation**: One camera is enough to monitor all nodes if placed as shown.


### Example 2

<img src="bst_cameras_02.png"  alt=""/>

**Input**: `root = [0,0,null,0,null,0,null,null,0]` <br />
**Output**: `2` <br />
