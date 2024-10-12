#include <stdio.h>

int main() {
  int a = 25;
  int *b = &a;

  printf("b=%d, *b=%d\n",b, *b);

  int arr[5];
  int * ap = arr;
 
  arr[0] = 1;
  arr[1] = 2;
  arr[2] = 3;
  arr[3] = 5;
  arr[4] = 8;

  for(int i=0; i<5; i++)
    printf("%d ",*(ap+i));

}
