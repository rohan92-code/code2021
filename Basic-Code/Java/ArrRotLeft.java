public class Main{
    public static void main(String []args){
        int []arr = {1,2,3,4,5,6};
        int n = 3;

        for(int i= 0; i<n;i++){
            int j,first = arr[0];
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j + 1];
            }
            arr[j] = first; 
        }

    for(int x= 0 ; x < arr.length; x++){
        System.out.print(arr[x]);
    }
    
   
}

}