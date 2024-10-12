def func1(x):
	def func2(b):
		print('Hello',x*x + b)

	return func2

clj = func1(7)
clj(3)
