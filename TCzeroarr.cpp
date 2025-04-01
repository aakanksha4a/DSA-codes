#include<iostream>
using namespace std;
void sortzero(int arr[],int size){
   int num=0;
  
    for (int i = 0; i < size; i++)
    {
        if(arr[i]!=0){
           
            int temp = arr[num];
            arr[num] = arr[i];
            arr[i]=temp; 
            num++;
                 
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
    sortzero(arr,size);
  
}