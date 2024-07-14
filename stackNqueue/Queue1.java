package stackNqueue;

public class Queue1 {
    static class que {
        static int arr[];
        static int size;
        static int rear = -1;

        que(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // enqueue-O(1)
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // dequeue-O(n)
        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;

        }

        // peek-O(n)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];

        }

    }

    public static void main(String[] args) {
        que q = new que(10);
        q.add(10);
        q.add(15);
        q.add(25);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
