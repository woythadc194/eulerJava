import java.util.*;
import java.math.*;
public class TestNumber{

    public static void main(String[] args){
        Number a = new Number("112233445566778899");
        Number b = new Number("987654321");
        BigInteger c = new BigInteger("112233445566778899");
        BigInteger d = new BigInteger("987654321");
        

        System.out.println("\nAdd: " + (a.add(b).toString().equals(c.add(d).toString()) ? "Works" : "FIXME"));
        System.out.println(a + " + " + b + " = " + a.add(b) + " : Number");
        System.out.println(c + " + " + d + " = " + c.add(d) + " : BigInteger");
       
        System.out.println("\nSub: " + (a.subtract(b).toString().equals(c.subtract(d).toString()) ? "Works" : "FIXME"));
        System.out.println(a + " - " + b + " = " + a.subtract(b) + " : Number");
        System.out.println(c + " - " + d + " = " + c.subtract(d) + " : BigInteger");
    

        System.out.println("\nMult: " + (a.multiply(b).toString().equals(c.multiply(d).toString()) ? "Works" : "FIXME"));
        System.out.println(a + " * " + b + " = " + a.multiply(b) + " : Number");
        System.out.println(c + " * " + d + " = " + c.multiply(d) + " : BigInteger");
    

        System.out.println("\nDivide: " + (a.divide(b).toString().equals(c.divide(d).toString()) ? "Works" : "FIXME"));
        System.out.println(a + " / " + b + " = " + a.divide(b) + " : Number");
        System.out.println(c + " / " + d + " = " + c.divide(d) + " : BigInteger");  

        System.out.println("\nPow: " + (a.pow(3).toString().equals(c.pow(3).toString()) ? "Works" : "FIXME"));
        System.out.println(a + " ^3 = " + a.pow(3) + " : Number");
        System.out.println(c + " ^3 = " + c.pow(3) + " : BigInteger");

        
        System.out.println("\nEquals: " + ( (a.equals(a)==c.equals(c)) ? "Works" : "FIXME")); 
        System.out.println(a + " == " + a + " : Number");
        System.out.println(c + " == " + c + " : BigInteger");
        
        System.out.println("\nMajorTest...");
        System.out.println("BigInteger Result: " + c.pow(3).multiply(c.subtract(d)).add(c.divide(d)).divide(c).pow(2));
        System.out.println("Number Result:     " + a.pow(3).multiply(a.subtract(b)).add(a.divide(b)).divide(a).pow(2));
    }
}
