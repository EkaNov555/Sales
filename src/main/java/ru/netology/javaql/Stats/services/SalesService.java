package ru.netology.javaql.Stats.services;

public class SalesService {
    public int maxSales(int[] sales) {
        int maxMonth = 0;//номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; //номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1;
    }

    public int sumSales(int[] sales) { //сумма продаж
        int sumMonth = 0;
        for (int sale : sales) {
            sumMonth = sumMonth + sale;
        }
        return sumMonth;
    }

    public int midSales(int[] sales) { //средняя сумма продаж
        int sumMonth = sumSales(sales);
        int midMonth;
        midMonth = sumMonth / sales.length;
        return midMonth;
    }

    public int amountLessThnMid(int[] sales) { // кол-во месяцев с суммой меньше среднего
        int midMonth = midSales(sales);
        int lessMid = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < midMonth) {
                lessMid++;
            }
        }
        return lessMid;
    }

    public int amountGtThnMid(int[] sales) { // кол-во месяцев с суммой больше среднего
        int midMonth = midSales(sales);
        int gtMid = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > midMonth) {
                gtMid++;
            }
        }
        return gtMid;
    }
}
