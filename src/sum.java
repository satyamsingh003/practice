public class sum {
    int a;
    int b;
    void acceptstwo(int a,int b){
        System.out.printf("C:\\>java filename "+a+" "+b);
        System.out.println();
        int sum =0;
    sum=a+b;
        System.out.println("O/P Expected: The sum of "+a+"and "+b+" is "+sum);
    }

    }

class test6{
    public static void main(String[] args) {
        sum obj = new sum();
        obj.acceptstwo(12,45);
    }
}
