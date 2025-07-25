import java.util.Scanner;
import java.util.Arrays;
 public class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Q1. Declere an integer array of size
        int[] arr1=new int[5];
       // System.out.println(arr1);
        //Q2. Assign value to an array
        int[] arr2={1,2,3,4,5};
        //System.out.println(arr2);
        //Q3. print the third element of an array
        System.out.println("Q3: Third  element:"+arr2[2]);
        //Q4.Loop through array amd print element
        System.out.println("Q4: Element:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        //Q5. find length of array
        System.out.println("Q5: Length arr2="+arr2.length);
        //Q6. take 5 numbers in array and print them
        int[] nums=new int[5];
        System.out.println("Q6: Enter 5 numbers:");
        for(int i=0;i<5;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("You entered:");
        for(int num:nums)System.out.print(num+" ");
        System.out.println();
        //Q7: sum of element
        int sum=0;
        for(int num:nums)
        sum+=num;
        System.out.println("Q7: sum ="+sum);
        //Q8: average
        System.out.println("Q8: Average="+(sum/5.0));
        //Q9: maximum
        int max=nums[0];
        for(int num:nums)
           if(num>max)
           max=num;
        System.out.println("Q9: Max="+max);
        //Q10. minimum'
        int min=nums[0];
        for(int num:nums)
           if(num<min)
           min=num;
        System.out.println("Q10: min="+min);
        //Q11: count even and odd
        int even=0,odd=0;
        for(int num:nums){
            if(num%2==0)even++;
            else odd++;
        }
        System.out.println("Q11: even="+even+"odd="+odd);
        //Q12:search for a number
        System.out.println("Q12: enter number to search:");
        int search=sc.nextInt();
        boolean found=false;
        for(int num:nums)
           if(num==search)
           found=true;
        System.out.println(found?"found!":"not found!");
        //Q13: reverse array (in-place)
        System.out.println("Q13: Reversed:");
        for(int i=nums.length-1;i>=0;i--){
            System.out.println(nums[i]+" ");
        }
        System.out.println();
        //Q14. copy to another array
        int[] copy=new int[5];
        for(int i=0;i<5;i++)
            copy[i]=nums[i];
       System.out.println("Q14: copied array:"+Arrays.toString(copy)); 
       //System.out.println("Q14: copied array:"+copy);
       //Q15: check if array contains specific number
       System.out.println("Q15: enter number to check:");
       int check=sc.nextInt();
       boolean exists=false;
       for(int num:nums)
           if(num==check)
           exists=true;
        System.out.println(exists?"Exists!":"Dose not exists");
       //Q16:count positive and negative
       int pos=0,neg=0;
       for(int num:nums){
           if(num>0)
                pos++;
            else if(num<0)
               neg++;
       }
       System.out.println("Q16: positive="+pos+",Negative"+neg);
       //Q17: print even indexs
       System.out.println("Q17: even indexs:");
       for(int i=0;i<nums.length;i+=2)
           System.out.print(nums[i]+" ");
        System.out.println();
        //Q18:print odd indexes
        System.out.println("Q18: odd indexs:");
        for(int i=1;i<nums.length;i+=2)
            System.out.print(nums[i]+" ");
        System.out.println();
        //Q19: check if array is sorted ascending
        boolean sorted=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                sorted=false;
                break;
            }
        }
        System.out.println("Q19:sorted?"+sorted);
        //Q20: swap first and last
        int temp=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=temp;
        System.out.println("Q20: Swapped first amd last:"+Arrays.toString(nums));
        int[] medArr={8,3,2,7,4,9,5};
        //Q21: second largest
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int n:medArr){
            if(n>first){
                second=first;
                first=n;
            }else if(n>second&& n!=first){
                second=n;
            }
        }
        System.out.println("Q21: Second largest="+second);
        //Q22: second smallest
        first=second=Integer.MAX_VALUE;
        for(int n:medArr){
            if(n<first){
                second=first;
                first=n;
            }else if(n<second && n!=first){
                second=n;
            }
        }
        System.out.println("Q22: second smallest="+second);
        //Q23: Removeduplicates
        //set<integr
        //Q24: rotate right by 1
        int last=medArr[medArr.length-1];
        for(int i=medArr.length-1;i>0;i--)
            medArr[i]=medArr[i-1];
        medArr[0]=last;
        System.out.println("Q24: Rotated right:"+Arrays.toString(medArr));
        //Q25: rotate left by 1
        int[] tempArr= new int[medArr.length];
        for(int i=0;i<medArr.length;i++){
            tempArr[i]=medArr[(i+2) % medArr.length];
        }//0 1 2 3 4   5 6 7 8 9 0
        System.out.println("Q25:Rotated left:"+Arrays.toString(tempArr));
        //Q26:
        //Q227:
        //Q28:find  pairs with sum=10
        // 4 6 0 5 5 10
        System.out.println("Q28: Pair with sum10:");
        for(int i=0;i<medArr.length;i++){
            for(int j=i+1;j<medArr.length;j++){
                if(medArr[i]+medArr[j]==10){
                    System.out.print("("+medArr[i]+","+medArr[j]+")");
                }
            }
        }
        System.out.println();
        int[] funcArr={5,3,9,1,4};
        //Q31 sort using Arrays.sort()
        Arrays.sort(funcArr);
        System.out.println("Q31:sorted:"+Arrays.toString(funcArr));
        //Q32 copy using Array.copyOf()
        int[] copied=Arrays.copyOf(funcArr,funcArr.length);
        System.out.println("Q32: copied:"+Arrays.toString(copied));
        //Q33 fill array
        int[] filled=new int[5];
        Arrays.fill(filled,7);
        System.out.println("Q33: filled with 7:"+Arrays.toString(filled));
        //Q34 compare array
        System.out.println("Q34: Arrays equal?"+Arrays.toString(funcArr));
        //Q35 convert to string
        System.out.println("Q35: AS String:"+Arrays.toString(funcArr));
        





    }
}
