package com.company;

public class wrapper {
    public static void main(String[] args) {
        //Integer i1=new Integer(200);
        //int a=i1;
        //System.out.println(a);
        //Integer i2=34;

        //int res=i2.intValue();
        //System.out.println(res +2);
        //String str= i2.toString();
        //System.out.println(str +4);
            //Integer i1=34;
            //Integer i2=90;
       // System.out.println(i1+i2);
        String s="123";
        int i=Integer.parseInt(s);//to convert string into integer
        System.out.println(i+5);
        Integer i1=223;
        Integer i2=100;
        //System.out.println(i1.equals(i2));//content comparision
        System.out.println(i1==12);//comparing the value not reference as it is primitive value
        Integer i3=100;
        Integer i4=100;
        System.out.println(i3==i4);
    }
}
