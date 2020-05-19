#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string name1,name2;
  getline(cin,name1);
  getline(cin,name2);
  int n=name2.length();
  for(int i=0;i<(name2.length())/2;i++){
    char temp=name2[i];
    name2[i]=name2[n-1-i];
    name2[n-1-i]=temp;
  }

  if(name1==name2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}