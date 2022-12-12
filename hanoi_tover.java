import java.util.Scanner;

public class hanoi_tover {
    public static void move(int n, int startPole, int endPole) {
       if (n == 0) {
          return;
       } 
       int intermediatePole = 6 - startPole - endPole;
       move(n-1, startPole, intermediatePole);
       System.out.println("Переместить " + n + " из " + startPole + " в " +endPole);
       move(n-1, intermediatePole, endPole);
    }
    
    static int getValue(String text) { 
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        int size = input.nextInt();
        return size;
    }

    public static void main(String[] args) {
        int size = getValue("Введите длину массива: ");
        System.out.println("\nРешение Ханйоской башни, число дисков: " + size);
        move(size, 1, 3);
    }
} 

