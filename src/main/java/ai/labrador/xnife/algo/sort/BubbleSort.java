package ai.labrador.xnife.algo.sort;

import java.util.Arrays;

/**
 * Implementation of bubble sort algorithm.
 *
 * References:
 * 1. https://sort.hust.cc/1.bubblesort
 * 2. https://runestone.academy/runestone/books/published/pythonds/SortSearch/TheBubbleSort.html
 * 3. https://time.geekbang.org/column/article/41802
 *
 * @author  Genpeng Xu
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {
//            System.out.print(i + ":");
            boolean isExchange = false;
            for (int j = 0; j < n - 1 - i; ++j) {
//                System.out.print(" " + j);
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    isExchange = true;
                }
            }
//            System.out.println();
            if (!isExchange) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
