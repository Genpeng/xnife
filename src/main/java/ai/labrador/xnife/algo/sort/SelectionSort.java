package ai.labrador.xnife.algo.sort;

import java.util.Arrays;

/**
 * Implementation of selection sort algorithm.
 *
 * References:
 * 1. https://sort.hust.cc/2.selectionsort
 * 2. https://runestone.academy/runestone/books/published/pythonds/SortSearch/TheSelectionSort.html
 * 3. https://time.geekbang.org/column/article/41802
 *
 * @author  Genpeng Xu
 */
public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {
//            System.out.print(i + ":");
            int minIndex = i;
            for (int j = i + 1; j < n; ++j) {
//                System.out.print(" " + j);
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
//            System.out.println();
            if (minIndex != i) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
