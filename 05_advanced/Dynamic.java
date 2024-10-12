class Base {
  static void statMethod() {
    System.out.println("Base-statMethod");
    }

  void justMethod() {
    System.out.println("Base-justMethod");
    }
  }

class Child extends Base {
  static void statMethod() {
    System.out.println("Child-statMethod");
    }

  void justMethod() {
    System.out.println("Child-justMethod");
    }
}

public class Dynamic {
   public static void main(String [] args) {
     Base b = new Child();
     b.statMethod();
     b.justMethod();
     }
}
