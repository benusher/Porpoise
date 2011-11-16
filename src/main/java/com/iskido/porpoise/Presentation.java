package com.iskido.porpoise;

import static org.apache.commons.lang.StringUtils.join;
import static org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase;

public class Presentation {

    public static String unCamel(String camelCasedWords) {
        return join(splitByCharacterTypeCamelCase(camelCasedWords), " ");
    }

    public static String unCamel(Class c) {
        return unCamel(c.getSimpleName());
    }

    public static String unCamel(Object o) {
        return unCamel(o.getClass().getSimpleName());
    }
}
