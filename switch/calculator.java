import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("ENter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        System.out.println("operator : +, -, *, /");
        char operator = sc.next().charAt(0);


        double ans;

        switch(operator){

            case '+' :
            ans = num1 + num2;
            System.out.println("Result:" + ans);
            break;

            case '-' :
            ans = num1- num2;
            System.out.println("Result: " + ans);
            break;

            case '*' :
            ans = num1*num2;
            System.out.println("Result: "+ ans);
            break;

            case '/' :
            ans = num1/num2;
            System.out.println("result" + ans);
            break;

        }
    }
}
