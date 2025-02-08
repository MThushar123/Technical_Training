#include <stdio.h>

int main() {
    int arr[10];
    int n,i,res,ans;
    printf("Enter the size of array:-\n");
    scanf("%d",&n);
   
    printf("Enter the elements of array\n");
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("The elements of an array are");
    for(i=0;i<n;i++){
        printf("%d\t",arr[i]);
    }
    int max=0;
    for(i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    printf("\nMaximum number in ur array is %d",max);
    int count=0;
    res = max-n;
    if(res==3){
        ans=max-100;
        printf("\n%d",ans);
    }
    else if(res>3){
        ans=max-500;
        printf("\n%d",ans);
    }
    else if(res<3){
       printf("\n%d",res);
    }
    return 0;
}