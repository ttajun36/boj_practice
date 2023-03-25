import sys
input = sys.stdin.readline

max = 100000
mod = 1000000009

dp = [[0 for col in range(3)] for row in range(max)]
dp[0] = [1,0,0]
dp[1] = [0,1,0]
dp[2] = [1,1,1]
for i in range(3, len(dp)):
	dp[i][0] = (dp[i-1][1] + dp[i-1][2])%mod
	dp[i][1] = (dp[i-2][0] + dp[i-2][2])%mod
	dp[i][2] = (dp[i-3][0] + dp[i-3][1])%mod

t = int(input())
for _ in range(t):
	n = int(input())
	print(sum(dp[n-1])%mod)