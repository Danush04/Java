import java.util.Scanner;
class Tables {
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int i=0;
for(i=1;i<=10;i++){
System.out.println(n+"*"+i+"="+(n*i));
}
}
}