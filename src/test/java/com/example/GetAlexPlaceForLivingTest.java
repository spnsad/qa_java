package com.example;

import org.junit.Assert;
import org.junit.Test;

public class GetAlexPlaceForLivingTest {
    @Test
    public void getAlexPlaceForLiving() throws Exception {
        Alex alex = new Alex();
        String expectedLivingPlace = "Нью-Йоркский Зоопарк";
        String actualLivingPlace = alex.getPlaceOfLiving();
        Assert.assertEquals("Алекс должен жить в Нью-Йоркском зоопарке", expectedLivingPlace, actualLivingPlace);
    }
}