# 820. Short Encoding of Words

A **valid encoding** of an array of `words` is any reference string `s` and an array of `indices` such that:
* `words.length == indices.length`
* The reference string `s` ends with `#` character.
* For each index `indices[i]`, the **substring** of `s` starting from `indices[i]` 
  and up to (but not including) the next `#` character is equal to `words[i]`
  
Given an array of `words`, *return the **length of the shortest reference string** `s`
possible of any **valid encoding** of `words`*

Constraints:
============
*    `1 <= words.length <= 2000`
*    `1 <= words[i].length <= 7`
*    `words[i]` consists of *only lowercase letters*.


Examples
--------

### Example 1
**Input**: `words = ["time", "me", "bell"]` <br />
**Output**: `10`                            <br />
**Explanation**: <br /> 
A <u>valid encoding</u> would be `s = "time#bell#"` and `indices = [0, 2, 5]`. <br />
`words[0] = "time"`, the substring of **s starting from indices[0] = 0 to the next '#'** 
is underlined in "<u>time</u>#bell#"   <br />
`words[1] = "me"`, the substring of **s starting from indices[1] = 2 to the next '#'**
is underlined in "ti<u>me</u>#bell#"       <br />
`words[2] = "bell"`, the substring of **s starting from indices[2] = 5 to the next '#'**
is underlined in "time#<u>bell</u>#"     <br />

### Example 2:

**Input**: words = ["t"]    <br />
**Output**: 2   <br />
**Explanation**: 
A valid encoding would be `s = "t#"` and `indices = [0]`.   <br />

