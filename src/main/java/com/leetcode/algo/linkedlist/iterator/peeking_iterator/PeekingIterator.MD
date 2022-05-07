Design an iterator that supports the `peek` operation on an existing iterator in addition to the `hasNext` 
and the `next` operations.

Implement the `PeekingIterator` class:
* <code><b>PeekingIterator</b>(<em>Iterator<int></em> nums)</code> Initializes the object with the given integer iterator `iterator`.
* `int next()` Returns the next element in the array and moves the pointer to the next element.
* `boolean hasNext()` Returns `true` if there are still elements in the array.
* `int peek()` Returns the next element in the array **without** moving the pointer.

### Example 1:

<b>Input</b>:
`init` = `[1, 2, 3]`
`ops`: ["next", "peek", "next", "next", "hasNext"]
<b>Output</b>:
<code>
[1, 2, 2, 3, false]
</code>

### Explanation
| Input Command | Input Argument | Operation                                                                                 |                 
|---------------|:--------------:|:------------------------------------------------------------------------------------------|
| `init`        |   [1, 2, 3]    | <pre lang=java>`PeekingIterator peekingIterator = new PeekingIterator([1, 2, 3]);` </pre> | 
| `peek()`      |      `[]`      | Return `2` but **does not move** iterator                                                 | 
| `next()`      |      `[]`      | Return `2` AND **moves** iterator to the next element                                     | 
| `next()`      |      `[]`      | Return `3` AND **moves** iterator to the next element                                     | 
| `hasNext()`   |      `[]`      | Return `False`                                                                            |                                                                             | 

Constraints:
================
*    1 <= nums.length <= 1000
*    1 <= nums[i] <= 1000
*    All the calls to next and peek are valid.
*    At most 1000 calls will be made to next, hasNext, and peek.
