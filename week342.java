import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit");
        int m = sc.nextInt();
        for(int i = 1; i <= m;i++){
            if(i % 2 == 0){
                System.out.println(i + " even");
            }
            else{
                System.out.println(i + " odd");
            }
        }
        
    }
}




import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("salary");
        int salary = sc.nextInt();
        System.out.println("Service");
        int service = sc.nextInt();
        if (service > 5){
            System.out.println("the bonus is "+ salary * 0.05);
            
        }
        else{
            System.out.println("the bonus is 0");
        }
    
        
    }
}