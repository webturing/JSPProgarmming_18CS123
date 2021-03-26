package lec04ds1;

public class QueueDemo {
    static class Queue {
        //data[head,tail)
        int[] data = new int[10];
        int head = 0;
        int tail = 0;

        void push(int x) {
            data[tail++] = x;
        }

        void pop() {
            ++head;
        }

        int front() {
            return data[head];
        }

        void print() {
            for (int i = head; i < tail; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
        boolean empty(){
            return head>=tail;
        }

    }

    public static void main(String[] args) {
            Queue Q=new Queue();
            for(int i=0;i<20;i++){
                Q.push(i);
                Q.print();
                Q.pop();
            }
            while(!Q.empty()){
                Q.pop();
                Q.print();
            }
    }
}
