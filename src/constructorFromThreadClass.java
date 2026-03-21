class MyThread extends Thread {
    MyThread(String name) {
        super(name);
        /* The constructor of the MyThread class takes a String parameter called name and passes it to the constructor of the Thread class using the super() keyword.
        This allows us to set the name of the thread when we create an instance of MyThread.*/
    }
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class constructorFromThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread1");
        MyThread t2 = new MyThread("Thread2");
        t1.start();
        System.out.println("Main thread id is "+ t1.threadId()); // The threadId() method is used to get the unique identifier of the thread. It returns a long value that represents the thread's ID.
        System.out.println("Main thread id is "+ t2.threadId());
        System.out.println("Main thread name is "+ t1.getName());// The getName() method is used to get the name of the thread. It returns a String value that represents the thread's name.
        System.out.println("Main thread name is "+ t2.getName());
    }
}
