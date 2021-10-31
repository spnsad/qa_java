package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensTest {

    @Mock
    Feline feline;

    @Test
    public void shouldHasOneKitten() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline, "Самец");
        int expectedKittens = 1;
        int actualKittens = lion.getKittens();
        Assert.assertEquals("Количество детенышей отличается от ожидаемого",expectedKittens, actualKittens);
    }
}