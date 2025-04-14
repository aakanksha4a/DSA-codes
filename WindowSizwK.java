 class WindowSizwK{
public static boolean checkGroup(int arr[],int target,int k){
            for(int i=0;i<arr.length-k;i++){
                int sum =0;
                for(int j=i;j<i+k;j++){
                    sum+=arr[j];
                }
                    if(sum==target){
                        return true;
                    }
                }      
    return false;
}
public static boolean slidingWindow(int arr[], int target,int k){
    int sum=0;
    for(int i=0; i<k; i++){
        sum+=arr[i];
    }
    if(sum==target){
        return true;
    }
    int left=0;
    int right=k;
    while(right<arr.length){
        
        sum-=arr[left];
        left++;
        System.out.println("sum is "+sum);
        sum+=arr[right];
        right++;
        
        if(sum==target){
            return true;
        }
    }
    return  false;
}
    public static void main(String[] args) {
        int arr[]={1,3,1,3,5,3,6,7};
        int target = 11;
        int k =3;
       if(slidingWindow(arr,target,k)==true){
        System.out.println("true");
       }
       else{
        System.out.println("false");
       }
    }
}