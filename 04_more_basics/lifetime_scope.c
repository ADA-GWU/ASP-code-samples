#include "stdio.h"

int main()
{
    int a = 5;
    for (int i = 0; i < 7; i++){
        printf("%d : ",a);
        int a = -5;
        printf("%d\n",a);
    }

    return 0;
}
