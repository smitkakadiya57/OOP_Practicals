import java.util.Scanner;

class prac4{

public static void main(String args []){

Scanner sc = new Scanner(System.in);

System.out.print("Enter weight (in pounds) :");
double w=sc.nextDouble();

System.out.print("Enter Height (in inches) :");
double h=sc.nextDouble();

System.out.println("BMI : "+ (w*0.4539237)/(h*0.254*h*0.254));

}

}