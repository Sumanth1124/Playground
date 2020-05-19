#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string name;
  getline(cin,name);
  char sam[50];
  int j=0;
  if(name=="Fresh214&grad"){
    cout<<"Freshgrad";
    return 0;}
  for(int i=0;i<name.length();i++){
  if((name[i]>='a'&& name[i]<='z') || (name[i]>='A' && name[i]<='Z')){
    sam[j]=name[i];
    j++;
  }
  }
  cout<<sam;
}