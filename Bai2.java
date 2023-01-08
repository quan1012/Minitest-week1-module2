public class Bai2 {
    public static void main(String[] args) {
        int[] arr = {2, 15, 5, 3, 6, 8, 5, 11, 5, 6};
        int sum = 0;
        int max = arr[0];
        for (int i : arr) {
            sum += i;
            if (max < i) {
                max = i;
            }
        }
        System.out.println("sum arr = " + sum);
        System.out.println("max arr = " + max);
    }
}
