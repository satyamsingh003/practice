public class test78 {


    public static void main(String[] args) {
        int a=10;
        try {
            System.out.println(a / 0);
        }
        catch(ArithmeticException obj){
            System.out.println("infinite");
        }
    }
}
