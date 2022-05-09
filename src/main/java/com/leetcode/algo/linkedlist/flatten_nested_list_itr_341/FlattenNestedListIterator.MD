You are given a nested list of integers `nestedList`. 
Each element is either an integer or a list whose elements may also be integers or other lists. 
Implement an iterator to flatten it.

Implement the `NestedIterator` class:

*    <code>NestedIterator(List<NestedInteger> nestedList)</code>. Initializes the iterator with the nested list `nestedList`.
*    <code>int next()</code> Returns the next integer in the nested list.
*    <code>boolean hasNext()</code> Returns `true` if there are still some integers in the nested list and `false` otherwise.

Your code will be tested with the following pseudocode:

    initialize iterator with nestedList
    res = []
    while iterator.hasNext()
    append iterator.next() to the end of res
    return res

If `res` matches the expected flattened list, then your code will be judged as correct.

Example 1:
---------
**Input**: <code>nestedList = [<code>[1,1]</code>,2,<code>[1,1]</code>]</code>  
**Output**: `[1,1,2,1,1]`  
**Explanation**: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].

Example 2:
---------
**Input**: <code>nestedList = [1,<code>[4,`[6]`]</code>]</code>  
**Output**: `[1,4,6]`  
**Explanation**: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].

Constraints:
============
*    `1 <= nestedList.length <= 500`
*    The values of the integers in the nested list is in the range <code>[-10<sup>6</sup>, 10<sup>6</sup>]</code>.
