class BeforeShutdown extends Thread{
    public void run(){
        System.out.print("Shutting down...");
        try{
            for (int i = 0; i < 4; i++) {
                System.out.print(" "+i);
                Thread.sleep(200);
            }
           
        } catch(InterruptedException e){
            System.out.println("Sorry!!" + e);
        }
    }
}