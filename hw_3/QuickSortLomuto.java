package hw_3;

import java.util.Scanner;

/**
 * QuickSort быстрая сортировка(метод Ломуто)
 */

public class QuickSortLomuto {

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

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}