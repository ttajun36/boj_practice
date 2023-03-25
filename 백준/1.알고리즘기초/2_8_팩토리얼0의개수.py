import sys
input = sys.stdin.readline

def factorial(a):
	if a==0 or a==1:
		return 1
	else:
		return a*factorial(a-1)


n_factorial = factorial(int(input()))

count = 0
while n_factorial>0:
	if n_factorial%10 != 0:
		break
	else:
		count+=1
		n_factorial //=10

print(count)