package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testOne() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOTwo() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(999);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThree() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFour() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1001);
        int expected = 999;
        Assert.assertEquals(expected, actual);
    }
}