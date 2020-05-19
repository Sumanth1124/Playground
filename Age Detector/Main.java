#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  cin>>x>>y;
  if(y>x){
  z=y-x;
  }else if(y==00){
  z=100-x;
  }
  else{
  z=100-(x-y);
  }
  cout<<z;
  }