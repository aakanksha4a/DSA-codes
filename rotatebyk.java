
import java.util.Scanner;

class rotatebyk{
    // static void rotation(int arr[],int k){
    //   for(int i=0;i<k;i++){
    //     int temp = arr[arr.length-1];
    //     for(int j=arr.length-1;j>0;j--){
    //         arr[j]=arr[j-1];
    //     }
    //     arr[0]=temp;
    //   }

    // }
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5};
    //     rotation(arr,1);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }

     public static void rotatearray(int arr[],int low ,int high){
        while(low<=high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
            
        }
        

     }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of k");
        k=sc.nextInt();
        int n=arr.length;
        rotatearray(arr,0,n-1);
        rotatearray(arr,0,k-1);
        rotatearray(arr,k,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}