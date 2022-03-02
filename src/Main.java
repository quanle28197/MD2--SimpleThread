public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        MyThread1 myThread1 = new MyThread1(table);
        MyThread2 myThread2 = new MyThread2(table);
        myThread2.setPriority(Thread.MAX_PRIORITY);
        myThread1.setPriority(Thread.MIN_PRIORITY);

        myThread2.start();

        myThread1.start();
    }
}
