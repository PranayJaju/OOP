#include<stdio.h>
#include<stdlib.h>
int i;
int Smallest(int *a, int n)
{
	int smallest=*a;
	for(i=1; i<n; i++)
	{
	    if(smallest>*(a+i))
	    smallest=*(a+i);
	}
	return smallest;
}
void main()
{
    int n, *a;
	printf("Enter array size.\n");
	scanf("%d", &n);
    a=calloc(n, n*sizeof(int));
    if(a==NULL)
    {
        printf("Memory allocation failed.\n");
    }
    else
    {
        int smallest;
        printf("Enter numbers.\n");
        for(i=0; i<n; i++)
        scanf("%d", (a+i));
        smallest=Smallest(a, n);
        printf("The smallest no is: %d", smallest);
    }
    free(a);
}