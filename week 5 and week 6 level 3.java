import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter number of digits");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter digits");
        int digit = sc.nextInt();
        int[] arr = new int[n];
        int index = 0;
        while (digit != 0){
            arr[index] = digit % 10;
            digit = digit / 10;
            index += 1;
        }
        
        int[] freq = new int[n];
        for(int i = 0; i < n;i++){
            freq[arr[i]] = freq[arr[i]] + 1;
        }
        for(int i= 0; i < n;i++){
            System.out.println(freq[i]);
        }
    }
}