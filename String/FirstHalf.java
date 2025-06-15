public class FirstHalf {

    public static String firstHalf(String str) {
        int s = str.length() / 2;
        return str.substring(0, s);
    }

    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));    
        System.out.println(firstHalf("abcdef"));     
        System.out.println(firstHalf("HelloThere")); 
    }
}
