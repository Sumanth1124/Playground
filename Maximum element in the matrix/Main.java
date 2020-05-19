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
  int high=0;
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    if(a[i][j]>high){
    high=a[i][j];
    }
    }
  }
  cout<<"The maximum element is "<<high;
}