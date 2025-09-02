import java.util.Scanner;

public class array_2d_input {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row size :");
        int r = sc.nextInt();
        System.out.println("enter the calumn size :");
        int c = sc.nextInt();

        int [][] arr = new int[r][c];

        /*if input as row
        System.out.println("input the matrix row wish :");
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }*/


        //if input as coloum
        System.out.println("input the matrix coloum wish :");
        for(int i =0;i<c;i++){
            for(int j =0;j<r;j++){
                arr[j][i] = sc.nextInt();
            }
        }


        //output
        System.out.println("the matrix is :");
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
