public class OOPSBannerApp {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
        public static void main(String[] args) {

        CharacterPatternMap charO = new CharacterPatternMap('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });

        CharacterPatternMap charP = new CharacterPatternMap('P', new String[]{
            " *****  ",
            " **   **",
            " **    **",
            " **  *** ",
            " **      ",
            " **      ",
            " **      "
        });

        CharacterPatternMap charS = new CharacterPatternMap('S', new String[]{
            "  **** ",
            " **   **",
            " **      ",
            " *****  ",
            "      **",
            " **   **",
            "  **** "
        });

        CharacterPatternMap[] oops = { charO, charO, charP, charS };

        int rows = charO.getPattern().length;

        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();

            for (int col = 0; col < oops.length; col++) {
                line.append(oops[col].getPattern()[row]);

                if (col < oops.length - 1) {
                    line.append("   ");
                }
            }

            System.out.println(line.toString());
        }
    }
}
