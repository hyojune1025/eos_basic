import java.util.Scanner;

public class star_1_to_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1
        for(int i=0;i<n;++i){
            for(int j=0;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //2
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n-i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //3
        for(int i=0;i<n;++i){
            for(int j=0;j<(n-1)-i;++j){
                System.out.print(" ");
            }
            for(int j=0;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //4
        for(int i=0;i<n;++i){
            for(int j=0;j<i;++j){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
