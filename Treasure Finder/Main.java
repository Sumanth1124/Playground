#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  cin>>x>>y>>z;
  if((x>y && x<z) || (x<y && x>z))
    cout<<"The treasure is in box which has number "<<x<<endl;
  else if((y>x && y<z) || (y<x && y>z))
    cout<<"The treasure is in box which has number "<<y<<endl;
  else if((z>x && z<y) || (z<x && z>y))
    cout<<"The treasure is in box which has number "<<z<<endl;
  
  if(y%x==0 && z%x==0)
    cout<<"The code to open the box is "<<x;
  else if(x%y==0 && z%y==0)
    cout<<"The code to open the box is "<<y;
  else if(x%z==0 && y%z==0)
        cout<<"The code to open the box is "<<z;
  else
        cout<<"The code to open the box is 1";

    
}