public class Left2{

    public static String left2(String str) {
        if (str.length() <= 2) {
            return str;
        } else {
            String a = str.substring(2);
            String b = str.substring(0, 2);
            return a + b;
        }
    }

    public static void main(String[] args) {
        System.out.println(left2("Hello"));  
        System.out.println(left2("java"));   
        System.out.println(left2("Hi"));    
        System.out.println(left2("cat"));    
    }
}
