# sample is taken from https://medium.com/@techoalien/ruby-inheritance-access-modifiers-and-misconception-behind-them-adcf89e2f609
class Car

  def call_car_mileage
    mileage
  end
  
  private
  def mileage
    puts "I return mileage of a #{self.class}"
  end
end

class Porsche < Car
  def call_porsche_mileage
    mileage
  end
end

Car.new.call_car_mileage
#  "I returns mileage of a Car"
Porsche.new.call_porsche_mileage
#  "I returns mileage of a Porsche"
