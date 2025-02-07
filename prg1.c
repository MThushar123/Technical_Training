#include<stdio.h>
int main(){
    int n,j;
    int arr[10];
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
return 0;
}