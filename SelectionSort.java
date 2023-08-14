Implement a function that takes an array of integers as input and returns a sorted version of the array using the Selection Sort algorithm.
Sample Input
array = [8, 5, 2, 9, 5, 6, 3]
Sample Output
[2, 3, 5, 5, 6, 8, 9]



class Program {
public static int[] selectionSort(int[] array) {
  //Time Complexity: O(n^2) 
for (int i = 0 ; i < array. length-1; i++)
{
int ind = i;
for (int j = 1÷1; j < array. length; j++)
{
if(array[j] < array[ind]) ind = j;
}
int temp = array[ind];
array [ind] = array[i];
array[i] = temp;
}
return array;
}
}
