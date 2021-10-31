package com.example;

import org.junit.Assert;
import org.junit.Test;

public class GetFelineKittensCountTest {

    Feline feline = new Feline();

    @Test
    public void shouldGetFelineKittensCount() {
        int expectedKittens = 3;
        int actualKittens = feline.getKittens(3);
        Assert.assertEquals("Вернулось некорректное число котят",expectedKittens,actualKittens);
    }

    @Test
    public void shouldGetOneFelineKitten(){
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        Assert.assertEquals("Вернулось некорректное число котят",expectedKittens,actualKittens);
    }
}