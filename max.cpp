#include<iostream>
using namespace std;
int checkmax(int arr[] ,int size){
    int max=arr[0];
    int max2=arr[0];
    for (int i = 0; i <size; i++)
    {
       if(arr[i]>max ){
        max2=max;
        max=arr[i];
        
       }
       else if (arr[i]>max2 && arr[i]!=max)
       {
        max2=arr[i];
       }
      
    }
    return max2;
   
}
int main(){
    int arr[]={67,70,66,34,50};
    int size =5;
    int indx=checkmax(arr,size);
    cout<<" 2nd max element is "<<indx<<endl;
}