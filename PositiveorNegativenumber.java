import java.util.*;
public class PositiveorNegativenumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("positive number");
        }
        else if(a==0){
            System.out.println("nor positive not negitive");
        }
        else{
            System.out.println("negitive number");
        }
    }
}
