def tester(p1, p2, p3, *p4)
  puts 'p1: ' + p1.to_s
  puts 'p2: ' + p2.to_s
  puts 'p3: ' + p3.to_s
  puts 'p4: ' + p4.to_s
end

list= [2,4,6,8]
tester('first', {'mon' => 72, 'tue' => 68, 'wed' => 59}, *list)
