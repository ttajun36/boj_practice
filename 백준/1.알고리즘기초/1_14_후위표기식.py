import sys
input = sys.stdin.readline

expression = input().rstrip()

stack = []
for i in expression:
	if ord(i) >= ord('A') and ord(i) <= ord('Z'):
		print(i, end='')

	elif i=='+' or i=='-':
		while stack and stack[-1]!= '(':
			print(stack.pop(), end='')
		stack.append(i)
	elif i=='*' or i=='/':
		while stack and (stack[-1]=='*' or stack[-1]=='/'):
			print(stack.pop(), end='')
		stack.append(i)

	elif i=='(':
		stack.append('(')
	elif i==')':
		while stack[-1] != '(':
			print(stack.pop(), end='')
		stack.pop()

while stack:
	print(stack.pop(), end='')
print()