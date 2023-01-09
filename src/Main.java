import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        System.out.println("Enter a size: ");
        size = input.nextInt();
        array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Min value of array is: " + min);
    }
}