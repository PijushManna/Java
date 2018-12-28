import java.io.IOException;

class TestShutdownHook {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new BeforeShutdown());

        System.out.println("thread is sleeping press ctrl+c to exit");
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
        }
        int avail = r.availableProcessors();
        System.out.println("Availaible processors: " + avail);
        System.out.println("Free Memory " + r.freeMemory() / 1024);
        System.out.println("Availaible Memory " + r.totalMemory() / 1024);
        try {
            r.exec("notepad");
        } catch (IOException e) {
            System.out.println("App not found " + e);
        }
    }
}