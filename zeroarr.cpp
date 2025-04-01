#include<iostream>
using namespace std;
int sortzero(int arr[],int size){
    for (int i = 0; i < size-1; i++)
    {
        for (int j = i+1; j < size; j++)
        {
            if (arr[i]==0)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        
    }
    
}
int main(){
    int arr[]={7,8,0,3,0,14,0,0,0,12};
    int size =10;
   
    cout<<"array before sort"<<endl;
    for (int i = 0; i < size; i++)
    {
        cout<<arr[i]<<"\t";
    }
    sortzero(arr,size);
    cout<<"array after sort"<<endl;
    for (int i = 0; i < size; i++)
    {
        cout<<arr[i]<<"\t";
    }
}