Implement a `last-in-first-out (LIFO)` stack using only two queues.
The implemented stack should support all functions of a normal stack
(`push`, `top`, `pop` and `empty`).

Implement the `MyStack` class:

| Methods            | Description                                                |
|:-------------------|:-----------------------------------------------------------|
| `void push(int x)` | Pushes element x to the top of the stack.                  |
| `int pop()`        | Removes the element on the top of the stack and return it. |
| `int top()`        | Returns the element on the top of the stack.               |
| `boolean empty()`  | Returns `true` if the stack is empty, `false` otherwise.   |

**Notes:**
You must use only standard operations of a queue,
which means that only `push to back`, `peek/pop from front`, `size` and `is empty` *operations are valid*.

### Example 1

**Input**:   
*commands:* <code>[<em>"push"</em>, <em>"push"</em>, <b>"top"</b>, <b>"pop"</b>, <b>"empty"]</b> </code>  
*values:*<code>[<em>1</em>, <em>2</em>, null, null, null]</code> <br />
**Output**:   
*expected:* <code>[null, null, null, <b>2</b>, <b>2</b>, <b>false</b>]</code> <br />

**Explanation** <br />

| commands | values | Operation                | Output |
|:---------|:-------|:-------------------------|:-------|
| push     | 1      | myStack.push(1);         | null   |
| push     | 2      | myStack.push(2);         | null   |
| top      | null   | myStack.top();           | 2      |
| pop      | null   | myStack.pop();           | 2      |
| empty    | null   | myStack.empty();         | False  |