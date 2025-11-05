# 💹 Best Time to Buy and Sell Stock

### 📘 Problem Summary

Given an array `prices[]`, where each element represents the stock price on a particular day,
we need to find the **maximum profit** possible by choosing one day to buy and a later day to sell.
If no profit is possible, return 0.

---

### ⚙️ Approach Used

**One-pass scanning technique:**

1. Track the minimum stock price seen so far (`minPrice`).
2. For each day’s price, calculate the potential profit = `price - minPrice`.
3. Update `maxProfit` whenever a higher profit is found.

This avoids nested loops (O(n²)) and achieves **O(n)** time with **O(1)** space.

---

### 🧠 Key Learnings

* Learned how to optimize brute-force solutions using **single-pass scanning**.
* Understood how maintaining a **running minimum** helps in dynamic decision making.
* Strengthened pattern recognition for problems where you must track **min/max difference** over time.
* Practiced updating values on-the-go without additional data structures.

---

### 💻 Complexity Analysis

* **Time:** O(n) — traversing prices once
* **Space:** O(1) — only two variables used

---

### 🧩 Code Reference

File: [`Arrays/Problems/BestTimeToBuyAndSellStock.java`](../../Arrays/Problems/BestTimeToBuyAndSellStock.java)

---

### 🔍 What to Explore Next

* Variations like **Best Time to Buy and Sell Stock II** (multiple transactions allowed).
* Using **prefix-minimum / suffix-maximum** arrays for visualization.
* Introduction to **Kadane’s Algorithm** (next logical step for array max subarray problems).