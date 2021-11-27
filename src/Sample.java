public class Sample {
    String s1;
    void str(String s1){
        System.out.printf("C:\\>java Sample %s%n", s1);

        System.out.println("O/P Expected : Welcome "+s1);
    }
}
class test5{
    public static void main(String[] args) {
        Sample obj=new Sample();
        obj.str("Aman");
    }
}
