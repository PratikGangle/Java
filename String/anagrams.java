package Strings;

public class anagrams {

    public static void main(String[] args) {

        String a = "heart";
        String b = "earth";
        boolean z =false;

        if (a.length() == b.length()) {

            for (int i = 0; i < a.length(); i++) {
                z = false;
                for (int j = 0; j < b.length(); j++) {

                    if (a.charAt(i) == a.charAt(j)) {
                        z = true;
                        break;
                    }

                }

            }
        }

        if (z == true)
            System.out.println("This is anagram");
        else {
            System.out.println("This is not anagram");
        }
    }
}
