#include <stdio.h>

void printArr(int myArr [5][3]) {
	for (int i=0; i<5;i++) {
		for (int j=0; j<3; j++)
			printf("%2d ",myArr[i][j]);
		printf("\n");
	}
}

int main() {
	int rows = 5;
	int cols = 3;

	int arr[rows][cols];

	for (int i=0; i<rows; i++)
		for (int j=0; j<cols;j++)
			arr[i][j] = i*cols + j;

	printArr(arr);
	return 0;
}
