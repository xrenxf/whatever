package PL.modul1;

public class Tugas1 {
    public static void main(String[] args){
        int[] arr = new int[5];
        try {
            arr[5] = 25;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}