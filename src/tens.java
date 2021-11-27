public class tens {
    int n;
    void tens(int n){
        int ten = 0;

        int hundreds=0;
        while(n!=0){
            ten=(n-hundreds)/10;}
        System.out.println(ten);
    }
}
class test9{
    public static void main(String[] args) {
        tens obj=new tens();
        obj.tens(12345);
    }
}