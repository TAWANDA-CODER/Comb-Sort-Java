public class Main {
    // Driver method
    public static void main(String args[])
    {
        System.out.println("--------------------");
        System.out.println("Comb Sort");
        System.out.println("--------------------");
        CombSort od = new CombSort();
        int arr_comb[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
        System.out.println("Given array:");
        for (int i=0; i<arr_comb.length; ++i){
            System.out.print(arr_comb[i] + " ");
        }
        System.out.println();
        od.sort(arr_comb);
        System.out.println();
        System.out.println("Sorted array:");
        for (int i=0; i<arr_comb.length; ++i){
            System.out.print(arr_comb[i] + " ");
        }
        System.out.println();   
        System.out.println();  
    }


}