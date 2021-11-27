public class fruit
{String name;
    String taste;
    int size;
    void eat(){

    }

}
class Apple extends fruit{
    void eat(){
        System.out.println("Apple");
        System.out.println("sweet");
}}
class orange extends fruit{
    void eat(){
        System.out.println("Orange");
        System.out.println("sour");
    }
}
class test46{
    public static void main(String[] args) {


    Apple obj=new Apple();
    obj.eat();
    orange obj1=new orange();
    obj1.eat();
}}