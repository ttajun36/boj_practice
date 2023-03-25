import sys
input = sys.stdin.readline

n = int(input())
data = list(map(int, input().split()))
dp = [data[0]]
dp2 = [0 for _ in range(n)]
dp2[n-1] = data[n-1]

for i in range(1, n):
	dp.append(max(data[i], dp[i-1]+data[i]))
	dp2[n-1-i] = max(data[n-1-i], dp2[n-i] + data[n-1-i])

for i in range(1, n-1):
	dp.append(dp[i-1]+dp2[i+1])

print(max(dp))

