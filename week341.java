import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit");
        int m = sc.nextInt();
        int product = 1;
        while (m > 0){
            product *= m;
            m = m - 1;
        }
        System.out.println(product);
        
        
    }
}



import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit");
        int num = sc.nextInt();
        if (num % 5 == 0){
            System.out.println("divisible by 5");
        }
        else{
            System.out.println("not divisible by 5");
        }
    }
}



import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit");
        int m = sc.nextInt();
        int product = 1;
        for(int i=m;i>0;i--){
            product *= m;
        }
        System.out.println(product);
        
        
    }
}