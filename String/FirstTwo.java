public class FirstTwo {

    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));  
        System.out.println(firstTwo("abcdef")); 
        System.out.println(firstTwo("H"));      
        System.out.println(firstTwo(""));       
    }
}
