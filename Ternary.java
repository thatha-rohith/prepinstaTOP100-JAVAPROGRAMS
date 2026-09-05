import java.util.*;
public class Ternary{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int a=sc.nextInt();
        String result=(a>0)?"positive ":(a<0)?"negitive":"Zero";
       System.out.println(result);
    }
}
