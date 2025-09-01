import java.util.Scanner;
//1. Basic Counter Loop
//Print numbers from 1 to 5.
/*public class while_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the last number :");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }

}*/

//2. Sum of Natural Numbers
//Find the sum of numbers from 1 to 10.
/*public class while_loops {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the last number :");
        int n = sc.nextInt();

        int sum =0,i=1;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println("sum is ="+sum);
    }
}*/

//3. Reverse Digits of a Number
//Reverse an integer (e.g., 1234 → 4321).
/*public class while_loops {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the number");
        int n = sc.nextInt();
        int r =0;
        int i = n ;
        while(n!=0){
            int ld = n%10;
            r = r*10+ld;
            n = n/10;
        }
        System.out.println("rev number ="+r);
    }
}*/


//4. Factorial of a Number
//Find factorial of 5 (5! = 120).
/*public class while_loops {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int fact =1;
        System.out.println("ans:");
        if(n==1 || n ==0){
            System.out.println(1);
        }
        else {
            while(n>0){
                fact = fact*n;
                n--;
            }
            System.out.println(fact);
        }

    }
}*/


//5. User Input until Exit
//Keep asking for input until user types exit.
public class while_loops {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=-1;
        while(n!=0){
            System.out.println("enter any number [only exit = 0]");
            n = sc.nextInt();
        }
        System.out.println("the program is close");
    }
}


