using System;
public class Base
{
    public void DoIt()
    {
        Console.WriteLine("Base");
    }
}

public class Derived : Base
{
    public void DoIt()
    {
        Console.WriteLine("Derived");
    }
}


class Dynamic {
  static void Main() {
    Base b = new Base();
    Derived d = new Derived();
    Base bd = new Derived();
    
    b.DoIt();
    d.DoIt();
    bd.DoIt();
    }
}
