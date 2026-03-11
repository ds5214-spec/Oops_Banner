/**
 * UC7: OOPS Banner using Inner Static Class
 * Displays the word "OOPS" using stored character patterns.
 */
public class OOPSBannerUC7 {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern; // 7-line banner pattern

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to print banner for a word
     */
    public static void printBanner(String word, CharacterPattern[] patterns) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        // Initialize 7 lines
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Build banner line by line
        for (char ch : word.toCharArray()) {
            for (CharacterPattern cp : patterns) {
                if (cp.getCharacter() == ch) {
                    String[] pat = cp.getPattern();
                    for (int i = 0; i < 7; i++) {
                        bannerLines[i].append(pat[i]).append("  ");
                    }
                }
            }
        }

        // Print banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Pattern for O
        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };

        // Pattern for P
        String[] P = {
            " ******",
            "*     *",
            "*     *",
            " ******",
            "*      ",
            "*      ",
            "*      "
        };

        // Pattern for S
        String[] S = {
            " ******",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ******"
        };

        // Create CharacterPattern objects
        CharacterPattern cpO = new CharacterPattern('O', O);
        CharacterPattern cpP = new CharacterPattern('P', P);
        CharacterPattern cpS = new CharacterPattern('S', S);

        // Store in array
        CharacterPattern[] patterns = { cpO, cpP, cpS };

        // Print OOPS banner
        printBanner("OOPS", patterns);
    }
}