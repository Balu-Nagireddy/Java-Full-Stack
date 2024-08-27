package assignment;

import java.util.Scanner;

public class UserMainCode2 {
    public static String concatString(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return str1 + str2;
        } else {
            if (str1.length() > str2.length()) {
                str1 = str1.substring(str1.length() - str2.length());
            } else {
                str2 = str2.substring(str2.length() - str1.length());
            }
            return str1 + str2;
        }
    }
}


