#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,f,l;
   cin>>x;
  l=x%10;
  f=x/10;
  f=f/10;
  f=f/10;
  cout<<l+f;
}