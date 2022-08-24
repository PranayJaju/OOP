#include<stdio.h>
void PointerPassing(int *a)
{
	printf("Value passed using pointer: %d\n", *a);
	printf("Pointer value: %p\n", a);
}

int* ReturnPointer(int *x)
{
	return x+2;
}
void main()
{
	printf("1. Passing pointers to a function.\n");
	int a, *pa;
	pa=&a;
    printf("Enter a value.\n");
    scanf("%d", pa);
    PointerPassing(pa);

	printf("\n2. Returning a pointer from a function.\n");
	int *x, *y=x+2;
	if(y==ReturnPointer(x))
	{
		printf("Pointer return successfully.\n");
		printf("Pointer returned: %p\n", y);
	}

	printf("\n3. Pointer to a pointer.\n");
	int m=3;
	int *pm=&m;
	int **p_pm=&pm;
	printf("Value of m:%d\n", m);
	printf("Value of m using pointer and its value:%d, %p\n", *pm, pm);
	printf("Value of pm using pointer and that pointers value:%p, %p\n", *p_pm, p_pm);
}
