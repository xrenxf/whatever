package PBO.percobaan;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Coba {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};

        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("nilai array ke : ");
        int index = userInput.nextInt();

        //exception handling (try, catch, finnaly)
        System.out.println("Handling out of bound");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        //runtime error jika file tidak ada
        System.out.println("Handling IO not found");
        try{
            fileInput = new FileInputStream("input.txt");
        } catch(IOException e){
            System.err.println(e);
        }

        //menggabungkan 2 exception
        System.out.println("menggabungkan 2 exception");
        try{
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("index yang anda masukan tidak sesui dengan jumlah array");
        } catch (IOException e){
            System.err.println("file tidak ditemukan");
        }

        //finally
        System.out.println("menambahkan finally");
        try{
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("index yang anda masukan tidak sesui dengan jumlah array");
        } finally {
            System.out.println("finally");
        }

        System.out.println("\nakhir dari program");
    }
}
/*saat membuat/membuka file membutuh exception
karena ini menjadi syarat yang dipakai java untuk memdeteks exception
kalau terjadi sesuatu tidak mau mengcompile
 */