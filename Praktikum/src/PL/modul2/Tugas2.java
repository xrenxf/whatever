package PL.modul2;
import java.util.Scanner;

public class Tugas2 {
    static class data{
        static String []book = new String[10];
        static String []place = new String[10];
        static int []dateArr =  new int[10];

        int iDate;
        int iBook;
        int iPlace;
        boolean exist_book;

        void cekName(String name) {
            for(int i=0; i < book.length; i++){
                if(name.equals(book[i])){
                    iBook = i;
                    exist_book = true;
                }
            }
        }

        void cekFrom(String from) {
            for(int i=0; i < place.length; i++){
                if(from.equals(place[i])){
                    iPlace = i;
                }
            }
        }

        void cekDate(int date){
            for(int i=0; i < dateArr.length; i++){
                if(date == dateArr[i]){
                    iDate = i;
                }
            }
        }

        void list() {
            for(int i=0; book[i] != null; i++) {
                System.out.println("=========================================");
                System.out.println("Name  = " + book[i]);
                System.out.println("Place = " + place[i]);
                System.out.println("Date  = " + dateArr[i]);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String name,place;
        int date;
        data a = new data();
        a.book[0] = "This is book";
        a.place[0] = "Malang";
        a.dateArr[0] = 2021;
        a.exist_book = false;
        a.iPlace= 0;
        a.iBook = 0;
        a.iDate = 0;
        int mty = 0;
        while(true){

            System.out.print("Name  : ");
            name = inp.nextLine();
            a.cekName(name);

            System.out.print("Place : ");
            place = inp.nextLine();
            a.cekFrom(place);

            System.out.print("Date  : ");
            date = inp.nextInt();
            a.cekDate(date);

            inp.nextLine();

            if(a.exist_book == true && a.iBook == a.iDate && a.iPlace == a.iBook){
                System.out.println("DATA BUKU TELAH ADA");
                continue;
            }else{
                for(int i=0; a.book[i] != null; i++) {
                    mty=i+1;
                }
                data.book[mty] = name;
                data.place[mty] = place;
                data.dateArr[mty] = date;
            }
            a.list();
        }
    }
}