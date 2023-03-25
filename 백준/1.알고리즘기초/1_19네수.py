'''
import sys
input = sys.stdin.readline

a, b, c, d = input().split()
ans=0

num1 = []
for i in a:
	num1.append(i)
for i in b:
	num1.append(i)

count=0
while num1:
	ans += int(num1.pop()) * (10**count)
	count+=1

num2 = []
for i in c:
	num2.append(i)
for i in d:
	num2.append(i)

count=0
while num2:
	ans += int(num2.pop()) * (10**count)
	count+=1

print(ans)
'''
import sys
input = sys.stdin.readline

a, b, c, d = input().split()
intab = int(a+b)
intcd = int(c+d)
print(intab + intcd)