import java.util.Scanner;
class Star {
public static void main(String[]args){
Scanner scanner =new Scanner(System.in);
System.out.println("Enter a number");
int a = scanner.nextInt();
int i=0,j=0;
for(i=1;i<=a;i++);
{
for(j=1;j<=i;j++);
{
System.out.println("*");
}
System.out.println();
}
}}