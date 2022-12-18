package hw_3;

import java.util.Scanner;

/**
 * HeapSort сортировка кучей(пирамидальная)
 */

public class HeapSort {
    
        public static void main(String[] args) {
        System.out.println();
        int size = getValue("Введите длину массива: ");
        int[] arr = create(size);
        fill(arr);

        System.out.println();
        System.out.println("HeapSort сортировка кучей(пирамидальная)");
        System.out.println();
        System.out.println("Несортированный массив");
        printArray(arr);
        System.out.println();

        HeapSort ob = new HeapSort();
        ob.sort(arr);

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

    public void sort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
  
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2; 

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}