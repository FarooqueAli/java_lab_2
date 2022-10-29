import java.util.*;
class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float num1,num2;
        System.out.println("Enter Number 1");
        num1=sc.nextFloat();
        System.out.println("Enter Number 2");
        num2=sc.nextFloat();
        System.out.println(num1+"+"+num2+"="+(num1+num2));
        System.out.println(num1+"-"+num2+"="+(num1-num2));
        System.out.println(num1+"*"+num2+"="+(num1*num2));
        System.out.println(num1+"/"+num2+"="+(num1/num2));
    }
}