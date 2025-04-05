public class rotatedsorted2 {
    public static boolean search(int[] nums, int target) {
        int s =0;
         int e = nums.length-1;
         while(s<=e){
             int mid = s+(e-s)/2;
             if(nums[mid]==target){
                 return true;
             }
             if(nums[s]==nums[mid]&& nums[mid]==nums[e]){
                 s=s+1;
                 e=e-1;
                 continue;
             }
 
             if(nums[s]<=nums[mid]){
                 if(nums[s]<=target && nums[mid]>=target){
                     e=mid -1;
                 }
                 else{
                     s=mid +1;
                 }
             }
             else{
                 if(nums[mid]<=target && target <=nums[e]){
                     s=mid+1;
                 }
                 else{
                     e=mid-1;
                 }
             }
         } return false;
     } 
    public static void main(String[] args) {
        int nums[]={1,0,1,1,1};
        int target=0;
        boolean ans = search(nums,target);
        if(ans==true){
            System.out.println("element found");
        }
        else{
           
                System.out.println("element not found");
            
        }
    }
    
}
