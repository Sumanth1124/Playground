#include<iostream>
#include<string>
using namespace std;
struct student{
string name;
  int id;
  int age;
  string desgn;
  int salary;
};
int main()
{
  //Type your code here.
  student s;
  cout<<"Enter name:\n";
  cin>>s.name;
  cout<<"Enter ID:\n";
  cin>>s.id;
  cout<<"Enter age:\n";
  cin>>s.age;
  cout<<"Enter designation:\n";
  cin>>s.desgn;
  cout<<"Enter Salary:\n";
  cin>>s.salary;
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<s.name<<endl;
  cout<<"ID of the Employee : "<<s.id<<endl;
  cout<<"Age of the Employee : "<<s.age<<endl;
  cout<<"Designation of the Employee : "<<s.desgn<<endl;
  cout<<"Salary of the Employee : "<<s.salary<<endl;
  
  
}