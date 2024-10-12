class Sequential {
	private long sum = 0;

	public void calcSum() {
		for (int i = 1; i <= 8; i++) {
			for (int j = 0; j < 50_000_000; j++) {
				sum += (j*i + Math.pow(j%13,3)+ Math.pow(j%19,5)) % 197;
			}
		}
	}

	public long getSum() {
		return sum;
	}
}

class Parallel extends Thread {
	private int idx;
	private long sum = 0;

	public Parallel(int i) {
		super();
		idx = i;
	}

	public void run() {
		for (int j = 0; j < 50_000_000; j++) 
			sum += (j*idx + Math.pow(j%13,3)+ Math.pow(j%19,5)) % 197; 
	}

	public long getSum() {return sum; }

}

public class ThreadTest {
	public static void main(String [] args) {
		long totalSum = 0;
		long before = System.currentTimeMillis();
		
		if (args.length == 0) {
			System.out.println("Waiting for a parameter 'seq' or 'par'");
			return;
		}

		if ("seq".equals(args[0])) {
			// Sequential part
			Sequential s = new Sequential();

			s.calcSum();
			totalSum = s.getSum();

		}
		else if ("par".equals(args[0])) {
			int cores = Runtime.getRuntime().availableProcessors();
			System.out.println("Your laptop has "+cores+ " cores");

			// Parallel part
			Parallel t1 = new Parallel(1);
			Parallel t2 = new Parallel(2);
			Parallel t3 = new Parallel(3);
			Parallel t4 = new Parallel(4);
			Parallel t5 = new Parallel(5);
			Parallel t6 = new Parallel(6);
			Parallel t7 = new Parallel(7);
			Parallel t8 = new Parallel(8);

			before = System.currentTimeMillis();
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			t6.start();
			t7.start();
			t8.start();

			
			try {
				t1.join(); t2.join(); t3.join(); t4.join(); 
				t5.join(); t6.join(); t7.join(); t8.join(); 
			}
			catch (InterruptedException ex) { System.out.println(ex); }			
			totalSum = t1.getSum() + t2.getSum() + t3.getSum() + t4.getSum()+t5.getSum() + t6.getSum() + t7.getSum() + t8.getSum();
			}
		else {
			System.out.println("Waiting for a parameter 'seq' or 'par'");
			return;
		}

		long after = System.currentTimeMillis();
		System.out.println(args[0]+" SUM is : "+totalSum+ " Time (ms): "+(after-before));
	}
}
