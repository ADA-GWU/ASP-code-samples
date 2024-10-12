#include <stdio.h>

int main() {
   int a = 2000000000;
   int b = 2000000000;
   int c = -2000000000;
   int d = -1500000000;
   
   int x = a + b + c + d;
   int y = a + c + b + d;

   printf("%d\n", x);
   printf("%d\n", y);
}
