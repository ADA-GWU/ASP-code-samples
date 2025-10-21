#include <stdio.h>

int sumof(int a, int b) {
   int res = 0;

   res = (a+b)*(b-a+1)/2; 

   return res;
}

int main() {
   int a = 5;
   int b = 10;

   printf("Result: %d\n",sumof(a,b));
}
