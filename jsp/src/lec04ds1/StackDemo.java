package lec04ds1;

public class StackDemo {
    static class Stack {
        int[] data = new int[10000];
        int top = -1;

        void push(int x) {
            data[++top] = x;
        }//O(1)

        int peek() {
            return data[top];
        }//O(1)

        void pop() {
            --top;
        }//O(1)

        boolean empty() {
            return top == -1;
        }//O(1)

        @Override
        public String toString() {
            StringBuffer buf=new StringBuffer();
            for(int i=0;i<=top;i++)
                buf.append(data[i]);
         return buf.toString();
        }
    }

    public static void main(String[] args) {
        Stack S = new Stack();
        for (int i = 0; i < 10; i++) {
            S.push(i);
           // System.out.println(S);
        }
        while (!S.empty()) {
            System.out.println(S.peek());
            S.pop();
        }
    }
}
