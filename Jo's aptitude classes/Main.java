#include<iostream>
using namespace std;
int gcd(int x,int y,int z,int p){
for(int i=p;i>=1;i--){
if(x%i==0 && y%i==0 && z%i==0)
  return i;
}

}

int main(){
int x,y,z,l,small=0;
  cin>>x>>y>>z>>l;
  if(x<y && x<z)
    small=x;
    else if(y<x && y<z)
      small=y;
      else
        small=z;
   int p=gcd(x,y,z,small);
  if(p==l)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}