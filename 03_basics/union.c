#include <stdio.h>

union StudentUnion {
   int age;
   float gpa;
   char lastName[10];
};

int main() {
   union StudentUnion su = { 13442422, 3.5f, "Aliyev"};
   printf("Age: %d\n GPA: %f\n Last: %s\n",su.age,su.gpa,su.lastName);
  
   return 0;
}


