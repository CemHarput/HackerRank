#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>



int main()
{
	int a, b;
	char arr[10][6] = { "zero","one","two","three","four","five","six","seven","eight","nine" };
	scanf("%d\n%d", &a, &b);
	// Complete the code.
	for (int i = a; i<=b; i++)
	{
		printf("%s\n", arr[i]);
		//printf("%s\n", arr[b]);
	
	
	}

	if (a % 2 == 0)
	{
		printf("Even\n");
	}
	else
	{
		printf("Odd\n");
	}
	if (b % 2 == 0)
	{
		printf("Even\n");
	}
	else
	{
		printf("Odd\n");
	}

	
	return 0;
}