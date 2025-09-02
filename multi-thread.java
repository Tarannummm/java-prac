/**
 * File-1
 * Using Runnable Interface
 */
class Multi3 implements Runnable {
    public void run(){
        System.out.println("Thread is running...");
    }
}

public class MultiThread {
    public static void main(String[] args) {

        // Create a thread using Runnable Interface
        Multi3 m1 = new Multi3();
        Thread t1 = new Thread(m1);

        // Start the thread
        t1.start();

        try {
            // Wait for the thread to complete before proceeding
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All threads have finished.");
    }
}




/**
 * File-2
 * Using Extends Thread
 */
public class MyThread extends Thread {

    // Name of the thread
    private String thread_name;

    // Constructor
    MyThread(String name) {
        this.thread_name = name;
    }

    // Override the run() method to define the thread's task
    public void run() {
        // Loop to simulate some repetitive task
        for (int i = 1; i <= 5; i++) {
            System.out.println(thread_name + "-count: " + i);
            try {
                // Pause the thread for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(thread_name + " interrupted.");
            }
        }

        System.out.println(thread_name + " finished.");
    }


    public static void main(String[] args) {
        // Create three thread instances with different names
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Start all three threads
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            // Wait for all threads to complete before proceeding
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All threads have finished.");
    }
}






-