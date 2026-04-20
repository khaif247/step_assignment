import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        System.out.println("enter 11 heights");
        int[] array = new int[11];
        Scanner sc = new Scanner(System.in);
        int mini = 1000000;
        int maxi =0;
        int sum = 0;
        for(int i = 0;i<=10;i++){
            
            array[i] = sc.nextInt();
            sum += array[i];
            mini = Math.min(mini, array[i]);
            maxi = Math.max(maxi, array[i]);
        }
        System.out.println(sum / 11);
        System.out.println(maxi);
        System.out.println(mini);
    }
}