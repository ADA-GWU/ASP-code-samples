#include <iostream>

using namespace std;

void pass_by_value(int a, int b) {
   a += 1;
   b += 2;
   }

void pass_by_ref(int& a, int& b) {
   a += 1;
   b += 2;
   }

int main() {
   int a = 5;
   int b = 10;

   pass_by_value(a,b);
   cout<<"a="<<a<<" b="<<b<<endl;

   pass_by_ref(a,b);
   cout<<"a="<<a<<" b="<<b<<endl;

}

