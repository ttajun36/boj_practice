#include <bits/stdc++.h>
using namespace std;
#define MAX 9

int n, m;
int visited[MAX] = {0, };
int ans[MAX] = {0, };

void backTracking(int start, int count){
    if(count==m){
        for(int i=0; i<m; i++)
            cout << ans[i] << ' ';
        cout << '\n';
    }
    else{
        for(int i=start; i<n+1; i++){
            if(visited[i]==0){
                visited[i]=1;
                ans[count]=i;
                backTracking(i+1,count+1);
                visited[i]=0;
            }
        }
    }
}

int main(){
    cin >> n >> m;

    backTracking(1, 0);
}