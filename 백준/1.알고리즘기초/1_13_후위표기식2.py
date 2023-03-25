import sys
input = sys.stdin.readline

n = int(input())
expression = input().rstrip()
data = []
for i in range(n):
	data.append(int(input()))
stack = []

for i in expression:
	if i == '+':
		stack.append(stack.pop()+stack.pop()) 
	elif i == '-':
		stack.append(-stack.pop() + stack.pop()) 
	elif i == '*':
		stack.append(stack.pop()*stack.pop())
	elif i == '/':
		stack.append(1/stack.pop()*stack.pop())
	else:
		stack.append(data[ord(i) - ord('A')])

print('%.2f' %stack.pop())