import java.util.Scanner;

public class swi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the fruit");
        String fruit = sc.next();

        //switch (expression) {
        /*
         * case "xyz";
         * syso("abc");
         * break;
         * 
         * case "lmo";
         * syso("pqrs");
         * break;
         * 
         * default:
         * syso("enter something");
         */
        
    //}


    switch(fruit){
        case "mango":
        System.out.println("mango is king of fruits");
        
        

        case "apple" :
        System.out.println("Apples are red and healthy");
        break;
        
        

        case "orange":
        System.out.println(("i am roundish in shape"));
        break;
        
        
        

        case "Grapes" :
        System.out.println("tiny balls good for heart");
        break;
        

        case "banana" :
        System.out.println("banana gives us 2gm protein");
        
        

        // default:
        // System.out.println("enter a valid fruit name");
        // break;
        
    }
    }
}
