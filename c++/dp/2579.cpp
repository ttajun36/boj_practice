#include <bits/stdc++.h>
using namespace std;

int stair[300], stairs;
int dp[300][2] = {0, };

int max(int a, int b){
    if(a>b)
        return a;
    else
        return b;
}

int main(){
    cin >> stairs;
    for (int i=0; i<stairs; i++)
        cin >> stair[i];

    if (stairs==1)
        cout << stair[0];
    else if (stairs==2)
        cout << stair[0] + stair[1];
    else{
        dp[0][0] = stair[0];

        dp[1][0] = stair[1];
        dp[1][1] = stair[0] + stair[1];
        for(int i=2; i<stairs; i++){
            dp[i][0] = max(dp[i-2][0], dp[i-2][1]) + stair[i];
            dp[i][1] = dp[i-1][0] + stair[i];
        }
        cout << max(dp[stairs-1][0], dp[stairs-1][1]) << '\n';
    }
}