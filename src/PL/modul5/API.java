package PL.modul5;
import java.util.*;

public class API {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = { -75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30 };
        System.out.print("\nArray: " + Arrays.toString(array) + "\n");

        Arrays.sort(array);
        System.out.println("Result : ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nSearch : ");
        int search = in.nextInt();
        System.out.println("Array " +search+ " ada di index ke-" +Arrays.binarySearch(array, search));
    }
}