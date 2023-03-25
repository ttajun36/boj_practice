import sys
input = sys.stdin.readline

dp = [1, 2, 4]
mod = 1000000009
for i in range(3, 1000000):
	dp.append((dp[i-1]+dp[i-2]+dp[i-3])%mod)

t = int(input())
for _ in range(t):
	n = int(input())
	print(dp[n-1])
