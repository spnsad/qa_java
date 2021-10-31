package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class CatGetFoodTest {
    @Test
    public void shouldGetFoodAsPredator() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = cat.getFood();
        Assert.assertArrayEquals("Список еды не совпал",expectedFood.toArray(), actualFood.toArray());
    }
}