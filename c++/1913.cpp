// #include <bits/stdc++.h>
// using namespace std;

// int n, ans;

// int main(){
//     cin >> n >> ans;
    
//     int graph[n+1][n+1];
//     int ans_x, ans_y;
    
//     int pos_x = (n+1)/2;
//     int pos_y = (n+1)/2;
//     int count = 1;
//     graph[pos_x][pos_y] = count;
//     if(count==ans){
//         ans_x = pos_x;
//         ans_y = pos_y;
//     }
//     count++;

//     int dx[4] = {-1, 0, 1, 0};
//     int dy[4] = {0, 1, 0, -1};
 
//     for(int i=0; i<(n-1)*2; i++)
//         for(int j=0; j< i/2+1; j++){
//             pos_x += dx[i%4];
//             pos_y += dy[i%4];
//             graph[pos_x][pos_y] = count;
//             if(count==ans){
//                 ans_x = pos_x;
//                 ans_y = pos_y;
//             }
//             count++;
//         }
    
//     for(int i=0; i<n-1; i++){
//         pos_x += dx[0];
//         pos_y += dy[0];
//         graph[pos_x][pos_y] = count;
//         if(count==ans){
//             ans_x = pos_x;
//             ans_y = pos_y;
//         }
//         count++;
//     }

//     for(int i=1; i<n+1; i++){
//         for(int j=1; j<n+1; j++)
//             cout << graph[i][j] << ' ';
//         cout << '\n';
//     }
//     cout << ans_x << ' ' << ans_y << '\n';
// }


//점(1,1) 부터 시작하는게 아니라 좌표 (1,1)부터 시작한다면?

#include <bits/stdc++.h>
using namespace std;

int n, ans;
int graph[1001][1001], pos_y, pos_x, dir, ans_y, ans_x;

int main() {
    cin >> n >> ans;
    int dy[] = {1, 0, -1, 0};
    int dx[] = {0, 1, 0, -1};

    for(int i=0; i<n*n; i++){
        graph[pos_y][pos_x] = n*n-i;
        if(n*n-i==ans){
            ans_y = pos_y + 1;
            ans_x = pos_x + 1;
        }
        if(pos_y+dy[dir]<0 || pos_y+dy[dir]==n || pos_x+dx[dir]<0 || pos_x+dx[dir]==n || graph[pos_y+dy[dir]][pos_x+dx[dir]]){
            dir = (dir+1) %4;
        }
        pos_y += dy[dir];
        pos_x += dx[dir];
    }

    for(int i=0; i<n; i++){
        for (int j=0; j<n; j++)
            cout << graph[i][j] << ' ';
        cout << '\n';
    }
    cout << ans_y << ' ' << ans_x << '\n';
}