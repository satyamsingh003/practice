public class shape {
    void draw(){
        System.out.println("Drawing Shape");

    }
    void erase(){
        System.out.println("Erasing shape");
    }
}
class Test1{
    public static void main(String[] args) {
        shape obj=new shape();
        obj.draw();
        obj.erase();
    }
}
