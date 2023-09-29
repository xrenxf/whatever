package PBO.percobaan;
import java.util.Scanner;

public class method {
    public static void main(String[] args) {

        int [] arrayData = {0, 1, 2, 3};

        Scanner userInput = new Scanner(System.in);
        System.out.println("data ke- : ");
        int indexInput = userInput.nextInt();

        //Exception biasa
        System.out.println("exception biasa");
        try {
            System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);
        } catch (Exception e){
            System.err.println(e);
        }

        //exception didalam fungsi
        System.out.println("exception dalam fungsi");
        int data = ambilDataDariArray(arrayData, indexInput);
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data);

        //exception throws by method
        System.out.println("exception throws by method");
        int data2 = 0;
        try {
            data2 = ambilData(arrayData, indexInput);
        } catch (Exception e){
            System.err.println(e);
        }
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data2);

        System.out.println("\n akhir dari program");
    }

    private static int ambilData(int[] array, int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }

    private static int ambilDataDariArray(int[] array, int index){
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e){
            System.err.println(e);
        }
        return hasil;
    }
}