public class palindromNumber{
    static void check(int number){
       int rev=0,rem,temp=number;
       
       while(number>0){
           rem = number % 10;
           rev = (rev * 10) + rem;
           number = number/10;
       }
       
       if(rev == temp){
           System.out.print("Number is Palindrom");
       }else{
           System.out.print("Number is not Palinrom");
       }
       
        
    } 
    
    public static void main(String [] args){
       check(12111);
    }
}



import java.util.*;
public class Main{
    static void Pal(String number){
       String rev="";
       int len = number.length();
       for(int i = len-1; i>=0; i--){
           rev = rev + number.charAt(i);
       }
       
       if(rev.equals(number)){
           System.out.print("Number is Palindrom");
       }else{
           System.out.print("Number is not Palinrom");
       }
    } 
    
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);   
        System.out.println("Enter the number");
        String original = in.nextLine();   
        Pal(original);
    }
}
