class DeadlockDemo extends Thread {
    public static void main(String[] args) {
        final String r1 = "Arun Jaiswal";
        final String r2 = "Amit Jaiswal";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (r1) {
                    System.out.println("Thread 1: Resource 1 Blocked");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {

                    }
                }

                synchronized (r2) {
                    System.out.println("Thread 1: Resource 2 blocked");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (r2) {
                    System.out.println("Thread 2: Resource 2 Blocked");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {

                    }
                }

                synchronized (r1) {
                    System.out.println("Thread 2: Resource 1 blocked");
                }
            }
        };

        t1.start();
        t2.start();

    }
}