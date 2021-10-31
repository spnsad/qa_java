package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LionGetFoodTest {
    @Test
    public void shouldGetFoodAsPredator() throws Exception {
        Lion lion = new Lion(new Feline(),"Самец");
        List<String> expectedFood = new ArrayList<>();
        expectedFood.add("Животные");
        expectedFood.add("Птицы");
        expectedFood.add("Рыба");

        List<String> actualFood = lion.getFood();
        Assert.assertArrayEquals("Список еды не совпал",expectedFood.toArray(), actualFood.toArray());
    }
}