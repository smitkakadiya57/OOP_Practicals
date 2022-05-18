
import java.util.Scanner;

class prac5{

public static void main(String args []){

Scanner sc=new Scanner(System.in);

System.out.print("Enter three digits: ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

if(a>b && a>c){
System.out.print(a+" ");
if(b>c){
System.out.print(b+" "+c);
}else{
System.out.print(c+" "+b);
}
}

if(b>a && b>c){
System.out.print(b+" ");
if(a>c){
System.out.print(a+" "+c);
}else{
System.out.print(c+" "+a);
}
}


if(c>b && c>a){
System.out.print(c+" ");
if(b>a){
System.out.print(b+" "+a);
}else{
System.out.print(a+" "+b);
}
}


}

}