package Strings;

public class stringCompression {

    public static void main(String[] args) {

        String a = "aaabbbccc";

        Compression(a);
    }

    public static void Compression(String a) {

        String ans = "";

        for (int i = 0; i < a.length(); i++) {
            Integer count = 1;

            while (i < a.length()-1 && a.charAt(i) == a.charAt(i + 1)) {
                count++;
                i++;
            }

            if (count > 1) {
                ans = ans + a.charAt(i) + count;
            }

        }

        System.out.println(ans);
    }
}
