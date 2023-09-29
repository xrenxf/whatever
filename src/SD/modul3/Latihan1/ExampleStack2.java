package SD.modul3.Latihan1;

public class ExampleStack2 {
    public static class Stack {
        private int maxSize;
        private String[] stackArray;
        private int top;

        public Stack(int size) {
            maxSize = size;
            stackArray = new String[maxSize];
            top = -1;
        }

        public void push(String value) {
            stackArray[++top] = value;
        }

        public String pop() {
            return stackArray[top--];
        }

        public String peek() {
            return stackArray[top];
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public int tosearch(String value) {
            int index = -1;
            for (int i = 0; i <= top; i++) {
                if (stackArray[i] == value) {
                    index = i;
                    break;
                }
            }
            return index;
        }

        public static void main(String[] args) {
            Stack stack = new Stack(5);
            stack.push("Aku");
            stack.push("Anak");
            stack.push("Indonesia");
            System.out.println("Next : " + stack.peek());
            stack.push("Raya");
            System.out.println(stack.pop());
            stack.push("!");

            int count = stack.tosearch("Aku");
            while (count != -1 && count > 1){
                stack.pop();
                count--;
            }
            System.out.println(stack.pop());
            System.out.println(stack.isEmpty());
        }
    }

}