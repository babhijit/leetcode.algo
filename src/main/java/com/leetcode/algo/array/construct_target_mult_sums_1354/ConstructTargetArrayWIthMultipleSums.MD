# 1354. Construct Target Array With Multiple Sums

You are given an array `target` of `n` integers. 
From a starting array `arr` consisting of `n` 1's, you may perform the following procedure:
* let `x` be the sum of all elements in your array.
* choose index `i`, such that `0 <= i < n` and set value of `arr` at index `i` to `x`
* you may repeat the procedure as many times as needed.

Return `true` *if it is possible to construct the `target` array from `arr`, otherwise, return `false`*,

Constraints:
============
*    <code>n == target.length</code>
*    <code>1 <= n <= 5 * 10<sup>4</sup></code>
*    <code>1 <= target[i] <= 10<sup>9</sup></code>

Examples
--------

### Example 1:

**Input**: `target = [9,3,5]`  <br />
**Output**: `true           `  <br />
**Explanation**: Start with arr = [1, 1, 1]  <br />
`[1, 1, 1]`, `sum = 3` choose <u>index 1</u> <br />
`[1, 3, 1]`, `sum = 5` choose <u>index 2</u> <br />
`[1, 3, 5]`, `sum = 9` choose <u>index 0</u> <br />
`[9, 3, 5]` Done                             <br />

### Example 2:

**Input**: target = [1,1,1,2]      <br />
**Output**: false                  <br />
**Explanation**: Impossible to create target array from [1,1,1,1].

### Example 3:

**Input**: `target = [8,5]` <br />
**Output**: `true` <br />
