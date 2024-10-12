class Parent
  private
  attr_reader :pr_param
end

class Child < Parent

 public
  def test
    pr_param # it should be ok
  end
end

cld = Child.new
cld.test # It is ok
cld.pr_param # This is not
