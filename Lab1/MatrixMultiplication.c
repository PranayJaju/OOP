#include<stdio.h>
int main()
{
    int p,q,x,y;
	printf("Enter order of Matrix 1.\n");
	scanf("%d%d", &p, &q);
	printf("Enter order of Matrix 2.\n");
	scanf("%d%d", &x, &y);
	if(q!=x)
	    printf("Matrices are not compatible for multiplication.\n");
	else
	{
	    int m1[10][10], m2[10][10], m[10][10];
	    int i,j,k;
	   
	    printf("Enter Matrix 1 elements.\n");
	    for(i=0; i<p; i++)
	        for(j=0; j<q; j++)
	        {
	            scanf("%d", &m1[i][j]);
	        }
	    
	    printf("Enter Matrix 2 elements.\n");
	    for(i=0; i<x; i++)
	        for(j=0; j<y; j++)
	        {
	            scanf("%d", &m2[i][j]);        
	        }

        printf("Matrix 1:\n");
	    for(i=0; i<p; i++)
        {
        	for(j=0; j<q; j++)
	        {
	            printf("%d  ", m1[i][j]);        
	        }
	        printf("\n");
        }    

        printf("Matrix 2:\n");
	    for(i=0; i<x; i++)
        {
        	for(j=0; j<y; j++)
	        {
	            printf("%d  ", m2[i][j]);        
	        }
	        printf("\n");
        }    
        
        for(i=0; i<p; i++)
            for(j=0; j<y; j++)
            {
            	m[i][j]=0;
                for(k=0; k<q; k++)
                    m[i][j]+=m1[i][k]*m2[k][j];
            }
        
        printf("Matrix Product:\n");  
        for(i=0; i<p; i++)
        {
        	for(j=0; j<y; j++)
	        {
	            printf("%d  " , m[i][j]);        
	        }
	        printf("\n");
        }
	        
	}    
}