package com.example;

import org.junit.Assert;
import org.junit.Test;

public class GetFelineFamilyTest {
    @Test
    public void shouldHaveFelineFamily() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals("Вернулось не семейство кошачьих", expected, actual);
    }
}