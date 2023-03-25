import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
copyarr =sorted(list(set(arr)))

dictionary = {copyarr[i]:i for i in range(len(copyarr))}

for i in arr:
	print(dictionary[i], end = ' ')