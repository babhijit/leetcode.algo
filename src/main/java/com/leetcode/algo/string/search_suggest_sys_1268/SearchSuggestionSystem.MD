# 1268. Search Suggestions System

You are given an array of strings `products` and a string `searchWord`.

Design a system that suggests at most three products from `products` after  each character of `searchWord` is typed.
If there are more than three product with common prefix *return three lexicographically minimum products*.

Return **a list of lists of the suggested products are each character of searchWord** is typed.

Constraints
===========
*    <code>1 <= products.length <= 1000</code>
*    <code>1 <= products[i].length <= 3000</code>
*    <code>1 <= sum(products[i].length) <= 2 * 10<sup>4</sup></code>
*    <u>All</u> the strings of products are **unique**.
*    `products[i]` consists of lowercase English letters.
*    `1 <= searchWord.length <= 1000`
*    `searchWord` consists of lowercase English letters.

## Examples

### Example 1:

**Input**: `products = ["mobile","mouse","moneypot","monitor","mousepad"]`, `searchWord = "mouse"` </br >

**Output**: `[` <br />
`["mobile","moneypot","monitor"]`, <br />
`["mobile","moneypot","monitor"]`, <br />
`["mouse","mousepad"]`, <br />
`["mouse","mousepad"]`, <br />
`["mouse","mousepad"`] <br />
`]` <br />

**Explanation**: 
* products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"]
* After typing `m` all products match; we show user ["mobile","moneypot","monitor"]
* After typing `mo` all products match; we show user ["mobile","moneypot","monitor"]
* After typing `mou` the system suggests ["mouse","mousepad"]
* After typing `mous` the system suggests ["mouse","mousepad"]
* After typing `mouse` the system suggests ["mouse","mousepad"]

### Example 2:

**Input**: `products = ["havana"]`, `searchWord = "havana"` <br />
**Output**: `[["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]` <br />

###Example 3:

**Input**: `products = ["bags","baggage","banner","box","cloths"]`, `searchWord = "bags"`
**Output**: `[` <br />
`["baggage","bags","banner"]`,       # <- b        <br />
`["baggage","bags","banner"]`,       # <- ba       <br />
`["baggage","bags"]`,                # <- bag      <br />
`["bags"]`                           # <- bags     <br />
`]`
