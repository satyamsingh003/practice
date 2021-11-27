public class person {
    String name;
    int age;
    void person1(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
}
class Student{
    String name;
    int age;
    void Student1(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }

}
class Teacher extends person{
    int salary;
    String subject;
    void person1(String name,int age,int salary,String subject){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(subject);
    }

}
class CollegeStudent extends Student{
    int year;
    String major;
    void Student1(String name,int age,int year,String major){
        System.out.println(name);
        System.out.println(age);
        System.out.println(year);
        System.out.println(major);
    }
}
class test47{
    public static void main(String[] args) {
        Teacher obj=new Teacher();
        obj.person1("abcsd",34,500000,"computer");
        CollegeStudent obj1=new CollegeStudent();
        obj1.Student1("abs",23,2,"cse");
    }
}