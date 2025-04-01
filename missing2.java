
import java.util.Arrays;

public class missing2 {
    public static void main(String[] args) {
        int arr[]={9,2,5,7,1,4,6,8,0};
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                System.out.println("missing number"+i);
                break;
            }
        }
        }

    }

