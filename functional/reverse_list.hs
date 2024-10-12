revlist [] = []
revlist x = last x : revlist (init x)
