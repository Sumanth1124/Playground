#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  float y,z;
  cin>>x>>y;
  switch(x){
    case 1 : z=y;
      cout<<z;
      break;
    case 2 : z= y+ y/2;
      cout<<z;
      break;
    case 3 : z=y*2;
      cout<<z;
      break;
        default:
      cout<<"Number of items is more";
      break;
  
  }
  
}