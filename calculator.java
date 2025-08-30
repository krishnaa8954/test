import java.util.Scanner;

public class calculator{
    public static int add( int a, int b) {
        return a+b;
    }

    public static int sub( int a, int b) {
        return a-b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =  sc.nextInt();
        int num2 = sc.nextInt();
        int add = add(num1, num2);
        int sub =  sub(num1, num2);
        int mul = mul(num1,num2);
        
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);

        sc.close();
    }
}