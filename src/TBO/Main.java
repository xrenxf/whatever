package TBO;

/**
 @author Eka Apritasari (202110370311118)
 **/

import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main extends Factoring{

    static Scanner in = new Scanner(System.in);
    static String FirstInput;
    static int [] inNumber = {} ;
    static String [] inString = {} ;
    static int indexNumbers = 0 , indexString = 0;
    static int set;
    static boolean UserInput = true;
    static  String Lanjut;

    public static void main(String[] args) throws Exception{
        Input();
        Read("string");
        Read("numbers");
    }

    /**
     Check Input
     @If user Input String will Store at variable inString
     @If user Input Number will Store at variable inNUmber
     **/

    public static void Input() throws  Exception{
        try {
            while (UserInput) {
                Scanner xd = new Scanner(System.in);
                System.out.println("Input DataPraktikan : ");
                FirstInput = xd.nextLine();

                if (CheckNum(FirstInput)) {
                    inNumber = Arrays.copyOf(inNumber, inNumber.length + 1);
                    inNumber[indexNumbers] = Integer.parseInt(String.valueOf(FirstInput));
                    AddNum(inNumber[indexNumbers]);
                    indexNumbers++;
                } else {
                    inString = Arrays.copyOf(inString, inString.length + 1);
                    inString[indexString] = FirstInput;
                    AddString(inString[indexString]);
                    indexString++;
                }

                System.out.println("Apakah anda akan Input lagi? ");
                Lanjut = in.next();
                UserInput = Lanjut.equalsIgnoreCase("y");

            }
        }

        catch (InputMismatchException as) {
            System.out.println(as);
            System.out.println();
        }
    }

    /**
     Read DataPraktikan
     @If user input string, data will show at case "String" at line 72
     @If user input number, data will show at case "number" at line
     @Or user input both, it will show all at same time
     **/

    public static void Read(String reads) throws Exception {
        switch (reads) {
            case "string" -> {
                try {
                    FileReader ReadString = new FileReader("InputString.txt");
                    BufferedReader BuffString = new BufferedReader(ReadString);
                    String input = BuffString.readLine();
                    System.out.printf("DataPraktikan in String: \n");

                    while (input !=null) {
                        StringTokenizer xy = new StringTokenizer(input, ",");
                        System.out.println(xy.nextToken() + " ");
                        input = BuffString.readLine();
                    }

                    BuffString.close(); ReadString.close();
                }

                catch (FileNotFoundException a) {
                    System.out.println(a);
                }
            }

            case "numbers" -> {
                try {
                    FileReader ReadNumber = new FileReader("InputNumbers.txt");
                    BufferedReader BuffNumber = new BufferedReader(ReadNumber);
                    String input = BuffNumber.readLine();

                    System.out.printf("\nDataPraktikan in Numbers: \n");
                    while (input != null) {
                        StringTokenizer xy = new StringTokenizer(input, ",");
                        System.out.println(xy.nextToken()+ " ");
                        input = BuffNumber.readLine();
                    }

                    System.out.printf("\n");
                    BuffNumber.close(); ReadNumber.close();
                }

                catch (FileNotFoundException a){
                    System.out.println(a);
                }
            }
        }
    }
}