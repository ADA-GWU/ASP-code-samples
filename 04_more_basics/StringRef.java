class Human {
  public String name;
}

public class StringRef {
	public void changeClass(Human h) {
		h.name = "Bond";
        }

        public void testFunc(String str) {
		str = "salam";
        }

	public static void main(String args[]) {
		StringRef sr = new StringRef();

		String x = "hello";
		Human h = new Human();
                h.name = "James";

		sr.testFunc(x);
		sr.changeClass(h);

		System.out.println(x);
		System.out.println(h.name);
	}
}
