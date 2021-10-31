package com.example;
import org.junit.Assert;

import org.junit.Test;

public class CatGetSoundTest{
    @Test
    public void shouldSayMeow() {
        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals("Да разве это кошка?", expectedSound, actualSound);
    }
}