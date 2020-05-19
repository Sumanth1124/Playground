#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r;
  cin>>r;
  int c=r;
  int flag=0;
  int a[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++)
      cin>>a[i][j];}
  int f_diag=0,s_diag=0;
  for(int i=0;i<r;i++)
    f_diag+=a[i][i];
  for(int i=0;i<r;i++)
    s_diag+=a[i][r-1-i];
for(int i=0;i<r;i++){
  int row=0;
    for(int j=0;j<c;j++){
    row=row+a[i][j];
    }
  if(row!=f_diag)
    flag=1;
}
for(int i=0;i<r;i++){
  int col=0;
    for(int j=0;j<c;j++){
    col=col+a[j][i];
    }
  if(col!=f_diag)
    flag=1;
}
  if(flag==0)
    cout<<"Yes";
  else
    cout<<"No";
  
}