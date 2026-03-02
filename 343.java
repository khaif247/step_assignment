import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("year");
        int num = sc.nextInt();
        
        
        if ((num %4 == 0 && num % 100 != 0) || (num%400 == 0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("non leap year");
        }
       
    
        
    }
}