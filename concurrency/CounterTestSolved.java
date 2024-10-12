class Counter {
	int count = 0;
	boolean bUpdated = false;

    // thread safe
	public synchronized void increment() {
		while (bUpdated) {
			try {
				wait();
			}
			catch (InterruptedException iex) {
				System.out.println("increment() wait problem: "+iex);
			}
		}
		count++;
		System.out.println("increment() : "+count);
		bUpdated = true;
		notify();
	}

    // thread safe
	public synchronized int getCount() {
		while (!bUpdated) {
			try {
				wait();
			}
			catch (InterruptedException iex) {
				System.out.println("getCount() wait problem: "+iex);
			}
		}
		System.out.println("getCount() : "+count);
		bUpdated = false;
		notify();
		return count;
	}
}

class Incrementor extends Thread {
	Counter cnt;

	public Incrementor(Counter c) {
		cnt = c;
	}

	public void run() {
		for (int i=0; i<5; i++)
			cnt.increment();
	}
}

class CountReader extends Thread {
	Counter cnt;

	public CountReader(Counter c) {
		cnt = c;
	}

	public void run() {
		for (int i=0; i<5; i++)
			cnt.getCount();
	}
}

public class CounterTestSolved {

	public static void main(String[] args) {
		Counter cnt = new Counter();

		Thread incThread = new Incrementor(cnt);
		Thread cntThread = new CountReader(cnt);

		incThread.start();
		cntThread.start();
	}

} 
