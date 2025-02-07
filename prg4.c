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
    int k;
    int a[10];
    for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
            }
        }
    }
    printf("\n The unique elements in array are:\n");
    for(i=0;i<n;i++){
        if(arr[i]>0){
            printf("%d ",arr[i]);
        }
    }
return 0;
}