public class CustomerPurchase {
    private long phone_number;
    private String first_name;
    private String sur_name;
    private int price;
    private int quantity;
    public String getfirst_name(){
        return first_name;

    }
    public String getsur_name(){
        return sur_name;
    }
    public long getPhone_number(){
        return phone_number;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setFirst_name(String first_name){
        this.first_name=first_name;
    }
    public void setPhone_number(long  phone_number){
        this.phone_number=phone_number;
    }
    public void setSur_name(String sur_name){
        this.sur_name=sur_name;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}
class Printing{
    void PrintDetails(){
        System.out.println("abcderfg");
        System.out.println("1234567876");
        System.out.println("Invoice");
        System.out.println("Invoice number=1234567890987");



    }
    void customerPurchaseReport(){
        System.out.println("REPORT OPTION PERCENTAGE");
        System.out.println("TAX 15%");
        System.out.println("COMMISSION 8.5%");
        System.out.println("DISCOUNT 10%");
        System.out.println("TOTAL(Price + Tax)-(Discount+Commission)");

    }

}
class Test{
    public static void main(String[] args) {
      CustomerPurchase obj=new CustomerPurchase();
      obj.setFirst_name("Satyam");
      obj.setSur_name("Singh");
      obj.setPhone_number(1234567890);
      obj.setPrice(500);
      obj.setQuantity(6);
      Printing obj1=new Printing();
      obj1.PrintDetails();
      obj1.customerPurchaseReport();

    }
}

