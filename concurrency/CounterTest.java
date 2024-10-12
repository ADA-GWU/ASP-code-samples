class Counter {
	int count = 0;

	public synchronized void increment() {
		count++;
		System.out.println("increment() : "+count);
	}

	public synchronized int getCount() {
		System.out.println("getCount() : "+count);
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

public class CounterTest {

	public static void main(String[] args) {
		Counter cnt = new Counter();

		Thread incThread = new Incrementor(cnt);
		Thread cntThread = new CountReader(cnt);

		incThread.start();
		cntThread.start();
	}

} 
