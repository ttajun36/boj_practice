import sys
input = sys.stdin.readline

height = []
sum = 0
flag = True

for i in range (9):
	height.append(int(input()))
	sum += height[i]

height.sort()

for i in range (8):
	for j in range (i+1, 9):
		if sum - height[i] -height[j] == 100:
			a,b = i, j
			flag = False
			break
	
	if flag == False:
		break

for i in range (9):
	if i!= a and i!=b:
		print(height[i])

