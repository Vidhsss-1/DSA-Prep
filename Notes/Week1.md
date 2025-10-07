# Week 1 – Arrays and Basics

## Problem: Two Sum (#1)
**Concepts Learned:**
- How to use `HashMap` in Java (`put`, `get`, `containsKey`)
- Array iteration using for loop
- Returning an array from a function

**Approach:**
Used a HashMap to store values and indices while iterating.
For each number, check if (target - num) is already in the map.
If yes, return both indices.

**Complexity:**
- Time: O(n)
- Space: O(n)