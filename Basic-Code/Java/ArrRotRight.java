public class Main{
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8};
        int n =3;
        for(int i=0; i < n; i++){
            int j, last = arr[arr.length-1];
            for(j= arr.length-1 ; j > 0 ; j--){
                arr[j]=arr[j - 1]; 
            }
            arr[j] = last;
        }
    
        
        for(int x=0; x< arr.length; x++){
            System.out.print(arr[x]);
        }
        
    }
    
}