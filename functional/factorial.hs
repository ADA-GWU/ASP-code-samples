factA 0 = 1
factA 1 = 1
factA n = n * factA (n - 1)

factB n
    | n == 0 = 1
    | n == 1 = 1
    | n > 1 = n * factB(n - 1)
    | otherwise = 0

