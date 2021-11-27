public class shape1 {
    void draw(){
        System.out.println("Drawing shape");
    }
    void erase(){
        System.out.println("Erasing shape");
    }
}
class Circle extends shape1{
    void play(){
        System.out.println("Drawing circle");}
    void erase(){
        System.out.println("Erasing triangle");
    }

}
class Triangle extends shape1{
    void draw(){
        System.out.println("Drawing Triangle");
    }
    void erase(){
        System.out.println("Erasing Triangle");
    }

}
class Square extends shape1{
    void draw(){
        System.out.println("Drawing Square");
    }
    void erase(){
        System.out.println("Erasing Square");
    }
}
class test45{
    public static void main(String[] args) {


        shape1 c= new Circle();
        c.draw();
        c.erase();
        shape1 t= new Triangle();
        shape1 s= new Square();
    }
}