public class ReturnTest
{
    public int test() {
        int a = 5;
        return a;
        a = 6;
    }
	public static void main(String[] args) {
	    ReturnTest rt = new ReturnTest();
	    int x = rt.test();
		System.out.println("Hello World: "+x);
	}
}

