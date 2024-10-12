public class ExceptionSample {
	public static void main(String [] args){
		try {
			int [] arr = {1,2,3};
			System.out.println(arr[3]);
		}
		catch (ArrayIndexOutOfBoundsException aex) {
			System.out.println("AEx: "+aex);
		}
		//Try to put catch(Exception ex) first
		catch (Exception ex) {
			System.out.println("Ex: "+ex);
		}
	}
}

