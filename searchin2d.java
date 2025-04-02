// binary search in 2d array
import java.util.Scanner;

public class searchin2d {
    public static boolean  binaryin2d(int arr[][],int k){
        int row = arr.length;
        int col = arr[0].length;
        int s=0;
        int e = (row*col)-1;
        
        while (s<=e) {
            int mid = s+(e-s)/2;
             int i = mid/col;
             int j = mid%col;
            if(arr[i][j]==k){
                return true;
            }
            else if(arr[i][j]<k){
                s = mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},
        {10,11,16,20},
        {23,30,34,60}};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value you want to search");
        int k= sc.nextInt();
        if(binaryin2d(arr,k)==true){
            System.out.println("element  found");
        }
        else{
            System.out.println("element not found");
        }
    }
}
