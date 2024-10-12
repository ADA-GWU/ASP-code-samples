#include <stdio.h>

void printArr(int * myArr, int n,int m) {
	for (int i=0; i<n;i++) {
		for (int j=0; j<m; j++)
			printf("%2d ",myArr[i*m+j]);
		printf("\n");
	}
}

int main() {
	int rows,cols;

	scanf("%d %d",&rows,&cols);

	int arr[rows][cols];

	for (int i=0; i<rows; i++)
		for (int j=0; j<cols;j++)
			arr[i][j] = i*cols + j;

	printArr(&arr[0][0],rows,cols);
	return 0;
}
