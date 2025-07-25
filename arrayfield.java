class arrayfield{
    int[] numbers;
    Q7(int size){
        numbers =new int[size];
        for(int i=0;i<size; i++) numbers[i]=i*i;
    }
    void print(){
        for(int n: numbers)System.out.print(n+" ");
    }
    public static void main(String[] args){
        new Q7(4).print();
    }
}