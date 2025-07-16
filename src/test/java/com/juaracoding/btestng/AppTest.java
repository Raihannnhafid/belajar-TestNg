package com.juaracoding.btestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    private int a = 10;
    private int b = 2;

    @Test
    public void addTest() {
        int expected = 12;

        int actual = Calculator.add(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void subtractTest() {
        int expected = 8;

        int actual = Calculator.subtract(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tc003() {
        // Test data
        String username = "johansebastian";
        String password = "123qwe";

        // Pre condition
        SignIn signIn = new SignIn();

        // Test steps 1 : isi username yang valid
        signIn.setUsername(username);

        // Test steps 2 : isi password yang valid
        signIn.setPassword(password);

        // Test steps 3 : Klik tomnol signIn (onSignIn())
        boolean actual = signIn.clickButtonSignIn();

        // validate (asserts)
        Assert.assertTrue(actual);
    }
}
