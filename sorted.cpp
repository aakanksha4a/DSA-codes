#include<iostream>
using namespace std;
int checksorted(int arr[],int size){
    for(int i =1 ;i<size;i++){
        if (arr[i]<arr[i-1])
        {
            return -1;
        }
        
    }
    return 1;
}

int main(){
    int arr[]={10,20,30,40,50};
    int size =5;
   
    checksorted(arr,size)==1?cout<<"sorted"<<endl: cout<<"unsorted"<<endl;
    
}