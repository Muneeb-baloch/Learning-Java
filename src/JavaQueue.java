//
 // Enque  (add)means the adding the element
// Dequeue (remove) the element from que
// Deque means on each side we can add or remove elements
// Front (peek) to check the front

public class JavaQueueone {

    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int size){
            arr = new int[size];
            this.size = size;
        }
        public static boolean isEmpty(){
            return rear ==-1;

        }
            // enqueue
        public static void  add(int data){
            if (data == size-1){
            System.out.println("Queue is full");
            return;}
            rear++;
            arr[rear] = data;

        }
        // dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
           int front = arr[0];
            for (int i=0; i<rear; i++){
                arr[i] = arr[i+1];

            }
            rear --;
            return front;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
            }
        }

    }

    public static void main(String[] args) {
        JavaQueueone.Queue q = new JavaQueueone.Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }


