package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DoesUnknownLionHaveManeTest {
    @Test
    public void shouldHaveException() {

        try {
            new Lion(new Feline(), "Неопределившийся");
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}