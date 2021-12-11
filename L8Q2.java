//Use interface for the previous question instead of abstract class.
package lab8;
import java.util.*;

interface ComputeArea{
    void calcS();
    void calcT();
    double x=Math.pow(3,0.5)/4;
}

class Input implements ComputeArea{
    double s,t,a1,a2;
    Input(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of the side of a square: ");
        s=in.nextFloat();
        a1=s*s;
        System.out.print("Enter the length of the side of equilateral triangle: ");
        t=in.nextFloat();
        a2=x*t*t;
    }
    public void calcS(){
        System.out.printf("Area of Square is %.4f\n",a1);
    }
    public void calcT(){
        System.out.printf("Area of triangle is %.4f\n",a2);
    }
}

public class L8Q2 {
    public static void main(String[] args){
    ComputeArea i=new Input();
    i.calcS();
    i.calcT();
    }
}
