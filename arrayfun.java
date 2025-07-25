class arrayfun
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        System.out.println("Sum:"+sum(arr));
    }
    public static int sum(int[] arr){
        int total=0;
        for(int x:arr)
            total+=x;
        return total;
    }
}