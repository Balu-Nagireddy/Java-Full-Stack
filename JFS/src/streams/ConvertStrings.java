package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStrings {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        List<String> colorsUppercase = colors.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase: " + colorsUppercase);
        List<String> colorsLowercase = colors.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("Lowercase: " + colorsLowercase);
    }
}

