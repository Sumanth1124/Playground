#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string name1,name2;
  getline(cin,name1);
  getline(cin,name2);
  if(name1==name2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
    
  
}