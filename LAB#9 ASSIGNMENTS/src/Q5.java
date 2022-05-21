import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        int a[]=new int[5];
        try{
            Scanner sc=new Scanner(System.in);
            int sum=0,total;
            float result;
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the marks of "+(i+1)+" student:");
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            System.out.println("Enter total marks");
            total= sc.nextInt();

            result=(int)sum/total;
            System.out.println("Result: "+result);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
