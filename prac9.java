import java.util.Scanner;

class prac9 {

    public static int gcd(int m, int n) {

        if (n > m) {
            return gcd(n, m);
        } else if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
        

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two digit :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println();

        System.out.println("enter: "+ gcd(n1,n2));

    }

}