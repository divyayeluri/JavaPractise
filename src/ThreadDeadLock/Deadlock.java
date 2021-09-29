package ThreadDeadLock;

public class Deadlock {
    public static Object object1 = new Object();
    public static Object object2 = new Object();

    public static void main(String args[]) {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
       // T1.start();
        T2.start();
    }
}
