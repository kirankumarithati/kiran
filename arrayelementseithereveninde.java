public class arrayevenelement
{
    public static void main(String[] args){
        int[] arr={1,6,10,15,8,51};
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                i++;
            }
        }
        System.out.println(arr);
        
    }
}