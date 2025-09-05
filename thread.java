
// class MyThread extends Thread {
//     public void run() {
//         System.out.println("Thread is running");
//     }
// }
class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + "-count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " Inturrupted");
            }
        }
        System.out.println(threadName + " Finished.");
    }
}

class CT implements Runnable // 2nd way
{
    public void run() {
        System.out.println("Thread is running");
    }
}

public class thread {
    public static void main(String[] args) {
        // MyThread t1 = new MyThread();
        // t1.start();

        // CT m1 = new CT();
        // Thread t2 = new Thread(m1);
        // t2.start();
        MyThread t1 = new MyThread("Thread1");
        MyThread t2 = new MyThread("Thread2");
        MyThread t3 = new MyThread("Thread3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread inturrupted.");
        }

        System.out.println("All thread have finished.");

    }

}
