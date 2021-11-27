public class accceptstwostrings {
    String s1;
    String s2;
    void accepts(String s1,String s2){
        if (s1=="GLA"&& s2=="Mathura"){
            System.out.println(s1+" University "+s2);
        }
        if (s1=="AAA"&& s2=="Delhi"){
            System.out.println(s1+" Technologies "+s2);
        }
    }
}
class test4{
    public static void main(String[] args) {
        accceptstwostrings obj = new accceptstwostrings();
        obj.accepts("GLA","Mathura");
    }
}
