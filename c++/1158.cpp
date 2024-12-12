#include <bits/stdc++.h>
using namespace std;

int n, k;
int arr[5001] = {0, };
int ans[5001] = {0, };

int main(){
    cin >> n >> k;

    for(int i=1; i<n+1; i++)
        arr[i]=1;

    int count = 0;
    int temp_count = 0;
    int index = 0;

    while(count<n){
        index ++;
        if(index >n)
            index=1;
        if(arr[index]==1)
            temp_count++;
        if(temp_count==k){
            arr[index]=0;
            ans[count]=index;
            count++;
            temp_count=0;
        }
    }

    cout << "<";
    for(int i=0; i<n-1; i++)
        cout << ans[i] << ", ";
    cout << ans[n-1] << ">\n";
}