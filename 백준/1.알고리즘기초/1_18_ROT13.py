s = input()

for i in s:
	if ord(i) >= ord('a') and ord(i) <= ord('z'):
		if ord(i)+13 > ord('z'):
			i = chr(ord(i) + 13 - ord('z') -1 + ord('a'))
		else:
			i = chr(ord(i)+13)
	elif ord(i) >= ord('A') and ord(i) <= ord('Z'):
		if ord(i)+13 > ord('Z'):
			i = chr(ord(i) + 13 - ord('Z') -1 + ord('A'))
		else:
			i = chr(ord(i)+13)
	
	print(i, end='')
print()