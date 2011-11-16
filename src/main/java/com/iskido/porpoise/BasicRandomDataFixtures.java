package com.iskido.porpoise;

import java.util.Collection;
import java.util.Random;

import static org.apache.commons.lang.StringUtils.leftPad;

public class BasicRandomDataFixtures {

    private static final Random random = new Random();

    public static String anyString() {
        return anyStringOfLength(anyNumberBetween(8, 12));
    }

    private static String anyStringOfLength(int length) {
        String anyString = "";

        for (int index = 0; index < length; index++) {
              anyString += anyCapitalLetter();
        }

        return anyString;
    }

    private static String anyCapitalLetter() {
        return String.valueOf((char) (random.nextInt(26) + 'A'));
    }

    private static int anyNumberBetween(int inclusiveStart, int inclusiveEnd) {
        return random.nextInt(inclusiveEnd - inclusiveStart + 1) + inclusiveStart;
    }

    public static String anyNumberOfLength(int length) {
        int rhs = random.nextInt((int) Math.pow(10, length));
        return leftPad(String.valueOf(rhs), length, '0');
    }

    public static <T> T pickOneOf(T... choices) {
        return choices[random.nextInt(choices.length)];
    }

    public static <T> T pickOneOf(Collection<T> choices) {
        //noinspection unchecked
        return (T) pickOneOf(choices.toArray());
    }

    public static <E extends Enum> E pickOneOf(Class<E> choices) {
        //noinspection unchecked
        return pickOneOf(choices.getEnumConstants());
    }
}
