#include <bits/stdc++.h>
using namespace std;

int n, m;
int graph[101][101], pos_y, pos_x, dir, ans_count;

int main(){
    cin >> n >> m;
    int dy[4] = {0, 1, 0, -1};
    int dx[4] = {1, 0, -1, 0};

    for(int i=0; i<n*m; i++){
        graph[pos_y][pos_x] = 1+i;
        if(pos_y+dy[dir]<0 || pos_y+dy[dir]==n || pos_x+dx[dir]<0 || pos_x+dx[dir]==m || graph[pos_y+dy[dir]][pos_x+dx[dir]]!=0){
            dir = (dir+1)%4;
            ans_count++;
        }
        pos_y += dy[dir];
        pos_x += dx[dir];
    }

    cout << ans_count-1;
}