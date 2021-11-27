public class sum1 {
    String a;
    String b;
    void acceptstwo(String a,String b){
        System.out.println("java Example "+a+" "+b);

        System.out.println("O/P Expected:"+a+","+b);
    }
    void acceptstwo() {
        System.out.println("No values");
    }

}

class test7{
    public static void main(String[] args) {
        sum1 obj = new sum1();
        obj.acceptstwo("mumbai","bengalore");
    }
}

