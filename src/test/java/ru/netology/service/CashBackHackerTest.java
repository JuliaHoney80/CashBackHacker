package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {

    @org.junit.Test
    public void testRemain1() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemain2() {

        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }


    @org.junit.Test
    public void testRemain3() {

        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemain4() {

        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemain5() {

        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemain6() {

        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }


    @org.junit.Test
    public void testRemain7() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }
}









