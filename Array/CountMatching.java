package Array;

public class CountMatching {

    public static void main(String[] args) {

        // ruleKey == "type" and ruleValue == typei.
        // ruleKey == "color" and ruleValue == colori.
        // ruleKey == "name" and ruleValue == namei.
        String arr[][] = { { "phone", "blue", "pixel" }, { "computer", "silver", "lenovo" },
                { "phone", "gold", "iphone" } };

        String ruleKey = "color";
        String ruleValue = "silver";

        int ans = 0;

        if (ruleKey == "type") {
            for (int i = 0; i < arr.length; i++) {

                if (arr[i][0] == ruleValue) {
                    ans++;

                }

            }

        }

        if (ruleKey == "color") {
            for (int i = 0; i < arr.length; i++) {
                
                    if (arr[i][1] == ruleValue) {
                        ans++;

                    }

                
            }

        }
        if (ruleKey == "name") {
            for (int i = 0; i < arr.length; i++) {
              
                    if (arr[i][2] == ruleValue) {
                        ans++;

                    }

                
            }

        }

        System.out.println(ans);

    }

}