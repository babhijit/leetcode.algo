You are keeping score for a baseball game with strange rules. 
The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.

At the beginning of the game, you start with an empty record.  You are given a list of strings `ops`, 
where `ops[i]` is the <code>i<sup>th</sup></code> operation you must apply to the record and is one of the following:  
1. An integer `x` - Record a new score of `x`.
2. `"+"` - Record a new score that is the **sum** of the *previous two scores*. **It is guaranteed there will always be two previous scores**.
3. `"D"` - Record a new score that is **double** the *previous score*. **It is guaranteed there will always be a previous score**.
4. `"C"` - **Invalidate the previous score**, *removing it from the record*. **It is guaranteed there will always be a previous score**.

### Example 1:

**Input**: `ops = ["5","2","C","D","+"]`  
**Output**: `30`  
**Explanation**: 
* "5" - `Add 5` to the record, record is now <code>[<strong>5</strong>]</code>.  
* "2" - `Add 2` to the record, record is now <code>[5, <strong>2</strong>]</code>.  
* "C" - `Invalidate and remove` the previous score, record is now <code>[5, <s>2</s>]</code> => `[5]`.  
* "D" - `Add 2 * 5 = 10` to the record, record is now <code>[5, <strong>10</strong>]</code>.  
* "+" - `Add 5 + 10 = 15` to the record, record is now <code>[5, <em>10</em>, <strong>15</strong>]</code>.  

* **The total sum is `5 + 10 + 15 = 30`.**


### Example 2:

**Input**: `ops = ["5","-2","4","C","D","9","+","+"]`     
**Output**: `27`    
**Explanation**:     
* "5" - `Add 5` to the record, record is now <code>[<strong>5</strong>]</code>.
* "-2" - `Add -2` to the record, record is now <code>[5, <strong>-2</strong>]</code>.
* "4" - `Add 4` to the record, record is now <code>[5, -2, <strong>4</strong>]</code>.
* "C" - `Invalidate and remove` the previous score, record is now <code>[5, -2, <s>4</s>]</code> => <code>[5, -2]</code>.
* "D" - `Double 2 * -2 = -4` to the record, record is now <code>[5, <em> -2 </em>, <strong>-4</strong>]</code>.
* "9" - `Add 9` to the record, record is now <code>[5, -2, -4, <strong>9</strong>]</code>.
* "+" - `Add -4 + 9 = 5` to the record, record is now <code>[5, -2, <em> -4, 9 </em>, <strong>5</strong>]</code>.  
* "+" - `Add 9 + 5 = 14` to the record, record is now <code>[5, -2, -4, <em> 9, 5 <em>, <strong>14</strong>]</code>.  

*The total sum is **5 + -2 + -4 + 9 + 5 + 14 = 27.***


### Example 3:

**Input**: `ops = ["1"]`  
**Output**: `1`  
