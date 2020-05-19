#include<iostream>
using namespace std;
int powerr(int m,int n){
if(n==1){
return m;
}
  else
    return m*powerr(m,n-1);
}
int main()
{
  //Type your code here.
int a,b;
  cin>>a>>b;
 int z=powerr(a,b);
  cout<<"Enter the value of a"<<endl;
  cout<<"Enter the value of n"<<endl;
  cout<<"The value of "<<a<<" power "<<b<<" is "<<z;
  
}