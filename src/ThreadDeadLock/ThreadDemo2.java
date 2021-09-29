package ThreadDeadLock;
import java.lang.*;

import static ThreadDeadLock.Deadlock.object1;
import static ThreadDeadLock.Deadlock.object2;

public class ThreadDemo2 extends Thread {


        public void run() {
            synchronized (object2) {
                System.out.println("Thread 2: Holding lock 2...");

                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (object1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
}
