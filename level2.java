import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrays = new int[8];
        int index = 0;
        for(int i = 1;i<n;i++){
            if (n % i == 0){
                arrays[index] = i;
                index += 1;
            }
            
        }
        int sumu = 0;
        int product = 1;
        int squares = 1;
        for(int i = 0;i<index;i++){
            sumu += arrays[i];
            product *= arrays[i];
            squares += Math.pow(arrays[i], 2);
            
            System.out.println(arrays[i]);
        }
        System.out.println(sumu);
        System.out.println(product);
        

    }
}
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
            System.out.println("leap");
        }
        else{
            System.out.println("not leap");
        }
    }
}