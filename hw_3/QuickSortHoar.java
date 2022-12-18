package hw_3;

import java.util.Scanner;

/**
 * QuickSort быстрая сортировка(метод Хоара})
 */

public class QuickSortHoar {

    public static void main(String[] args) {
        System.out.println();
        int size = getValue("Введите длину массива: ");
        int[] arr = create(size);
        fill(arr);

        System.out.println();
        System.out.println("QuickSort быстрая сортировка");
        System.out.println();
        System.out.println("Несортированный массив");
        printArray(arr);
        System.out.println();

        quickSort(arr, 0, size - 1);

        System.out.println("Сортированный массив");
        printArray(arr);
    }

    static int getValue(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        int size = input.nextInt(); 
        return size;
    }

    static int[] create(int count) {
        int array[] = new int[count];
        return array;
    }

    static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40) - 10);
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return; 

        if (low >= high)
            return; 

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}    