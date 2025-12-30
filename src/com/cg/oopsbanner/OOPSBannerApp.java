package com.cg.oopsbanner;

/**
 * UC2: Render OOPS as Banner using spaces and double asterisks (**)
 */
/**
 * OOPSBannerApp UC2 - Render OOPS as Banner (spaces and *)
 * This class displays OOPS in a visual format and provides metadata analysis.
 * * @author Developer
 * @version 2.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                "    ***       ***       *******       ****** ",
                "   ** **     ** **      **    **     **      ",
                "   ** **     ** **      **     **   **      ",
                "   ** **     ** **      **    **      *****  ",
                "   ** **     ** **      *******             **",
                "   ** **     ** **      **                   **",
                "   ** **     ** **      **                  **",
                "    ***       ***       **             ******"

        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}