

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] friend = new double[3];
        double maxi = 0;
        double mini = 1000;
        for(int i = 0;i < 3;i++){
            System.out.println("enter heigth");
            friend[i] = sc.nextDouble();
            maxi= Math.max(maxi, friend[i]);
            mini = Math.min(mini, friend[i]);
        }
        System.out.println(maxi+" "+ mini);
        
    }
}



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
        }
    }
}






