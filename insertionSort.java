Implement a function that takes an array of integers as input and returns a sorted version of the array using the Insertion Sort algorithm.
Sample Input
array = (8, 5, 2, 9, 5, 6, 3]
Sample Output
[2, 3, 5, 5, 6, 8, 9]


class Program {
public static int[] insertionSort(int[] array) {
  // Tc: O(n^2)
int len  = array. length;
for(int i = 1; i < len; i++)
{
int key = array[I];
int j- i - 1;
while(j >= 0 && array[j] > key)
{
array[j+1] =array[j];
j = j-1;
}
array[j+1] = key;
}
return array;
}
}
