#include<stdio.h>

int main(){
    int i, n;
    int arr[10];
    int max, Smax;

    printf("Enter the elements for the array\n");
    for(i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    printf("The elements of the array are: ");
    for(i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }

    max = arr[0];
    Smax = -1; 

    for(i = 1; i < n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }

    Smax = -1; 
    for(i = 0; i < n; i++){
        if(arr[i] != max && (Smax == -1 || arr[i] > Smax)){
            Smax = arr[i];
        }
    }

    if(Smax == -1) {
        printf("\nNo second largest element found.\n");
    } else {
        printf("\nThe second largest element in the array is: %d\n", Smax);
    }

    return 0;
}
