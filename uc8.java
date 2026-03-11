import java.util.HashMap;
import java.util.Map;

/**
 * UC8: OOPS Banner App using HashMap
 */
public class OOPSBannerAppUC8 {

    /**
     * Create and return a map of character patterns
     */
    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        // Pattern for O
        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        // Pattern for P
        map.put('P', new String[]{
            " ******",
            "*     *",
            "*     *",
            " ******",
            "*      ",
            "*      ",
            "*      "
        });

        // Pattern for S
        map.put('S', new String[]{
            " ******",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ******"
        });

        // Pattern for space
        map.put(' ', new String[]{
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   "
        });

        return map;
    }

    /**
     * Print banner message using HashMap
     */
    public static void printBanner(String message, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = map.get(ch);
                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patterns = createCharacterPatterns();

        // Print OOPS banner
        printBanner("OOPS", patterns);
    }
}