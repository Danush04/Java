public class WithoutEnd {

    public static String withoutEnd(String str) {
        if (str.length() <= 2) {
            return "";  // Safe handling for very short strings
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(withoutEnd("Hello"));   
        System.out.println(withoutEnd("java"));   
        System.out.println(withoutEnd("Hi"));      
    }
}
