#include<stdio.h>
int i;
void Reverse(int *a, int n)
{
	int temp;
	for(i=0; i<n/2; i++)
	{
	    temp=*(a+i);
	    *(a+i)=*(a+n-1-i);
        *(a+n-1-i)=temp;
	}
	
}
void main()
{
	int n;int a[15];
	printf("Enter array size.\n");
    scanf("%d", &n);
    printf("Enter array elements.\n");
    for(i=0; i<n; i++)
    scanf("%d", (a+i));

    Reverse(a, n);
    printf("Array after reversing.\n");
	for(i=0; i<n; i++)
	printf("%d  ", *(a+i));
}