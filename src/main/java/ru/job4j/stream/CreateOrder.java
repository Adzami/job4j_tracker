package ru.job4j.stream;

public class CreateOrder {
    public static void main(String[] args) {
        Order order = new Order.Builder()
                .buildId(293)
                .buildCustomerName("Vasiliy")
                .buildTotalSum(10000)
                .buildNDSPercent(18)
                .buildStatus("Delivered")
                .buildAddress("address")
                .build();
    }
}
