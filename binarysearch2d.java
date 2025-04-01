
import java.util.Scanner;

public class binarysearch2d {
    
       
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int k;
        Scanner sc = new Scanner(System.in);
        k=sc.nextInt();
        int row=3;
        int col=3;
        int start =0;
        int end=(row*col)-1;
        while(start<=end){
            int mid=(start+end)/2;
            int i=mid/col;
            int j=mid%col;
            if(arr[i][j]==k){
                System.out.println("element found at "+i+ "row "+j+" column");
                break;
            }
            else if(arr[i][j]<=k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        
       

    }
    }

