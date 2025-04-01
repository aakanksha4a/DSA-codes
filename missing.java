class missing{

    static boolean linearSerach(int arr[],int i){

        for(int j=0; j<arr.length;j++){
            if(arr[j]==i){
                return true;
            }
        }
      return false;
    }
   
    public static void main(String[] args) {
        int arr[]={9,2,5,7,1,4,6,8,0};
        for(int i=0;i<arr.length;i++){
            if (linearSerach(arr, i)==false) {
                System.out.print(i);
             
        }
    }
    }
}