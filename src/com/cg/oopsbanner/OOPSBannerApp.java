package com.cg.oopsbanner;

/**
 * OOPSBannerApp UC4 – Banner Display Application with Character Pattern Mapping
 *
 * This class demonstrates key Object-Oriented Programming (OOP) concepts through
 * a banner display system that renders text using ASCII art patterns.
 *
 * @author Developer
 * @version 1.0
 */
public class OOPSBannerApp {

    /* =====================================================
     * Part 2 – Inner Class
     * ===================================================== */

    /**
     * CharacterPatternMap – Inner class for storing character-to-pattern mappings
     *
     * Encapsulates a single character and its corresponding ASCII art pattern.
     * Provides immutable access to character and pattern data through getters.
     */
    static class CharacterPatternMap {

        /** The character being represented */
        private final Character character;

        /** The ASCII art pattern lines for the character */
        private final String[] pattern;

        /**
         * Constructs a CharacterPatternMap with a character and its pattern
         *
         * @param character the character to be mapped
         * @param pattern   the ASCII art pattern representation as array of strings
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Retrieves the mapped character
         *
         * @return the character associated with this pattern map
         */
        public Character getCharacter() {
            return character;
        }

        /**
         * Retrieves the ASCII art pattern
         *
         * @return the pattern array representing the character
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /* =====================================================
     * Part 3 – Outer Class Utility Static Methods
     * ===================================================== */

    /**
     * Static method to create and initialize CharacterPatternMap array
     * for predefined characters.
     *
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', new String[]{
                        "    ***       ***       *******       ****** ",
                        "   ** **     ** **      **    **     **      ",
                        "   ** **     ** **      **     **   **      ",
                        "   ** **     ** **      **    **      *****  ",
                        "   ** **     ** **      *******             **",
                        "   ** **     ** **      **                   **",
                        "   ** **     ** **      **                  **",
                        "    ***       ***       **             ******"
                })
        };
    }

    /**
     * Retrieves the ASCII pattern for a given character.
     *
     * @param ch       the character to look up
     * @param charMaps the array of CharacterPatternMap objects
     * @return ASCII pattern array for the character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[0];
    }

    /**
     * Prints a message as a banner using ASCII art patterns.
     *
     * @param message  the message string to be displayed
     * @param charMaps the array of CharacterPatternMap objects
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        String[] banner = getCharacterPattern(message.charAt(0), charMaps);
        for (String line : banner) {
            System.out.println(line);
        }
    }

    /* =====================================================
     * Part 4 – Main Method
     * ===================================================== */

    /**
     * Main method – Entry point for the banner display application
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Define the message to be displayed
        String message = "OOPS";

        // Print the banner message
        printMessage(message, charMaps);
    }
}
