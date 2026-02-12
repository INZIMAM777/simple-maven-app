package com.example;

import org.junit.Test;

import com.example.App;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        int result = App.add(10, 20);
        assertEquals(30, result);
    }
}
