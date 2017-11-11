package me.piggypiglet.gary;

import java.util.Arrays;

public class Util {
    public String fromArray(String[] str) {
        return Arrays.toString(str)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
    }
}
