ifEven fun n = if even n
               then fun n
               else n

inc x = x + 1
sqr x = x * x

genIfEven f = ( \x -> ifEven f x)

ifEvenInc x = genIfEven inc
