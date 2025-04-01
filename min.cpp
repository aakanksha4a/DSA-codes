#include<iostream>
using namespace std;
int checkmin(int arr[] ,int size){
    int min=arr[0];
   int min2=arr[0];
    for (int i = 0; i <size; i++)
    {
       if(arr[i]<min ){
        min2=min;
        min=arr[i];
      
       }
       else if (arr[i]<min2 && arr[i]!=min)
       {
        min2=arr[i];
       }0
0 .     
    }
    return min2;
    
    
}
int main(){
    int arr[]={10,2,6,30,50};
    int size =5;
    int indx=checkmin(arr,size);
    cout<<" 2nd min element is "<<indx<<endl;
}