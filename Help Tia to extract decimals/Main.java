#include<iostream>
#include<string>
using namespace std;
int main() 
{
  string name;
  getline(cin,name);
  int pos=name.find(".");
  if(pos!=string::npos)
  cout<<"Floating part is : "<<name.substr(pos+1);
  else
    cout<<"Floating part is : ";
}