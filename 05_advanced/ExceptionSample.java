public class ExceptionSample {
	public static void main(String [] args){
		try {
			int [] arr = {1,2,3};
			System.out.println(arr[5]);
		}
		catch (Exception ex) {
			System.out.println("General Ex: "+ex);
		}
		// catch (ArrayIndexOutOfBoundsException aex) {
		// 	System.out.println("AoB Ex: "+aex);
		// }
		//Try to put catch(Exception ex) first
	}
}

