package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

public class LionGetKittensTest {

    @Test
    public void shouldHasOneKitten() throws Exception {
        Lion lion = new Lion(new Feline(), "Самец");
        int expectedKittens = 1;
        int actualKittens = lion.getKittens();
        Assert.assertEquals("Количество детенышей отличается от ожидаемого",expectedKittens, actualKittens);
    }
}