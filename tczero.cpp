#include<iostream>
using namespace std;
int movezero(int arr[],int size){
    int count =0;//count is to track non zero

    for(int i=0;i<size;i++){
        if(arr[i]!=0){
            swap(arr[count],arr[i]);
            count++;
        }
    }
    cout<<"array after sort"<<endl;
    for (int i = 0; i<size; i++)
    {
        cout<<arr[i]<<"\t";
    }
}
int main(){
    int arr[]={7,8,0,3,0,4,5,6,0,12};
    int size =10;
    cout<<"array before sort"<<endl;
    for (int i = 0; i<size; i++)
    {
        cout<<arr[i]<<"\t";
    }
    movezero(arr,size);

    
  
}