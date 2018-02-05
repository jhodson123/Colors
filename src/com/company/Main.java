package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 for Hex to RGB, enter 2 for RGB to Hex, Enter anything else to exit");
        int f = input.nextInt();

        if (f == 1){

            System.out.println("Enter Hex Code:");
            String hex = input.next();
            hex = hex.toUpperCase();
            hexToRGB(hex);
        }else if (f == 2){

            System.out.println("Enter RGB Code(R,G,B):");
            int red = input.nextInt();
            int green = input.nextInt();
            int blue = input.nextInt();
            System.out.println(rgbToHex(red, green, blue));
        }else{
            System.exit(0);
        }
    }

    private static void hexToRGB(String hex){

        for (int i=0; i<3; i++) {
            System.out.println(hexHelper(hex.charAt(i),hex.charAt(i+1)));
        }
    }

    private static int hexHelper(char x, char y){

        int ascX = x;
        int ascY = y;
        ascX-=55;
        ascY-=55;

        return ascX*16+ascY;
    }

    private static StringBuilder rgbToHex(int r, int g, int b){

        StringBuilder hex = new StringBuilder();

        String hex1 = Integer.toHexString(r);
        String hex2 = Integer.toHexString(g);
        String hex3 = Integer.toHexString(b);

        hex.append(hex1);
        hex.append(hex2);
        hex.append(hex3);

        return hex;
    }
}
