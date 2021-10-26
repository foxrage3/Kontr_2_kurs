public class Zad2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j += 3;
            System.out.print(arr[i] + " ");
        }
    }
}
