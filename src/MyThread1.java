import java.security.PublicKey;

public class MyThread1 extends Thread {
    Table table = new Table();

    public MyThread1(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.displayTable(5);
    }
}
