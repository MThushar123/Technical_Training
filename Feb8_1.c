#include <stdio.h>

int main() {
    int arr[10];
    int i,n;
    int m_price=0,c=0;
    
    printf("Enter the size");
    scanf("%d",&n);
    printf("enter the elements of stock prices\n");
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    
    for(i=0;i<n;i++){
        if(arr[i]>m_price){
            m_price=arr[i];
            c=1;
        }
        else if(m_price==arr[i]){
            c++;
        }
        }
        printf("maximum price %d",m_price);
        printf("count repeated %d ",c);
    return 0;
}