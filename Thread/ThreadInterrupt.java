public class ThreadInterrupt extends Thread {

    public void run() {
        for (int i = 0; i < 2; i++) {
            if (interrupted()) {
                System.out.println("Thread is interrupted");
            } else {
                System.out.println("Normal Thread");
            }
        }
    }

    public static void main(String[] args) {
        ThreadInterrupt t1 = new ThreadInterrupt();
        ThreadInterrupt t2 = new ThreadInterrupt();

        t1.start();
        t1.interrupt();
        t2.start();
    }

}