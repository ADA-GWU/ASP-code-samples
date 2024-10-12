calcNum :: Int -> Int
calcNum 0 = 0
calcNum a =  1 + (calcNum divres)
             where divres = div a 10

main :: IO ()
main = do
	x <- getLine
	let res = calcNum (read x)
	if x == "0" 
		then putStrLn "1"
	else putStrLn (show res)

