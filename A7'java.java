//final class A7{}
//class B7 extends A7{} //error: cannot inherit from final class 
//ovverride
class Q8{
    final int a;
    Q8(){
        a=10;
    }
    public static void main(String[] args){
        System.out.println(new Q8().a);
    }
}