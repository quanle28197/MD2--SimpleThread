public class MyThread2 extends Thread {
    Table table = new Table();

    public MyThread2(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.displayTable(100);
    }
}
