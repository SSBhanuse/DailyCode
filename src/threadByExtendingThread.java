//Creating thread by extending Thread class

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i=0;
        while (i<6) {
            System.out.println("Thread is driving...");
            i++;
        }
    }
}

class MyThread2 extends Thread {  //Thread class is a built-in class in Java that provides methods for creating and managing threads.
    @Override
    public void run() { // run() method is used to define the code that will be executed by the thread when it is started
        int i=0;
        while (i<6) {
            System.out.println("Thread is calling...");
            i++;
        }
    }
}

public class threadByExtendingThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start(); // start() method is used to start the thread and call the run() method
        t2.start();
    }

}
