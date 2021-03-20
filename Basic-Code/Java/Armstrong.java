public class Amstrong{
    public static void check(int number){
        int rev=0,temp=number,rem=0;
        
        while (number > 0){
            rem = number % 10;
            number = number / 10;
            rev = rev + (rem*rem*rem);
        }
        
        if(temp == rev){
            System.out.print("this is amstrong number");
        }else{
             System.out.print("this not amstrong number");
        }
    }
    
    public static void main(String [] args){
        check(153);
    }
} 
