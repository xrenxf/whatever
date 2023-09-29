package SD.modul3;
import java.util.Scanner;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        String input = sc.nextLine();
        Stack stack = new Stack(20);
        System.out.println("String yang dibalik: " + stack.ReverseString(input));
    }
}

class Stack {
    int maxSize;
    char[] array;
    int top = -1; //stak kosong

    public Stack(int size) {
        maxSize = size;
        array = new char[maxSize];
    }
    //menambah elemen
    public void push(char value) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            array[++top] = value;
        }
    }
    //hapus elemen teratas dari stack
    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return '\0';
        } else {
            char value = array[top--];
            return value;
        }
    }
    //akan mengembalikan nilai true jika top = size -1 yg menandakan stack penuh
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //cek, true jika stack kosong
    public boolean isEmpty() {
        return top == -1;
    }

    public String ReverseString(String input) {
        char[] ReverseString = new char[input.length()];
        //memasukan string ke stack
        for (int i = 0; i < input.length(); i++) {
            push(input.charAt(i));
        }
        int i = 0;
        while (!isEmpty()) {
            ReverseString[i++] = pop();
        }
        return new String(ReverseString);
    }
}