package ai.labrador.xnife.algo.sort;

import java.util.Arrays;

/**
 * Implementation of insertion sort algorithm.
 *
 * References:
 * [1] https://sort.hust.cc/3.insertionsort
 * [2] https://runestone.academy/runestone/books/published/pythonds/SortSearch/TheInsertionSort.html
 * [3] https://time.geekbang.org/column/article/41802
 *
 * @author  Genpeng Xu
 */
public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int currElem = arr[i];
            int j = i;
            while (j > 0 && currElem < arr[j-1]) {
                arr[j] = arr[j-1];
                --j;
            }
            arr[j] = currElem;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
