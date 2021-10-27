package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class GetFelineKittensCountTest {

    @Mock
    Feline feline;

    @Test
    public void shouldGetFelineKittensCount() {
        feline.getKittens(8);
        Mockito.verify(feline).getKittens(8);
    }
}