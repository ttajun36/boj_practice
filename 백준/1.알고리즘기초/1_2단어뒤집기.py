import sys
input = sys.stdin.readline

t = int(input())
for _ in range(t):
	sentence = input().split()
	stack = []
	
	for word in sentence:
		for i in range(len(word)):
			stack.append(word[i])
	
		for i in range(len(word)):
			print(stack.pop(), end='')
		
		print(' ', end='')
	
	print()