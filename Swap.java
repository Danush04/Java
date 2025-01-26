import java.util.Scanner;
class Swap {
public static void main(String[]args){
Scanner scanner =new Scanner(System.in);
System.out.println("Enter a number");
int a = scanner.nextInt();
int b = scanner.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("The swap of a and b is" +a +b);
}
}