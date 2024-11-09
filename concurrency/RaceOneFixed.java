class RaceThread extends Thread {
	public static int count;

	static synchronized void increment() {
		int temp = count;
		temp = temp + 1;
		count = temp;
	}	 

	public void run() {
		for (int i = 0; i< 1000;i++)
			increment();
	}
}

public class RaceOneFixed {
	public static void main(String[] args) {
		RaceThread.count = 0;

		Thread t1 = new RaceThread();
		Thread t2 = new RaceThread();
		Thread t3 = new RaceThread();
		Thread t4 = new RaceThread();

		t1.start(); t2.start(); t3.start(); t4.start();

		try {
			t1.join(); t2.join(); t3.join(); t4.join();
		} 
		catch (InterruptedException iex) {
			System.out.println("Interrupted : "+iex);
		}

		System.out.println("Count: "+RaceThread.count);
	}
}
