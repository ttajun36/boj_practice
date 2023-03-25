import sys
input = sys.stdin.readline

n = int(input())
mod = 1000000000

dp = [[0 for col in range(10)] for row in range(n)]
dp[0] = [0,1,1,1,1,1,1,1,1,1]
for i in range(1, n):
	dp[i][0] = dp[i-1][1]
	for j in range(1, 9):
		dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1]
	dp[i][9] = dp[i-1][8]
	
	for j in range(10):
		dp[i][j] %= mod

print(sum(dp[n-1])%mod)