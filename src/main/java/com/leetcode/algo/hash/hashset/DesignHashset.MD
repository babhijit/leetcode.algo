Design a `HashSet` without using any built-in hash table libraries.

Implement `MyHashSet` class:

*    `void add(key)` **Inserts** the value key into the HashSet.
*    `bool contains(key)` Returns whether the value key **exists** in the HashSet or not.
*    `void remove(key)` **Removes** the value key in the HashSet. If key does not exist in the HashSet, do nothing.

## Example 1:

**Input**: 
<code><em>["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]</em>
[[], [1], [2], [1], [3], [2], [2], [2], [2]]</code> <br />
**Output**: <code>[null, null, null, true, false, null, true, null, false]</code>

**Explanation**

MyHashSet myHashSet = new MyHashSet();
<b>myHashSet.add(1);      </b> `// set = [1]` <br />
<b>myHashSet.add(2);      </b> `// set = [1, 2]` <br />
<b>myHashSet.contains(1); </b> `// return True` <br />
<b>myHashSet.contains(3); </b> `// return False, (not found)` <br />
<b>myHashSet.add(2);      </b> `// set = [1, 2]` <br />
<b>myHashSet.contains(2); </b> `// return True` <br />
<b>myHashSet.remove(2);   </b> `// set = [1]` <br />
<b>myHashSet.contains(2); </b> `// return False, (already removed)` <br />

Constraints:
-----------
*    0 <= key <= 10<sup>6</sup>
*    At most 10<sup>4</sup> calls will be made to add, remove, and contains.
