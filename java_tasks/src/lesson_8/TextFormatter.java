package lesson_8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFormatter {

    static String cutSubString(String str) {
        Scanner scan = new Scanner(System.in);
        int indexA, indexB;
        String charA, charB;
        System.out.print("char A: ");
        charA = scan.nextLine();
        System.out.print("char B: ");
        charB = scan.nextLine();
        indexA = str.indexOf(charA);
        indexB = str.lastIndexOf(charB);
        char[] buffer = new char[indexB - indexA + 1];
        str.getChars(indexA, indexB + 1, buffer, 0);
        return String.valueOf(buffer);
    }

    static String replacement(String str) {
        return str.replace(str.charAt(3), str.charAt(0));
    }

    static void fileWithPalindromes(String fileName, String outPut) {
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            String text = "", str;
            while ((c = reader.read()) != -1) {
                text += (char) c;
            }
            text += '\n';
            //      System.out.println(text);
            while (text.indexOf('\n') != -1) {
                str = text.substring(0, text.indexOf('\n') + 1);
                // System.out.print(str);
                if (isPalindrome(str.replace("\n", "")))
                    //   System.out.print(str);
                    write(outPut, str);
                text = text.replace(str, "");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", ""))
                        .reverse().toString());
    }

    public static void write(String outPutFileName, String text) {
        try (FileWriter writer = new FileWriter(outPutFileName, true)) {
            writer.write(text);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

