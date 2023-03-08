package PL.modul5;
import java.util.*;

public class Mengurutkan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Tugas 1
        int[] array = { -75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30 };
        System.out.print("\nArray: " + Arrays.toString(array) + "\n");

        Arrays.sort(array);
        System.out.println("Result : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = 0;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nSearch : ");
        int search = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                System.out.println("Array :" + search + " ada di index: " + i);
            }
        }

        //Tugas 3
        int len = array.length;
        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;

        for (int i = 0; i < len; i++) {
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            } else if (array[i] == 0) {
                zeroCount++;
            }
        }

        System.out.println("");
        System.out.printf("Positive\t: %1.2f \n", positiveCount / len);
        System.out.printf("Negative\t: %1.2f \n", negativeCount / len);
        System.out.printf("Zero\t\t: %1.2f \n", zeroCount / len);
    }
}