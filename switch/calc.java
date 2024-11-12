import java.util.Scanner;

public class calc {
    private static final char add = 0;
    
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the number 1");
            int num1 = sc.nextInt();
    
            System.out.println("Enter the operator");
            char ch = sc.next().charAt(0);
    
            System.out.println("Enter the number 2");
            int num2 = sc.nextInt();
    
            switch('+'){
                case add:
                System.out.println(num1+num2);
                    break;

                case sub:
                System.out.println((num1-num2));
                break;

                case mul:
                System.out.println("num1*num2");
                break;



    
        }


    }
}
