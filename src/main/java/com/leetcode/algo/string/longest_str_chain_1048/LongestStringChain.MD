# 1048. Longest String Chain

You are given an array of `words` where each word consists of lowercase English letters.

`wordA` is a **predecessor** of `wordB` <u>if and only if</u> 
we can *insert **exactly** one letter anywhere* in `wordA` **without** changing the <u>order</u> 
of the other characters to make it *equal* to `wordB`.

* For example, 
  * "`abc`" is a **predecessor** of "`abac`",
  * while "`cba`" is **not a predecessor** of "`bcad`".

A **word chain** is a *sequence of words* 
`[word1, word2, ..., wordk]` with `k >= 1`, 
where `word1` is a **predecessor** of `word2`,
`word2` is a **predecessor** of `word3`, and so on.
A single word is trivially a word chain with `k == 1`.

Return the length of the longest possible word chain with words chosen from the given list of words.

Constraints:
===========
*    <code>1 <= words.length <= 1000</code>
*    <code>1 <= words[i].length <= 16</code>
*    <code>words[i]</code> only consists of lowercase English letters.
 
                          
## Examples

### Example 1
**Input***: `words = ["a","b","ba","bca","bda","bdca"]` <br />
**Output***: `4` <br />
**Explanation***: One of the longest word chains is `["a","ba","bda","bdca"]`. <br />

### Example 2
**Input***: `words = ["xbc","pcxbcf","xb","cxbc","pcxbc"]` <br />
**Output***: `5` <br />
**Explanation***:   All the words can be put in a word chain `["xb", "xbc", "cxbc", "pcxbc", "pcxbcf"]`. <br />

### Example 3
**Input***: `words = ["abcd","dbqca"]` <br />
**Output***: `1` <br />
**Explanation***:   The trivial word chain `["abcd"]` is one of the longest word chains.
                    `["abcd","dbqca"]` is not a valid word chain because the ordering of the letters is changed. <br />
