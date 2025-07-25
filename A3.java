class A3
{
    A3(){
        System.out.println("A Constructor");
    }
}
class B3 extends A3{
    B3(){
        System.out.println("B Constructor");
    }
    public static void main(String[] args){
        B3 b=new B3();
    }
}