package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testOne() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void testTwo() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void testThree() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1000);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @Test
    public void testFour() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }
}