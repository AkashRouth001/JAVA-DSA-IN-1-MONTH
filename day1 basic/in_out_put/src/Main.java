import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        // normal bacis java use
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("this is the number :"+num);

        //..............................

        // array input
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i< n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i< n;i++){
            System.out.println(arr[i]);
        }*/

        //..............................

        // 2d array
       /* Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][]arr = new int [r][c];*/


        // row wise
        /*for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                 arr[i][j]= sc.nextInt();
            }
        }
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/

        // colum wise
       /* for(int i =0;i<c;i++){
            for(int j =0;j<r;j++){
                arr[j][i]= sc.nextInt();
            }
        }
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
//..............................



        // string input
        /*Scanner sc = new Scanner(System.in);
        String st = sc.nextLine(); // fulll sentance
        String st1 = sc.next(); // only 1 word
        System.out.println(st);*/


    }
}