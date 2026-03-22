class ThreadPriority1 extends Thread {
    ThreadPriority1 (String name) {
        super(name);
    }
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Thread Name: " + this.getName());
        }
    }
}

public class threadPriorities {
    public static void main(String[] args) {
        ThreadPriority1 t1 = new ThreadPriority1("Sanket(High Priority)");
        ThreadPriority1 t2 = new ThreadPriority1("Suresh");
        ThreadPriority1 t3 = new ThreadPriority1("Bhanuse");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
