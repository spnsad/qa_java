package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DoMaleAndFemaleLionsHaveManeTest {

    private final String sex;
    private final boolean expectedHasMane;

    public DoMaleAndFemaleLionsHaveManeTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getHasMane() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(new Feline(),sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expectedHasMane, actual);
    }
}