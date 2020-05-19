#include<iostream>
#include<cmath>
using namespace std;
int checkk(int x,int y,int req){
if(pow(x,y) >= req)
  cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
int main(){
int x,y,z;
  cin>>x>>y>>z;
  checkk(x,y,z);

}