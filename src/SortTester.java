import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {49, 60, 89, 46, 88, 37, 75, 6, 96, 66, 75, 20, 76, 74, 71, 43,
            62, 82, 24, 21};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {49, 60, 89, 46, 88, 37, 75, 6, 96, 66, 75, 20, 76, 74, 71, 43,
            62, 82, 24, 21};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
