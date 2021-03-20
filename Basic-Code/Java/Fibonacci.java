// without recurccion

public class Fib{
    
    public static void Fibonacci(int count){
        int n1=0,n2=1,n3=0;
        System.out.print(n1 + " " + n2);
        
        for (int i=2;i<count;i++){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
        }
    
    }

     public static void main(String []args){
        Fibonacci(10);
     }
}

//with rec

public class FibRec{
    
    static int n1=0,n2=1,n3=0;
    static void calFib(int count){
        if(count > 0){
         n3 = n1 + n2;
         System.out.print(" " + n3);
         n1=n2;
         n2=n3;
         calFib(count-1);
        }
        
    }    
    public static void main(String []args){
        System.out.print(n1 + " " + n2);
        int count = 10;
        
        calFib(count-2);
    }
        
    
}