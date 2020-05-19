#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z,a,b,c,p,q,r,l,m,n;
  cin>>x>>y>>z>>a>>b>>c>>p>>q>>r;
  l=x-(x*y/100)+z;
  m=a-(a*b/100)+c;
  n=p-(p*q/100)+r;
  cout<<"In Flipkart Rs."<<l<<endl;
cout<<"In Snapdeal Rs."<<m<<endl;
cout<<"In Amazon Rs."<<n<<endl;
  if(l<=m && l<=n)
    cout<<"He will prefer Flipkart";
  else if(m<=l && m<=n){
    cout<<"He will prefer Snapdeal";}
    else 
      cout<<"He will prefer Amazon";
}