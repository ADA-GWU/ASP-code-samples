using System;

class Base
{
    public virtual void DoIt()
    {
        Console.WriteLine("Base.DoIt()");
    }
}

class Derived : Base
{
    public new void DoIt()
    {
        Console.WriteLine("Derived.DoIt()");
    }
}

public class Dynamic {
  static void Main() {
    Base b = new Derived();
    Derived d = new Derived();
    
    b.DoIt(); // Calls Base.DoIt
    d.DoIt(); // Calls Derived.DoIt
  }
}
