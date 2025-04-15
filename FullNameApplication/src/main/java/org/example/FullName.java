package org.example;

public class FullName {

    public static String capitalize(String input) {
        input = input.trim();
        if (input.isEmpty()) return "";
        if (input.length() == 1) return input.toUpperCase();
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    public static String formatFullName(String firstName, String middleName, String lastName, String suffix) {
        firstName = capitalize(firstName);
        middleName = capitalize(middleName);
        lastName = capitalize(lastName);
        suffix = suffix.toUpperCase();

        StringBuilder fullName = new StringBuilder(firstName);

        if (!middleName.isEmpty()) {
            fullName.append(" ").append(middleName);
        }

        fullName.append(" ").append(lastName);

        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }

        return fullName.toString();
    }
}
