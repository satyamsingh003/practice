public class gender {
    String gender1;
    int age;
    void percentage(String gender1,int age){
        if (gender1=="female" && age>1 &&age<58){
            System.out.println("percentage of interest is 8.2%");
        }
        if (gender1=="female"&& age>59 && age<100){
            System.out.println("percentage of interest is 9.2%");
        }
        if (gender1=="male"&& age>1 && age<58){
            System.out.println("percentage of interest is 8.4%");
        }
        if (gender1=="male" && age>59 && age<100){
            System.out.println("percentage of interest is 10.5%");
        }
    }
}
class test3{
    public static void main(String[] args) {
        gender obj =new gender();
        obj.percentage("male",67);
    }
}