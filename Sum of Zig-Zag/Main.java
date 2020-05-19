#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  int diag=0;
  for(int i=0;i<r;i++)
    diag+=a[i][r-1-i];
  int rowf=0,rowl=0;
  for(int i=0;i<r-1;i++)
    rowf+=a[0][i];
  for(int i=1;i<r;i++)
    rowl+=a[r-1][i];
  cout<<"Sum of Zig-Zag pattern is "<<rowf+rowl+diag;
}