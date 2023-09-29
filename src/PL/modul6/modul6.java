package PL.modul6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kristin
 *
 */

public class modul6 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("            MENU");
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Exit");
        System.out.println("===========================");

        while(true){
            System.out.print("Menu : ");
            int choose = in.nextInt();
            switch(choose){
                case 1 :
                    boolean cek = false;
                    String fileName = "src/Modul6.txt";
                    Scanner input = new Scanner(System.in);

                    do {
                        try {
                            System.out.print("Index : ");
                            int n = input.nextInt();
                            cek = true;

                            String[] temp = new String[n];
                            String[] inString = new String[n];
                            int[] inNumber = new int[n];

                            for (int i = 0; i < temp.length; i++) {
                                System.out.print("Index Of " + i + " : ");
                                if (input.hasNextInt()) {
                                    inNumber[i] = input.nextInt();
                                } else {
                                    inString[i] = input.next();
                                }
                            }

                            System.out.println("\nString");
                            for (int i = 0; i < inString.length; i++) {
                                System.out.println("Index ke " + i + " : " + inString[i]);
                            }

                            System.out.println("\nNumber");
                            for (int i = 0; i < inNumber.length; i++) {
                                System.out.println("Index ke " + i + " : " + inNumber[i]);
                            }

                            try (FileWriter buatFile = new FileWriter(fileName, true)) {
                                buatFile.write(Arrays.toString(inString) + ";" + Arrays.toString(inNumber) + ";" + "\n");
                                buatFile.close();
                                System.out.println("File Create\n");
                            }
                        }

                        catch (InputMismatchException e) {
                            System.err.println("Input Angka\n");
                            cek = false;
                            input.next();
                        }

                        catch (IOException e) {
                            System.err.println("File sudah ada");
                            input.next();
                        }
                    } while (!(cek));
                    break;

                case 2 :
                    try {
                        File myFile = new File("src/Modul6.txt");
                        Scanner fileReader = new Scanner(myFile);

                        while(fileReader.hasNextLine()){
                            String data = fileReader.nextLine();
                            System.out.println(data);
                        }

                    } catch (FileNotFoundException e) {
                        System.out.println("\nFile Not Found\n");
                        e.printStackTrace();
                    }
                    break;

                case 3 :
                    System.exit(0);
            }
        }
    }
}