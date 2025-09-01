import java.util.Scanner;

/*1. Print Numbers from 1 to N
public class do_while_loop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the last number =  ");
        int n =  sc.nextInt();
        int i =1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}*/

/*2. Sum of Digits of a Number
public class do_while_loop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the last  number:");
        int n = sc.nextInt();
        int sum =0;
        int i =1;
        do{
            sum =sum +i;
            i++;
        }while(i<=n);

        System.out.println("sum = "+sum);
    }
}*/


/*3. Reverse a Number
public class do_while_loop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number =");
        int n = sc.nextInt();
        int r=0;
        do{
            int ld = n%10;
            r = r*10+ld;
            n = n/10;
        }while(n>0);
        System.out.println(r);
    }
}*/

/*4. Menu-Driven Program (User Input)
//👉 Very popular in interviews: simulate a menu until user chooses to exit.
public class do_while_loop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Bye");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.println("Hello!"); break;
                case 2: System.out.println("Bye!"); break;
                case 3: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        sc.close();
    }
}*/


//*5. Palindrome Check (Number or String)
//👉 Classic problem to test string/number handling.
public class do_while_loop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //number
        int n = sc.nextInt();
        int num =n;
        int r=0;
        do{
            int ld = n%10;
            r = r*10+ld;
            n = n/10;
        }while (n>0);
        if(r ==num){
            System.out.println(num +" is Palindrome");
        }
        System.out.println("...........");

        //string

        System.out.print("Enter a word: ");
        String str = sc.next();

        String rev = "";
        int i = str.length() - 1;

        // reverse string using do-while
        do {
            rev = rev + str.charAt(i);
            i--;
        } while (i >= 0);

        // check palindrome
        if (str.equalsIgnoreCase(rev)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }

        sc.close();
    }
}
