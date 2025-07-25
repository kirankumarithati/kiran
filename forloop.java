import java.util.Scanner;
public class forloop
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //1. print numbers from 1 to 10
        for(int i=1;i<=10;i++){
            System.out.println(i+"");
        }
        System.out.println("\n");
        //2. print numbers from 10 to 1
        for(int i=10;i>=1;i--){
            System.out.println(i+"");
        }
        System.out.println("\n");
        //3. multiplication table of 5
        for(int i=1;i<=10;i++){
            System.out.println("5 x "+ i+"="+(5*i));
        }
        System.out.println();
        //4. sum of first 10 natural number
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println("sum of first 10 numbers:"+sum+"\n");
        //5.factorial of a number 
        System.out.println("enter number for factorial:");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("factorial:"+fact+"\n");
        //6. sum of digits of a number
        System.out.println("enter number to find sum of digits:");
        int x=sc.nextInt();
        int digitSum=0;
        for(;x!=0;x/=10){
            digitSum+=x%10;
        }
        System.out.println("Sum of digit:"+digitSum+"\n");
        //7. sum of odd numbers up to N
        System.out.println("Enter N:");
        int N=sc.nextInt();
        sum=0;
        for(int i=1;i<=N;i+=2){
            sum+=i;
        }
        System.out.println("Sum of odd numbers:"+sum+"\n");
        //8.check if number is prime
        System.out.println("enter number to check prime:");
        int primeCheck=sc.nextInt();
        boolean isPrime=true;
        if(primeCheck <=1)isPrime=false;
        for(int i=2;i<=primeCheck/2;i++){
            if(primeCheck%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(primeCheck +"is prime?"+isPrime+"\n");


        //02 revers of number
        System.out.println("number is reverse: 1234");
        int num02=1234,rev=0;
        for(;num02!=0;num02/=10){
            rev=rev*10+num02%10;
        }
        System.out.println("Reversed="+rev);


        //01 count of digit
        System.out.println(" the number count the digits 3456");
        int num01=3456,count=0;
        for(;num01!=0;num01/=10){
            count++;
        }
        System.out.println("digits="+count);

        //9 fibonacci serires up to N terms 
        System.out.println("Enter N for Fibonacci: ");
        int fibN=sc.nextInt();
        int a=0,b=1;
        for(int i=1;i<=fibN;i++){
            System.out.println(a+"");
            int next=a+b;
            a=b;
            b=next;
        }//0 1 1 2 3 5 8.............//fibonacci serires
        System.out.println("\n");
        //10. Armstron number(3-digits only)
        System.out.println("Enter 3-digits number:");
        int arm=sc.nextInt(),tempArm=arm,armSum=0;
        for(;tempArm!=0;tempArm/=10){
            int d=tempArm%10;
            armSum+=d*d*d;
        }//123=1+8+27// 153=1+125+27//153 is a armstron number
        System.out.println("Is Armstrong?"+(arm==armSum)+"\n");
        //11. check if number is perfect number
        System.out.println("Enter a number to check if it's a perfect number:");
        num=sc.nextInt();
        sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
            sum+=i;
            }
        }//sum of facturs =that number 6=2+3 like  thatr
        System.out.println(num+"is perfect?"+(sum==num)+"\n");
        //13 count number of even digits in a number
        System.out.println("Enter a number: ");
        int digits=sc.nextInt();
        int evenCount=0;
        for(;digits!=0;digits/=10){
            if((digits%10)%2==0){
                evenCount++;
            }
        }//one number that first check even or not then number is even then print sount of digit
        System.out.println("Even digit count:"+evenCount+"\n");
        //14.find the power of a number(x^y)
        System.out.println("enter base:");
        int base=sc.nextInt();
        System.out.println("Enter exponent:");
        int exponent=sc.nextInt();
        int result=1;
        for(int i=1;i<=exponent;i++){
            result*=base;
        }//code likes 2^3=2*2*2=8
        System.out.println(base+"^"+exponent+"="+result+"\n");
        //15.check if all digits in number are odd
        System.out.println("Enter number to check all digits are odd:");
        int n=sc.nextInt();
        boolean allOdd=true;
        for(int temp=n;temp>0;temp/=10){
            if((temp%10)%2==0){
                allOdd=false;
                break;
            }
        }
        System.out.println("All digits are odd?"+allOdd+"\n");
        // 16. break statement
        System.out.println("/n16. For loop break on value 5");
        for(int i=1;i<=10;i++)
        {
            if(i==5)break;
            System.out.println(i+"");
            }
            //17. continue example using for loop
            System.out.println("/n/n17. for loop skip value 5");
            for(int i=1;i<=10;i++)
            {
                if(i==5)continue;
                System.out.println(i+"");
            }
            //18.Break example using while loop
            System.out.println("/n/n18. while loop break on value");
            int i=1;
            while(i<=10){
                if(i==5)break;
                System.out.println(i+"");
                i++;
            }
        



    }
}
