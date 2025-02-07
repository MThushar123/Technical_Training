#include <stdio.h>

int main() {
    int arr1[10], arr2[10], merged[20];
    int n1, n2, i, j;

    printf("Enter the size of first array: ");
    scanf("%d", &n1);
    printf("Enter elements of first array: ");
    for(i = 0; i < n1; i++) {
        scanf("%d", &arr1[i]);
    }

    printf("Enter the size of second array: ");
    scanf("%d", &n2);
    printf("Enter elements of second array: ");
    for(i = 0; i < n2; i++) {
        scanf("%d", &arr2[i]);
    }

    for(i = 0; i < n1; i++) {
        merged[i] = arr1[i];
    }

    for(j = 0; j < n2; j++) {
        merged[i] = arr2[j];
        i++;
    }

    printf("Merged array: ");
    for(i = 0; i < n1 + n2; i++) {
        printf("%d ", merged[i]);
    }

    return 0;
}
