package com.examplecodewars.codewars.testdome;

import org.junit.Assert;
import org.junit.Test;

public class AccoutTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);

        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void widrawLimit() {
        Account account = new Account(20);

        Assert.assertFalse(account.withdraw(-20));
    }

    @Test
    public void depositLimit() {
        Account account = new Account(20);

        Assert.assertFalse(account.deposit(-20));
    }

    @Test
    public void overdraftLimit() {
        Account account = new Account(20);

        Assert.assertFalse(account.withdraw(40));
    }

    @Test
    public void widrawcorrect() {
        Account account = new Account(20);

        Assert.assertTrue(account.withdraw(10));

    }

    @Test
    public void depositCorrect() {
        Account account = new Account(20);

        Assert.assertTrue(account.deposit(20));


    }

    @Test
    public void depositwidrawCorrect() {
        Account account = new Account(20);

        Assert.assertTrue(account.deposit(20));
        Assert.assertEquals(20d, account.getOverdraftLimit(), epsilon);

        Assert.assertTrue(account.withdraw(10));
        Assert.assertEquals(10d, account.getOverdraftLimit(), epsilon);



    }

}
