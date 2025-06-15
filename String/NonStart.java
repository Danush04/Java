public class NonStart {

    public static String nonStart(String a, String b) {
        if (a.length() < 1 || b.length() < 1) {
            return "";
        }
        String s = a.substring(1);
        String s1 = b.substring(1);
        return s + s1;
    }

    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There")); 
        System.out.println(nonStart("java", "code"));   
        System.out.println(nonStart("ab", "xy"));       
    }
}
