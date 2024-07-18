# Selection Sort

Selection sort is a sorting algorithm, specifically an
in-place comparison sort. It has O(n2) time complexity,
making it inefficient on large lists, and generally
performs worse than the similar insertion sort.
Selection sort is noted for its simplicity, and it has
performance advantages over more complicated algorithms
in certain situations, particularly where auxiliary
memory is limited.

![Algorithm Visualization](https://upload.wikimedia.org/wikipedia/commons/b/b0/Selection_sort_animation.gif)

![Algorithm Visualization](https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif)

## Complexity

| Name                  | Best            | Average             | Worst               | Memory    | Stable    | Comments  |
| --------------------- | :-------------: | :-----------------: | :-----------------: | :-------: | :-------: | :-------- |
| **Selection sort**    | n<sup>2</sup>   | n<sup>2</sup>       | n<sup>2</sup>       | 1         | No        |           |

## Algorithm 

- Selection: Find the minimum element in the unsorted portion of the array.
- Swap: Swap the minimum element with the first element of the unsorted portion.
- Repeat: Move the boundary of the sorted portion one element to the right and repeat steps 1 and 2 until the entire array is sorted.