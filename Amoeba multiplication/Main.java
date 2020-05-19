#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a=0,b=1,c;
  for(int i=1;i<=n-2;i++){
  c=a+b;
    a=b;
    b=c;
  }
  cout<<c;
}