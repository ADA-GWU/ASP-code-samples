class Parent
  def initialize(name)
    @name = name
  end

  def display_protected(other)
    other.protected_name  # Accessing protected method of another instance, allowed in same class/subclass
  end

  def display_private
    private_name  # Accessing private method within the same instance, allowed within class
  end

  private

  def private_name
    "Private name: #{@name}"
  end

  protected

  def protected_name
    "Protected name: #{@name}"
  end
end

class Child < Parent
  def show_parent_protected(other)
    other.protected_name  # Accessing protected method of parent class from another instance
  end

  def show_parent_private
    private_name  # Error: private methods cannot be accessed, even in subclasses
  end
end

parent = Parent.new("Alice")
child = Child.new("Bob")

# Demonstrating protected access within subclass instances
puts child.show_parent_protected(parent)  # Allowed: Accessing protected method across instances in subclass

puts child.show_parent_private           # 

# Demonstrating access within class instances
puts parent.display_protected(child)      # Allowed: Accessing protected method from another instance of the same class
puts parent.display_private               # Allowed: Accessing private method within same class
