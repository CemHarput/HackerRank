#include <stdio.h>
#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
#include <string.h>



// Complete the solve function below.
void solve(double meal_cost, int tip_percent, int tax_percent) {



}
int main(void)
{
	double meal_cost;
	int tip_percent, tax_percent;
	double tip, tax;
	scanf("%lf", &meal_cost);
	scanf("%d", &tip_percent);
	scanf("%d", &tax_percent);
	tip = meal_cost*((double) tip_percent / 100);
	tax = meal_cost*((double) tax_percent / 100);
	meal_cost = tip + tax + meal_cost;
	printf("The total meal cost is %.1f dollars.", meal_cost);

}

