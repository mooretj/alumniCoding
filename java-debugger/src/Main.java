import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        char[] letters = {'b', 'o', 'b', ' ', 's', 'm', 'i', 't', 'h'};
        String name = "";
        int[] a = new int[10];

        for (int i = 0; i < letters.length; i++) {
            name += letters[i];
            a[i] = i + 1;
            sendMessage(name, a[i]);
        }

        String result = areYouPlayingBanjo("Ryan");
        System.out.println(result);

        result = areYouPlayingBanjo("TJ");
        System.out.println(result);


    }

    public static void sendMessage(String name, int msg) {
        System.out.println("Hello, " + name + "! Count to " + msg);
    }

    public static String areYouPlayingBanjo(String name) {
        if(name.toLowerCase().startsWith("r")) {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }

    public static String fakeBin(String numberString) {
        for(int i = 0; i < numberString.length(); i++) {
            if(Integer.valueOf(numberString.charAt(i)) < 5) {
                numberString.charAt(i) = '0';
            }
            if(Integer.valueOf(numberString.charAt(i)) >= 5) {
                numberString.charAt(i) = '1';
            }
        }
        return numberString;
    }
}