import java.util.Scanner;

public class linear2d {

    public static boolean  binary(int arr1[],int k){
        for (int j = 0; j<arr1.length; j++) {
            System.out.print(arr1[j] + " ");
            if (arr1[j]==k) {
                System.out.println("found at row "+ arr1+ "at index "+j);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},
                     {10,11,16,20},
                     {23,30,34,60}};
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of k");
        k=sc.nextInt();
        for (int arr1[]:arr) {
           if(binary(arr1,k)==true){
            break;
           }
           else{
            System.out.println(k+"not available ");
           }

        }
        
    }
    
}
