import java.util.*;
public class EvenOdd{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int a=sc.nextInt();
        String result=(a%2==0)?"Even":"Odd";
        System.out.println(result);
    }
}
