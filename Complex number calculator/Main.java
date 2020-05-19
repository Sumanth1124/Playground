#include<iostream>
using namespace std;
struct complex{
int i;
  int j;
}x1,x2;
int main(){
int n;
  int f,l;
  cin>>n;
  cin>>x1.i>>x1.j>>x2.i>>x2.j;
  switch(n){
    case 1 : f=x1.i+x2.i;
      l=x1.j+x2.j;
      cout<<f<<l<<"i";
      break;
    case 2 : f=x1.i-x2.i;
      l=x1.j-x2.j;
      if(l>0)
        cout<<f<<"+"<<l<<"i";
      else
      cout<<f<<l<<"i";
      break;
    case 3 : f=(x1.i*x2.i) +(x1.j*x2.j*-1);
      l=x1.i*x2.j+x1.j*x2.i;
      cout<<f<<l<<"i";
      break;
      default : cout<<"Invalid choice";
  }
  
  }