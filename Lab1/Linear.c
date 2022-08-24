#include<stdio.h>
int i;
int Lsearch(int a[], int n, int x)
{
	int flag=0,pos;
	for(i=0; i<n; i++)
	{
	    if(a[i]==x)
	    {
	        pos=i+1;
	        flag=1;
	        break;
	    }
	}
	if(flag==0)
	printf("Element not found.\n");
	else
	printf("Element found at position %d.", pos);
}
int main()
{
    int n, x;
	printf("Enter size of array.\n");
	scanf("%d", &n);
	int a[n];
	printf("Enter %d elements.\n", n);
	for(i=0; i<n; i++)
	    scanf("%d", &a[i]);
	printf("Enter element to be searched.\n");
	scanf("%d", &x);
	Lsearch(a, n, x);    
}

