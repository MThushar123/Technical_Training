#include <stdio.h>

int main() {
    int count=0;
    int arr[6]={51,52,53,54,28,36};
    for(int i=0;i<6;i++){
        if(arr[i]>50){
            printf("%d ",arr[i]);
        }
        else{
            count++;            
        }
}
if(count==6){
    printf("There is no element greater than 50\n");
}
    return 0;
}