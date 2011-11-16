package com.iskido.porpoise;

import org.junit.Test;

import static com.iskido.porpoise.Presentation.unCamel;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PresentationTest {

    @Test
    public void unCamelSomeCamelCasedWords() throws Exception {
        String unCameled = unCamel("aCamelCasedString");

        assertThat(unCameled, is("a Camel Cased String"));
    }

    @Test
    public void unCamelAClassName() throws Exception {

    }
}
