import sys
input = sys.stdin.readline

n = int(input())

if n==0:
	print(0)
else:
	ans = ''

	while n!=0:
		if n%2 !=0:
			ans = '1' + ans
			n = (n//-2) +1
		else:
			ans = '0' + ans
			n //= (-2)
		
	print(ans)
