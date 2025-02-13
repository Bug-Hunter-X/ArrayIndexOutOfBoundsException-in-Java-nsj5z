public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        // Accessing a valid index
        System.out.println(arr[0]);
        //You can also print the whole array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}