class Abc{
    void show (int arr[])
    {
        for(int a : arr)
        {
            System.out.println(a);
        }
        
    }
}
class Xyz{
    public static void main(String[] args) {
        Abc obj = new Abc();
        int arr = new int[];
        arr = {12,34,34,34,45};
        obj.show(arr);    
    }
    

}