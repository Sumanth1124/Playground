#include<iostream>
using namespace std;
int gcd(int a,int b,int c){
if(a%c==0 && b%c==0)
  return c;
  else
    gcd(a,b,c-1);
}
int main()
{
  //Type your code here.
  int a,b,small;
  cin>>a>>b;
  if(a>b)
    small=b;
  else 
    small=a;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b,small);
}