public class Reentrant{
    public synchronized static void m(){
        n();
        System.out.println("This is m() methd");
    }

    public synchronized static void n(){
        System.out.println("This is n() method");
    }

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                m();
            }
        }.start();
    }
}