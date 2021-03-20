public class prime{
    static void checkPrime(int num){
        if(num==0 || num==1){
            System.out.print(num + " is not prime");
        }else{
            int m= num/2,flag=0;
            for(int i=2; i <=m; i++ ){
                if(num%i == 0){
                    flag=1;
                    System.out.print(num + " is not prime");
                    break;
                }
            }
            
            if(flag == 0){
                 System.out.print(num + " is prime");
            }
        }
    }
    
    public static void main(String [] args){
        checkPrime(7);
    }
}