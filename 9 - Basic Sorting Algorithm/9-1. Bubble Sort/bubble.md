# bubble sort

Bubble sort, sometimes referred to as sinking sort, is a
simple sorting algorithm that repeatedly steps through
the list to be sorted, compares each pair of adjacent
items and swaps them if they are in the wrong order
(ascending or descending arrangement). The pass through
the list is repeated until no swaps are needed, which
indicates that the list is sorted.

![Algorithm Visualization](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)

## Complexity

| Name                  | Best            | Average             | Worst               | Memory    | Stable    | Comments  |
| --------------------- | :-------------: | :-----------------: | :-----------------: | :-------: | :-------: | :-------- |
| **Bubble sort**       | n               | n<sup>2</sup>       | n<sup>2</sup>       | 1         | Yes       |           |

## Algorithm 
In Bubble Sort algorithm, 
<br>
- traverse from left and compare adjacent elements and the higher one is placed at right side.  <br>
- In this way, the largest element is moved to the rightmost end at first.  <br> 
- This process is then continued to find the second largest and place it and so on until the data is sorted.<br>
<br><br>

# Implimention
repeat (numOfElements - 1) times <br>
  set the first unsorted element as the minimum <br>
  for each of the unsorted elements <br>
    if element < currentMinimum <br>
      set element as new minimum <br>
  swap minimum with first unsorted position <br>