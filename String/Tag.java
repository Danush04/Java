public class Tag {

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay"));       
        System.out.println(makeTags("b", "Bold"));     
        System.out.println(makeTags("cite", "Quote"));  
    }
}
