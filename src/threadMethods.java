class MyThread3 extends Thread {
    MyThread3(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Thread is running." + this.getName());
            try {
                Thread.sleep(10);
                // The sleep() method is used to pause the execution of the current thread for a specified amount of time.
                // In this case, the thread will sleep for 10 milliseconds before continuing with the next iteration of the loop.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread4 extends Thread {
    MyThread4(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Thread is running." + this.getName());
        }
    }
}

public class threadMethods {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("Sanket");
        MyThread4 t2 = new MyThread4("Bhanuse");
        t1.start();
        try {
            t1.join();
            // The join() method is used to wait for a thread to complete its execution before allowing the main thread to continue.
            // In this case, the main thread will wait for t1 to finish before starting t2.
        } catch (Exception e) {
            System.out.println(e);;
        }
        t2.start();
    }
}