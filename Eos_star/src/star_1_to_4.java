public class star_1_to_4 {
    public static void main(String[] args) {
        //1
        for(int i=0;i<5;++i){
            for(int j=0;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //2
        for (int i = 0; i < 5; i++) {
            for(int j=0;j<5-i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //3
        for(int i=0;i<5;++i){
            for(int j=0;j<4-i;++j){
                System.out.print(" ");
            }
            for(int j=0;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //4
        for(int i=0;i<5;++i){
            for(int j=0;j<i;++j){
                System.out.print(" ");
            }
            for(int j=0;j<5-i;++j){
                System.out.printg("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
