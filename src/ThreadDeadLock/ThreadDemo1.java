package ThreadDeadLock;
import java.lang.*;

import static ThreadDeadLock.Deadlock.object1;
import static ThreadDeadLock.Deadlock.object2;

public class ThreadDemo1 extends Thread{

    public void run() {

        synchronized (object1) {
            System.out.println("Thread 1: Holding lock 1...");

            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Thread 1: Waiting for lock 2...");

            synchronized (object2) {
                System.out.println("Thread 1: Holding lock 1 & 2...");
            }
        }
    }
}

