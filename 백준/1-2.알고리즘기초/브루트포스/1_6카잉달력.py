import sys
input = sys.stdin.readline

T = int(input())
for _ in range(T):
    M, N, x, y = map(int, input().split())
    
    ans = 1
    while x!=1 or y!=1:
        x -= 1
        y -= 1
        ans += 1
        
        if x == 0:
            x = M
        if y == 0:
            y = N
            
        if ans > M*N:
            ans = -1
            break
        
    print(ans)

    