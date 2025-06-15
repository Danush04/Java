public class ExtraEnd {

    public static String extraEnd(String str) {
        String s = str.substring(str.length() - 2);
        return s + s + s;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(extraEnd("Hello"));  
        System.out.println(extraEnd("ab"));     
        System.out.println(extraEnd("Hi"));     
    }
}
