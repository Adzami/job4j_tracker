package ru.job4j.stream;

import java.util.List;

public class Order {
    private int id;
    private String customerName;
    private String address;
    private int totalSum;
    private int ndsPercent;
    private String status;

    static class Builder {
        private int id;
        private String customerName;
        private String address;
        private int totalSum;
        private int ndsPercent;
        private String status;

        Builder buildId(int id) {
            this.id = id;
            return this;
        }

        Builder buildCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        Builder buildAddress(String address) {
            this.address = address;
            return this;
        }

        Builder buildTotalSum(int totalSum) {
            this.totalSum = totalSum;
            return this;
        }

        Builder buildNDSPercent(int ndsPercent) {
            this.ndsPercent = ndsPercent;
            return this;
        }

        Builder buildStatus(String status) {
            this.status = status;
            return this;
        }

        Order build() {
            Order order = new Order();
            order.id = id;
            order.customerName = customerName;
            order.address = address;
            order.totalSum = totalSum;
            order.ndsPercent = ndsPercent;
            order.status = status;
            return order;
        }
    }
}
