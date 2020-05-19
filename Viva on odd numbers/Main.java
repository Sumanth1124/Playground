#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int flag=0;
  float score=0;
  while(1){
    int n;
  cin>>n;
    if(flag==3){
    cout<<score;
      return 0;
    }
    else if(n<0){
    score=score-1;
      cout<<score;
      return 0;
    }
    else if(n>0 && n%2==1){
      flag++;
    score=score+1;
    }else if(n>0 && n%2==0){
    score=score-0.5;
    }
    
  }
}