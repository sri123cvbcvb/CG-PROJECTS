package com.cg.oopsbanner;

/**
 * UC3: Refactor Banner Logic into Functions
 *
 * Output remains exactly the same as UC2.
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner(getBanner());
    }

    /**
     * Builds and returns the OOPS banner.
     *

     */
    private static String[] getBanner() {
        return new String[]{
                "    ***       ***       *******       ****** ",
                "   ** **     ** **      **    **     **      ",
                "   ** **     ** **      **     **   **      ",
                "   ** **     ** **      **    **      *****  ",
                "   ** **     ** **      *******             **",
                "   ** **     ** **      **                   **",
                "   ** **     ** **      **                  **",
                "    ***       ***       **             ******"
        };
    }

    /**
     * Prints the banner to the console.
     *

     */
    private static void printBanner(String[] bannerLines) {
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
