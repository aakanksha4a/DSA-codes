import java.util.Scanner;

public class binary2d {

    public static int binarysearch(int arr[],int k){
        int start=0;
        int end = arr.length;

        int mid = (start+end)/2;
        if(arr[mid]==k){
            return mid;
        }
        else if(arr[mid]<=k){
            start = mid+1;
        }
        else{
            end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},
        {10,11,16,20},
        {23,30,34,60}};
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of k");
        k=sc.nextInt();
        int i=0;
        while(i < arr.length){
        binarysearch(arr[i],k);
        System.out.println(k+"found at");
        break;
        }
        System.out.println("not found");
        }
        
           
        
    }

