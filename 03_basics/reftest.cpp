#include <iostream>

using namespace std;

int main() {
   int a = 5;
   int &b = a;
   a = 6;
//   int c = 3;
//   &b = c;

   cout<<a<<" "<<b<<endl;

}
