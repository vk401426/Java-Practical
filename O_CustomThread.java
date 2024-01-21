// Custom thread class extending Thread
class CustomThread extends Thread {
    private String threadName;

    // Constructor to set the thread name
    public CustomThread(String name) {
        this.threadName = name;
    }

    // Run method that will be executed when the thread starts
    public void run() {
        System.out.println("Thread " + threadName + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + threadName + ": Count " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadName + " interrupted.");
            }
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}

public class O_CustomThread {
    public static void main(String[] args) {
        // Create three threads using CustomThread class
        CustomThread thread1 = new CustomThread("Thread 1");
        CustomThread thread2 = new CustomThread("Thread 2");
        CustomThread thread3 = new CustomThread("Thread 3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
