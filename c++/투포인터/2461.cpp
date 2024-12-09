#include <bits/stdc++.h>
#include <algorithm>
using namespace std;

// void sort(int a[], int len){
//     for(int i=0; i< len; i++){
//         for(int j=i; j<len; j++)
//             if (a[j] < a[i]){
//                 int temp = a[j];
//                 a[j]=a[i];
//                 a[i]=temp;
//             }
//     }
// }

int main(){
    int n, m;
    cin >> n >> m;

    int classes[n][m];
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++)
            cin >> classes[i][j];

        sort(classes[i], classes[i]+m);
    }

    int index[n];
    for(int i=0; i<n; i++)
        index[i] = 0;

    int min, min_index;
    int max = -1;
    int ans = 1000000001;
    while(true){
        min = classes[0][index[0]];
        min_index = 0;

        for(int i=0; i<n; i++){
            if(classes[i][index[i]] < min){
                min = classes[i][index[i]];
                min_index = i;
            }
            if(classes[i][index[i]] > max){
                max = classes[i][index[i]];
            }
        }
        
        if(max-min < ans)
            ans = max-min;

        index[min_index] += 1;
        if(index[min_index] == n)
            break;
    }

    cout << ans << '\n';
}