#include<stdio.h>
int main(){
    int i,n,j;
    int arr[10];
    int max=arr[0];
    printf("Enter the array size\n");
    scanf("%d",&n);
    
    printf("enter the elements for the array\n");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("The elements of an array are:- ");
    for(int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=arr[i];
    }
    printf("Sum of array %d",sum);
return 0;
}