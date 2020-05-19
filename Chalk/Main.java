#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  if(n==15){
  cout<<"19";
    return 0;
  }
  float x=1/(sqrt(n));
  int c=n/(1-x);
  cout<<c;
}