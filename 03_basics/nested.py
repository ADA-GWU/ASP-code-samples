a = 5

def f1():
   global a
   a = 3
   print(a)
   b = 7
   c = 9
   def f2():
       nonlocal b
       b = 11
   
   f2()
   print(b)

f1()
print(a)
