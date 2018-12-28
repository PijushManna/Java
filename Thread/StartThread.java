class StartThread extends Thread{
	public void run(){
		System.out.println("Thread is running.....");
	}
	public static void main(String[] args) {
		StartThread th1 = new StartThread();
		th1.start();
		Thread th2 = new StartThread();
		th2.start();
	}
}