// brute force solution (t.c =O(n3))
public class Pivot {
    public int pivotElement(int []arr){
        for(int i=0;i<arr.length;i++){
            int leftSum=0;
            int rightSum =0;
            if(i==0){
                leftSum=0;
            }
            else{
                for(int j=i-1;j>=0;j--){
                    leftSum+=arr[j];
                }
            }
            if(i==arr.length-1){
                rightSum=0;
            }
            else{
                for(int j=i+1;j<arr.length;j++){
                    rightSum+=arr[j];
                }
            }
            if(leftSum==rightSum){
            return i;
            }
        }
       
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,7,3,6,5,6};
        //int indx = pivotElement(arr);
        Pivot p = new Pivot();
       
        System.out.println("element is  "+ p.pivotElement(arr));
    }    
}
