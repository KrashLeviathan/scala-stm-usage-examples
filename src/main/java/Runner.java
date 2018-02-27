import scala.concurrent.stm.examples.ConcurrentIntList;

public class Runner {
    public static void main(String[] args) {
        ConcurrentIntList list = new ConcurrentIntList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println(list.toString());
    }
}
