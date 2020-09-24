package com.github.sjoerdvisscher.coverage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ExampleTest {
    @Test
    public void works() {
        assertEquals(3, new Works().getThree());
    }

    @Test
    public void fails() {
        assertEquals(3, new Fails().getThree());
    }
}