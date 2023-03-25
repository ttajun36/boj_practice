def hanoi(n, a, b, data):
	global count
	if n==1:
		data.append(str(a) +' '+ str(b))
		count+=1
	else:
		hanoi(n-1, a, 6-a-b, data)
		hanoi(1, a, b, data)
		hanoi(n-1, 6-a-b, b, data)

n = int(input())
count = 0
data = []
hanoi(n, 1, 3, data)
print(count)
print('\n'.join(data))