import java.util.Arrays;
public class practiec1
{

    public static void main(String[] args) 
    {
        //Q1: +ve,-Ve,0
        int a=+28;
        if(a>0){
            System.out.println("The number is positive");
        }else if(a==0){
            System.out.println("The number is zero");
        }else{
            System.out.println("The number is negative");
        }
        //Q2:largest  of 2 numbers  using if-else
        int a1=20,b1=30;
        if(a1<b1){
            System.out.println("the b is largest");
        }else{
            System.out.println("The a is largest");
        }
        //Q3: to check the number is even or odd
        int b=56;
        if(b%2==0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is odd");
        }
        //Q4: vowel or consonent
        char ch='a';
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
        //Q5:to assign a grade using if-else-if
        int a2=90;
        if(a2<=90){
            System.out.println("Grade A");
        }else if(a2<=80){
            System.out.println("Grade B");
        }else if(a2<=70){
            System.out.println("Grade C");
        }else if(a2<=60){
            System.out.println("Greade D");
        }else{
            System.out.println("Fail");
        }
        //using switch
        char grade='G';
        switch(grade){
            case 'A':
                System.out.println("Excellent!");
            case 'B':
                System.out.println("Good");
            case 'C':
                System.out.println("Fair!");
            case 'D':
                System.out.println("Need Improvement!");
            case 'F':
                System.out.println("Fail!");
            default:
                System.out.println("invalid grade");

        }
        //Q6:print numbers form 1 to 10 using loop
        for(int i=0;i<=10;i++)
        System.out.println(i+"");
        //Q7: print numbers from 100 to 10 using while loop
        System.out.println("/nQ7: numbers from 100 to 10");
        int b2=100;
        while(b2>=10){
            System.out.print(b2);
            b2--;
        }
        //Q8: print numbers from 1 to 10 do-while loop
        System.out.println("/nQ8: print numbers from 1 to 10(do-while)");
        int a3=1;
        do{
            System.out.println(a3);
            a3++;
        }while(a3<=10);
        //Q9: sum of first 10 natural numbers using loop
        int b3=0;
        for(int i=1;i<=10;i++){
            b3+=i;
        }
        System.out.println("Sum of first 10 natural numbers:"+b3);
        //Q10: store and print 5 integers using an array
        int[] arr2={1,2,3,4,5};
        int[] arr1=new int[5];
        System.out.println("The elements:"+arr2[2]);
        int[] copiec=Arrays.copyOf(arr2,arr2.length);
        System.out.println("copy the array"+Arrays.toString(copiec));
        //Q11: sum of all elements in an integer array
       // int[] nums=new int[5];
        int sum=0;
        for(int num:arr2)
            sum+=num;
            //sum++;
        System.out.println("sum="+sum);
        //Q12: largest number in integer array
        int max=arr2[0];
        for(int num:arr2)
            if(num>max)
            max=num;
        System.out.println("Q12:largest number in array="+max);
        //Q13: length of the string without using built in functions
        System.out.println("The length of array2="+arr2.length);
        //Q14:numbeimport java.util.Arrays;
        char[] str="program".toCharArray();
        int len=0;
        System.out.println("Reverse of string:");
        for(int i=str.length-1;i>=0;i--)
            System.out.print(str[i]);
        System.out.println();
        //Q15:reverse a string with out using built-in function
        System.out.println("Q15: Reverse of array=");
        for(int i=arr2.length-1;i>=0;i--){
            System.out.println(arr2[i]+" ");
        }
        System.out.println();


    

        



    }
}
