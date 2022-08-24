#include<stdio.h>
#include<stdlib.h>
int i,j,k;
void main()
{
    int m,n,p,q;
	printf("Enter Matrix 1 Order.\n");
	scanf("%d%d", &m, &n);
	printf("Enter Matrix 2 Order.\n");
	scanf("%d%d", &p, &q);
	if(n!=p)
	{
	    printf("Matrices aren't compatabile for multiplication.");
	}
	else
	{
	    int *m1[m], *m2[p], *r[m];

	    for(i=0; i<m; i++)                //memory allocation of matrix 1
	        m1[i]=calloc(n, n*sizeof(int));

	    for(i=0; i<p; i++)                //memory allocation of matrix 2
	        m2[i]=calloc(q, q*sizeof(int));

	    for(i=0; i<m; i++)                //memory allocation of resulatnt matrix
	        r[i]=calloc(q, q*sizeof(int));

	    printf("Enter Matrix 1 elements.\n");
	    for(i=0; i<m; i++)
	        for(j=0; j<n; j++)
	            scanf("%d", (*(m1+i)+j));

	    printf("Enter Matrix 2 elements.\n");
	    for(i=0; i<p; i++)
	        for(j=0; j<q; j++)
	            scanf("%d", (*(m2+i)+j));   

	    printf("Matrix 1.\n");
	    for(i=0; i<m; i++)
	    {
	        for(j=0; j<n; j++)
	            printf("%d  ", *(*(m1+i)+j));
	        printf("\n");    
	    }     

	    printf("Matrix 2.\n");
	    for(i=0; i<p; i++)
	    {
	        for(j=0; j<q; j++)
	            printf("%d  ", *(*(m2+i)+j));
	        printf("\n");    
	    }  

	    for(i=0; i<m; i++)
        {
            for(j=0; j<q; j++)
            {
                for(k=0; k<n; k++)
                *(*(r+i)+j)+=(*(*(m1+i)+k))*(*(*(m2+k)+j));
            }
        } 

        printf("Resultant Matrix.\n");
	    for(i=0; i<m; i++)
	    {
	        for(j=0; j<q; j++)
	            printf("%d  ", *(*(r+i)+j));
	        printf("\n");    
	    }                 
	}
}