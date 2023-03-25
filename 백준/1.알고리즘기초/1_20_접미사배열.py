'''
s = input()
n = len(s)

arr = []
for i in range(n):
	arr.append(s)
	s = s[1:]

arr.sort()
for i in range(n):
	print(arr[i])
'''

s = str(input())
s_list = []

for _ in s:
	s_list.append(s)
	s = s[1:]
for i in sorted(s_list):
	print(i)