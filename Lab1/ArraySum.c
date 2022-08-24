#include<stdio.h>
int i;
int Add(double a[], int n)
{
	double sum=0;
	for(i=0; i<n; i++)
	sum+=a[i];
	printf("Sum of elemnts of array: %lf", sum);
}
int main()
{
    int n;
	printf("Enter size of array.\n");
	scanf("%d", &n);
	double a[n];
	printf("Enter %d elements.\n", n);
	for(i=0; i<n; i++)
	    scanf("%lf", &a[i]);
	Add(a, n);    
}