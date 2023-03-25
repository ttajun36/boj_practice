import sys
input = sys.stdin.readline

n = int(input())
for _ in range(n):
	data = input()
	stack = 0
	
	for paranthesis in data:
		if paranthesis == '(':
			stack += 1
		elif paranthesis == ')':
			stack -= 1
		if stack<0:
			break
	
	if stack == 0:
		print("YES")
	else:
		print("NO")