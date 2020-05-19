#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>n>>m;
  int small;
  if(m>n)
    small=n;
    else
      small=m;
  if(small%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}