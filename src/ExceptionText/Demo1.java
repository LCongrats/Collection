package ExceptionText;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter two number:");

        int a=in.nextInt();
        System.out.println("Continue:");
        int b=in.nextInt();

        try {
            chu(a,b);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("除法功能处出现异常！");
        }


    }

    public static void chu(int a,int b)
    {
        System.out.println(a);
        System.out.println(b);

        int c=a/b;
        System.out.println(c);
    }
}
