package String;

public class StringRemoveCharAt {
    public static void main(String args[]) {
        String str = "this is Java";
        System.out.println(removeCharAt(str, 4));
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
