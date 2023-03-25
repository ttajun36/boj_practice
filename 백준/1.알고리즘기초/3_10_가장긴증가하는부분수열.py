import sys
input = sys.stdin.readline

n = int(input())
seq = list(map(int, input().split()))

dp=[]
for i in range(n):
	dp.append(1)

	for j in range(i):
		if seq[i] > seq[j]:
			if dp[i] < dp[j] +1:
				dp[i] = dp[j]+1

print(max(dp))