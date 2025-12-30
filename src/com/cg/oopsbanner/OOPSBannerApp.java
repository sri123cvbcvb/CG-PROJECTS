package com.cg.oopsbanner;

import java.util.HashMap;

/**
 * OOPSBannerApp UC5 – Advanced OOP Concepts Implementation
 *
 * <p>
 * This class demonstrates advanced Object-Oriented Programming concepts through
 * the creation and display of an ASCII art banner. It extends the functionality
 * of Use Case 4 by implementing a modular, reusable character pattern system
 * using the Collections Framework.
 * </p>
 *
 * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp {

    /* =====================================================
     * Part 2 – Utility Static Methods
     * ===================================================== */

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     *
     * <p>
     * Each character is mapped to an array of strings where each string
     * represents one line of the character's ASCII art pattern.
     * </p>
     *
     * @return a HashMap where keys are characters and values are String arrays
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "    ***   ",
                "   ** **  ",
                "   ** **  ",
                "   ** **  ",
                "   ** **  ",
                "   ** **  ",
                "   ** **  ",
                "    ***   "
        });

        charMap.put('P', new String[]{
                "*******   ",
                "**    **  ",
                "**     ** ",
                "**    **  ",
                "*******   ",
                "**        ",
                "**        ",
                "**        "
        });

        charMap.put('S', new String[]{
                "******    ",
                "**        ",
                "**        ",
                "*****     ",
                "     **   ",
                "     **   ",
                "     **   ",
                "******    "
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     *
     * <p>
     * This method renders the input message as a large ASCII art banner by
     * iterating through each line of the character patterns and horizontally
     * concatenating the corresponding line from each character in the message.
     * </p>
     *
     * @param message the message string to display as a banner
     * @param charMap the HashMap containing character pattern mappings
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder row = new StringBuilder();

            for (char ch : message.toCharArray()) {
                row.append(charMap.get(ch)[line]).append("  ");
            }

            System.out.println(row);
        }
    }

    /* =====================================================
     * Part 3 – Main Method
     * ===================================================== */

    /**
     * Main entry point of the application.
     *
     * <p>
     * Initializes the character map, defines the message,
     * and displays it as an ASCII art banner.
     * </p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}
