#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  student details;
  cin.getline(details.name,50);
    cin>>details.roll>>details.marks;
  cout<<endl;
  cout<<"Student Details"<<endl;
  cout<<"Name: "<<details.name<<endl;
    cout<<"Roll: "<<details.roll<<endl;
    cout<<"Marks: "<<details.marks;
}