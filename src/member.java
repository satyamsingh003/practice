public class member {
    public String name;
    public int age;
    public long phone_number;
    public String address;
    public long salary;
    member(String name,int age,long phone_number,String address,long salary){
        this.name=name;
        this.age=age;
        this.phone_number=phone_number;
        this.address=address;
        this.salary=salary;
    }}
    class Employee extends member{
    public String specialization="abc";

        Employee(String name, int age, long phone_number, String address, long salary) {
            super(name, age, phone_number, address, salary);
        }

        void display(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(phone_number);
            System.out.println(address);
            System.out.println(salary);
            System.out.println(specialization);

        }}
class manager extends member{
    public String department="CS";

    manager(String name, int age, long phone_number, String address, long salary) {
        super(name, age, phone_number, address, salary);
    }

    void display1(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone_number);
        System.out.println(address);
        System.out.println(salary);
        System.out.println(department);


    }}
class test{
    public static void main(String[] args) {
        Employee obj=new Employee("satyam",20,1234567890,"abcdef",5000000);
        manager obj1=new manager("akshat",21,1234567809,"acdefg",5000000);
        obj.display();
        obj1.display1();
    }
}
