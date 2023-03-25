a,b = map(int, input().split())

gcd = -1
i=1
while i<=min(a,b):
	if a%i==0 and b% i==0:
		gcd = i
	i += 1

print(gcd)
print(a*b//gcd)