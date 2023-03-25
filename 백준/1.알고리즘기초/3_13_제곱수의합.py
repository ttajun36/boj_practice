import sys
input = sys.stdin.readline

n = int(input())
dp = [0]
for i in range(1, n+1):
	dp.append(dp[i-1] +1)
	for j in range (2, int(i**(1/2))+1):
		if dp[i-j**2]+1<dp[i]:
			dp[i] = dp[i-j**2]+1
print(dp[n])

'''
import sys
input = sys.stdin.readline

n = int(input())
dp = [i for i in range(n+1)]
for i in range(n+1):
	for j in range(1, int(i**(1/2)+1)):
		if dp[i] > dp[i-j**2]+1:
			dp[i] = dp[i-j**2]+1
print(dp[n])
'''