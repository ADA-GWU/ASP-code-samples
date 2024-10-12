availableCoins = [500,200,100,50,20,10]

coins :: Int -> [Int] -> [Int]
coins 0 xs = []
coins a [] = [-1]
coins a (x:xs) 
	| (a-x) > 0 = x : coins (a-x) (x:xs)
	| (a-x) < 0 = coins a xs
	| otherwise = x : coins (a-x) xs


main :: IO()
main = do
	str <- getLine
	let n = read str
	let ans =  coins n availableCoins
	let len = length(ans)
	if (last ans == -1)
    	then putStr "-1"
    	else putStr (show len)
