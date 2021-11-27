

public class patient {
    String patientname;
    double height;
    double weight;
    void computeBMI(double weight,double height){
        double BMI=weight/(height*height);
        System.out.println("BMI="+BMI);
    }
}
class test2{
    public static void main(String[] args) {
        patient obj=new patient();
        obj.computeBMI(78.54,1.70);
    }
}
