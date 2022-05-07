You are given an array `people` where `people[i]` is the weight of the <code>i<sup>th</sup></code> person, 
and **an infinite number of boats** where each boat can carry a maximum weight of `limit`.
Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most `limit`.

_Return the minimum number of boats to carry every given person._

----------------------
## Constraints:

<code>
1 <= people.length <= 5 * 10<sup>4</sup>

1 <= people[i] <= limit <= 3 * 10<sup>4</sup>
</code>

----------------------

### Example 1:

<code>
<strong>Input</strong>: people = [1,2], limit = 3

<strong>Output</strong>: 1
</code>

**Explanation**: 1 boat (1, 2)

### Example 2:
<code>
<strong>Input</strong>: people = [3,2,2,1], limit = 3

<strong>Output</strong>: 3
</code>

**Explanation**: 3 boats (1, 2), (2) and (3)

### Example 3:

<code>
<strong>Input</strong>: people = [3,5,3,4], limit = 5

<strong>Output</strong>: 4
</code>

**Explanation**: 4 boats (3), (3), (4), (5)
