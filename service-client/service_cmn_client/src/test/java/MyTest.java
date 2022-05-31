/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/25 22:20
 * @Version
 */
public class MyTest {
    public static void main(String[] args) {
        String s = "abd";
        char[] c = s.toCharArray();
        for (char c1 : c) {
            System.out.println(c1);
        }
        String t = String.valueOf(c);
        System.out.println(t);
    }
}
