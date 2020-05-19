#include<iostream>
using namespace std;
int main(){
int x,y,sum,total=0;
  cin>>x>>y;
  sum=x+y;
  for(int i=1;i<sum;i++){
  if(sum%i==0){
  total = total + i;
  }
  }
if(total==sum){
cout<<"They can read the message";
}else{
cout<<"They can't read the message";
}

}