import java.util.Scanner;

public class D1_array_input {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size :");
        int s = sc.nextInt();
        System.out.println("enter the arrays :");
        int []arr = new int[s];
        for(int i =0;i<s;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("the arrays :");
        for(int i =0;i<s;i++){
            System.out.println(arr[i]);
        }
    }
}
