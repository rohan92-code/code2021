public class factorial{
    static void fact(int number){
        int fact=1;
        
        for(int i=1;i <= number;i++){
            fact = fact * i;
        }
        
        System.out.print(fact);
        
    } 
    
    public static void main(String [] args){
        fact(3);
    }
}

public class factorial{
    static int fact(int number){
      if(number == 0){
          return 1;
      }
        
      return number*fact(number-1);
        
    } 
    
    public static void main(String [] args){
    int out = fact(10);
    System.out.print(out);
    }
}