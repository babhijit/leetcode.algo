Given `N` bulbs, either **on** `(1)` or **off** `(0)`.
Turning on the <code>i<sup>th</sup></code> bulbs causes all remaining bulbs on the right to flip.

Find *the min number of switches to turn all the bulbs on*.

Constraints
===========
* <code> 1 <= N <= 10<sup>5</sup></code>
* <code>A[i] = {0, 1}</code>

Examples
--------

### Example 1
**Input**: [1, 0, 1] <br />
**Output**: 2 <br />
**Explanation**: <br />
* At index `1`, bulb is already turned on `(1)`.
* At index `2`, bulb is off. So turn on and flip all the switches to the right.
    * Thus, bulb at `(1)` is 1 but bulb at `(2)` has now changed from **1** to **0**
    * Thus, the resulting array is now `[1, 1, 0]`
    * **switch** flipped once.
* At index `3`, bulb is `0`. So the switch is flipped to turn it on.
    * The resulting array is now `[1, 1, 1]`
    * **switch** flipped twice.
* Thus, ***output*** is `2`

### Example 2
**Input**: [0, 0, 0]       <br />
**Output**: 1       <br />
**Explanation**:       <br />
* At index `1`, bulb is turned off `(0)`. So we flip the switch.
  * The resulting array becomes `[1, 1, 1]`
* Thus, ***output*** is `1`
   
### Example 3
**Input**: [1, 1, 1]       <br />
**Output**: 0       <br />
**Explanation**:       <br />
All the bulbs are turned on so no need to flip the switches.   
