public class missing3 {
    public static void main(String[] args) {
        int arr[]={9,2,5,7,1,4,6,8,0};
        int sum=arr.length*(arr.length+1)/2;
        int arrsum=0;
        for(int i=0;i<arr.length;i++){
            arrsum+=arr[i];

        }
        System.out.println(sum-arrsum);
    }
}
