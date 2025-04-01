#include<iostream>
using namespace std;
int sort(int arr[],int size,int k){
    for (int i = 0; i < size-1; i++)
    {
        for(int j = i+1;j<size;j++){
            if(arr[i]<arr[j]){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
        }
    }
    
}
int main(){
    int arr[]={4,6,8,3,10,2,56};
    int size=7;
    int k;
    cout<<"Enter the value of k";
    cin>>k;
    if(k>size){
        cout<<"out of bounds"<<endl;
    }
    else{
    // cout<<"array before sort"<<endl;
    // for (int i = 0; i < size; i++){
    //     cout<<arr[i]<<"\t";
    // }
    // cout<<endl;
    
    
//    int flag= sort(arr,size,k);
//     cout<<"array after sort"<<endl;
//     for (int i = 0; i < size; i++){
//         cout<<arr[i]<<"\t";
//     }
//     cout<<endl;

    cout<<k<<" largest element is "<<arr[k-1]<<endl;
}}
