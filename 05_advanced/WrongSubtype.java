import java.util.*;

class Properties extends Hashtable<Object,Object> {
	public void setProperty(String key, String val){
		put(key,val);
	}
	public String getProperty(String key) {
		return (String)get(key);
	}
}


public class WrongSubtype {
	public static void main(String [] args) {
		Properties p = new Properties();
		Hashtable tbl = new Properties();
		tbl.put("One", 1);
		p.getProperty("One"); // problem
	}
}
