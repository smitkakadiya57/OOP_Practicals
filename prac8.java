import java.util.Scanner;

class prac8{

public static void main(String [] args){

int a=2;
Scanner sc=new Scanner(System.in);

System.out.print("Enter no: ");

int n=sc.nextInt();

while(n>1){

if(n%a==0){
System.out.print(a+" ");
n=n/a;
}else{
a++;
}
}

}
}