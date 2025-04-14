
import java.util.Scanner;



public class Primeno {
    public static int Primenumber(int n){

        int count =0;
        for(int i =1;i<=n;i++){
        if(n%i==0){
            count++;
        }
    }
        if(count==2){
            return 1;
        }
        

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of k");
        int n= sc.nextInt();
        int flag = Primenumber(n);
        if (flag==1) {
            System.out.println("no is prime");
            
        }
        else{
            System.out.println("number is not prime");
        }
        sc.close();
    }
}
