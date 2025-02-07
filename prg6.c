//reverse of an array
#include<stdio.h>
int main(){
    int n,j,i;
    int arr[10];
    int temp[10];
    printf("Enter the array size\n");
    scanf("%d",&n);
   
    printf("enter the elements for the array\n");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("The elements of an array are:- ");
    for(i=0;i<n;i++)
    {
        temp[i]=arr[i];
    }
    printf("Reverse of a array\n");
    for(i=n-1;i>=0;i--)
    {
        printf("%d\t",temp[i]);
    }
return 0;
}