import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for(int i = 0; i<10;i++){
            System.out.println("enter age");
            age[i]= sc.nextInt();
        }
        for(int i = 0;i<age.length;i++){
            if(age[i] >= 18){
                System.out.println(age[i] + "can vote");
            }
            else{
                System.out.println(age[i] + "cant vote");
            }
        }
    }
}




import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("enter nu");
            num[i] = sc.nextInt();
            
        }
        for(int i=0;i<5;i++){
            if (num[i] %2 == 0 && num[i] > 0){
                System.out.println("positive even");
            }
            else if (num[i] > 0){
                System.out.println("positive odd");
            }
            else{
                System.out.println("negetive");
            }
        }
        
        
    }
}



import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[11];
        int sumu = 0;
        for(int i=0;i<11;i++){
            System.out.println("enter nu");
            num[i] = sc.nextInt();
            sumu+= num[i];
            
        }
        System.out.println(sumu /11);
        
        
    }
}