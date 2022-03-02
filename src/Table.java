public class Table {
    public synchronized void displayTable(int n) {
        System.out.println("Run thread");
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
