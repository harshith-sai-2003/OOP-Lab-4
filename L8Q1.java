//Write a program to compute the area of a square and a triangle by using abstract class.

package lab8;
import java.util.*;

abstract class compute{
    float a;

    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 'a': ");
        a=sc.nextFloat();
    }
    public void print(float area){
        System.out.printf("The area is %.4f\n",area);
    }
}

class square extends compute{
    float Area(){
        return  (a*a);
    }
}

class triangle extends compute{
    float Area(){
        return (float) (Math.pow(3,0.5)*a*a/4);
    }
}

public class L8Q1 {
    public static void main(String[] args){
        triangle tr=new triangle();
        square sq=new square();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Square 2.Triangle");
        int opt;
        opt=sc.nextInt();
        switch(opt){
            case 1: sq.read(); sq.print(sq.Area()); break;
            case 2: tr.read(); tr.print(tr.Area()); break;
            default:
                System.out.println("Invalid input");
        }
    }
}
