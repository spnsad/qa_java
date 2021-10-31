package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AlexHasKittenTest {

    @Test
    public void shouldHaveNoKittens() throws Exception {
        Alex alex = new Alex();
        int expectedKittenCount = 0;
        int actualKittenCount = alex.getKittens();
        Assert.assertEquals("У Алекса не должно быть львят", expectedKittenCount, actualKittenCount);
    }
}