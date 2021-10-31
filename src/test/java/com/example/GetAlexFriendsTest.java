package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GetAlexFriendsTest {
    @Test
    public void shouldGetThreeFriends() throws Exception {
        Alex alex = new Alex();
        List<String> expectedFriends = new ArrayList<>();
        expectedFriends.add("Марти");
        expectedFriends.add("Глория");
        expectedFriends.add("Мелман");

        List<String> actualFriends = alex.getFriends();
        Assert.assertArrayEquals("Список друзей не совпал",expectedFriends.toArray(), actualFriends.toArray());
    }
}