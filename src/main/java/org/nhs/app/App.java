public class App{
    public static void main(String args[]){
        nest1();
        System.out.println();
        nest2();
        System.out.println();
        nest3();
        System.out.println();
        challenge();
    }
    public static void nest1(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void nest2(){
        for(int i=1; i<=5; i++){
            for(int k=5; k>i; k--){
                System.out.print(".");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void nest3(){
        for(int i=1; i<=5; i++){
            for(int k=5; k>i; k--){
                System.out.print(".");
            }
            System.out.print(i);
            for(int j=1; j<i; j++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
    public static void challenge(){
        for(int i=1; i<=9; i++){
            for(int k=9; k>i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i);
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=0; i<=8; i++){
            for(int k=0; k<=i; k++){
                System.out.print(" ");
            }
            for(int j=7; j>=i; j--){
                System.out.print(8-i);
                System.out.print(8-i);
            }
            System.out.println();
        }
    }
}