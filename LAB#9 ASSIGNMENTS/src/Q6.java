import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter the value of a:");
        a= sc.nextInt();
        System.out.println("Enter the value of b:");
        b= sc.nextInt();
        try{
            c=a/b;
            System.out.println("The result of division is:"+c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
       finally {
            System.out.println("Finally method running");
        }
    }
}
