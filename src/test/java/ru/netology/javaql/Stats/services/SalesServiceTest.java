package ru.netology.javaql.Stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {
    @Test
    public void shouldFindMinSalesMonth() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMaxSalesMonth() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindSumSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindMidSumSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMidSum = 15;
        int actualMidSum = service.midSales(sales);
        Assertions.assertEquals(expectedMidSum, actualMidSum);
    }

    @Test
    public void shouldFindNumMinSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumMinSales = 5;
        int actualNumMinSales = service.amountLessThnMid(sales);
        Assertions.assertEquals(expectedNumMinSales, actualNumMinSales);
    }

    @Test
    public void shouldFindNumMaxSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumMaxSales = 5;
        int actualNumMaxSales = service.amountGtThnMid(sales);
        Assertions.assertEquals(expectedNumMaxSales, actualNumMaxSales);
    }
}
