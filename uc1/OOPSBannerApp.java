import java.util.HashMap;

public class OopsBanner {

    public static void main(String[] args) {

        HashMap<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
            "  ****  ",   
            "**    **",   
            "**    **",   
            "**    **",  
            "**    **",   
            "**    **",   
            "  ****  "    
        });

        patternMap.put('P', new String[]{
            "******* ",   
            "**    **",    
            "**    **",   
            "******* ",   
            "**      ",   
            "**      ", 
            "**      "    
        });

        patternMap.put('S', new String[]{
            "  ******",   
            "**      ",   
            "**      ",   
            "  ****  ",   
            "      **",  
            "      **",   
            "******  "    
        });

        char[] word = { 'O', 'O', 'P', 'S' };

        int rows = 7;

        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();

            for (int col = 0; col < word.length; col++) {
                String[] pattern = patternMap.get(word[col]);
                line.append(pattern[row]);

                if (col < word.length - 1) {
                    line.append("   ");
                }
            }

            System.out.println(line.toString());
        }
    }
}
