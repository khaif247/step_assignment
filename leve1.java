import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter p, t, r");
        int simple_interest;
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        simple_interest = (p * t * r) / 100;
        System.out.println(simple_interest);
        
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter stu");
        int hand;
        int stu = sc.nextInt();
        hand = (stu*(stu-1)/2);
        System.out.println(hand);

    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sides");
        int s1;
        int s2;
        int s3;
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        int per;
        per = s1 + s2 + s3;
        int round = 0;
        int sumu = 5;

        while (sumu >0){
            sumu = sumu - 5;
            round += 1;
        }
        System.out.println(round);
    }
}



