class Counter {
	int count = 0;

	void increment() {
		count++;
	}

	int getCount() {
		return count;
	}
}

class RaceThread extends Thread {
	private Counter cnt;

	public RaceThread(Counter cnt) {
		this.cnt = cnt;
	} 

	public void run() {
		for (int i = 0; i< 1000;i++)
			cnt.increment();
	}
}

public class RaceTwo {
	public static void main(String[] args) {
		Counter cnt = new Counter();

		Thread t1 = new RaceThread(cnt);
		Thread t2 = new RaceThread(cnt);
		Thread t3 = new RaceThread(cnt);
		Thread t4 = new RaceThread(cnt);

		t1.start(); t2.start(); t3.start(); t4.start();

		try {
			t1.join(); t2.join(); t3.join(); t4.join();
		} 
		catch (InterruptedException iex) {
			System.out.println("Interrupted : "+iex);
		}

		System.out.println("Count: "+cnt.getCount());
	}
}
