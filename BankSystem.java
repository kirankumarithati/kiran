interface Bank{
    void withdraw();
    void deposit();
}
class people implements Bank{
    public void withdraw(){
        System.out.println("my first withdra 1000");
    }
    public void deposit(){
        System.out.println("my first deposit 2000");
    }
}
class farmers implements Bank{
    public void withdraw(){
        System.out.println("farming usag purpusr withdra 50k");
    }
    public void deposit(){
        System.out.println("savings 20k");
    }
}
class employee implements Bank{
    public void withdraw(){
        System.out.println("my first salary withdra 80k");
    }
    public void deposit(){
        System.out.println("my first savings 50k");
    }
}
public class BankSystem{
    public static void main(String[] args){
        Bank b1=new people();
        Bank b2=new farmers();
        Bank b3=new employee();
        System.out.println("==people==");
        b1.withdraw();
        b1.deposit();
        System.out.println("==farmers==");
        b2.withdraw();
        b2.deposit();
        System.out.println("==employee==");
        b3.withdraw();
        b3.deposit();
    }
} 
