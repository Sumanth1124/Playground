#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int m,n;
  cin>>m>>n;
  int a[m][n],b[n][m];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++)
      b[j][i]=a[i][j];
  }
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++)
      cout<<b[i][j]<<" ";
    cout<<"\n";
  }
}