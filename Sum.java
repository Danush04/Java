import java.util.Scanner;
class Sum {
public static void main(String[]args){
Scanner scanner =new Scanner(System.in);
System.out.println("Enter a number");
int a = scanner.nextInt();
int b = scanner.nextInt();
int sum=0;
sum=a+b;
System.out.println("The sum is"+sum);
}
}