//Abstract class
abstract class Shape
{
    //abstract mothod(no body)
    abstract void area();
    //non -abstract method
    void display(){
        System.out.println("this is a shape");
    }
}
//sub class1 
class Circle extends Shape{
    int  radius=5;
    @Override
    void area(){
        double result=3.14*radius*radius;
        System.out.println("Area of Circle :"+result);
    }
}
//subclass 2
class Rectangle  extends Shape{
    int length=10;
    int width=5;
    @Override
    void area(){
        System.out.println("Area of Rectangle :"+(length*width));

    }
}
//main class
public class AbstractDemo
{
    public static void main(String[] args){
        //Shape s=new Shape();//not allow - abstraction class can't be create object
        Shape s1=new Circle();//upcasting
        Shape s2=new Rectangle();
        s1.display();
        s1.area();
        s2.display();
        s2.area();
    }
}