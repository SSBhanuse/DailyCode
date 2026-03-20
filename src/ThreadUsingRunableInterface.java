//Creating thread using Runnable interface

class Thread1 implements Runnable { // Runnable is a functional interface in Java that represents a task that can be executed by a thread.
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
             System.out.println("Wheels missing");
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Bike not working");
        }
    }
}

public class ThreadUsingRunableInterface {
    public static void main(String[] args) {
        // Creating an instance of the Thread1 class, which implements the Runnable interface.
        Thread1 wheel1 = new Thread1();
        /* Creating a new thread and passing the instance of the Thread1 class to the Thread constructor.
         This allows the thread to execute the run() method defined in the Thread1 class when it is started.*/
        Thread bike1 = new Thread(wheel1);

        Thread2 wheel2 = new Thread2();
        Thread bike2 = new Thread(wheel2);
        bike1.start(); // start() method is used to start the thread and call the run() method defined in the Thread1 class.
        bike2.start();
    }
}
