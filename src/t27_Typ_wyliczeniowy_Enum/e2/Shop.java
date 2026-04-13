package t27_Typ_wyliczeniowy_Enum.e2;

import java.util.Scanner;

public class Shop {
    static void main() {
        Order[] orders = getOrders();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String menu = getMenu();
            System.out.println(menu);
            String input = sc.nextLine();
            Status status = Status.valueOf(input.toUpperCase());
            Order[] selectedOrders = getOrdersWithStatus(orders, status);
            System.out.println(printOrders(selectedOrders));
        }
    }

    private static String printOrders(Order[] orders) {
        StringBuilder listOfOrders = new StringBuilder("Lista zamówień: \n");
        for (Order order : orders) {
            if (order != null) {
                listOfOrders.append(order).append("\n");
            }
        }
        return listOfOrders.toString();
    }

    private static String getMenu() {
        StringBuilder menu = new StringBuilder("Jaki status zamówienia Cię interesuje? (");
        for (Status status : Status.values()) {
            menu.append(status.name()).append(", ");
        }
        menu = new StringBuilder(menu.substring(0, menu.length() - 2) + ")");
        return menu.toString();
    }

    private static Order[] getOrders() {
        Order[] orders = new Order[100];
        orders[0] = new Order("Monitor", 900.00, Status.CANCELLED);
        orders[1] = new Order("Tablet", 150.00, Status.PAID);
        orders[2] = new Order("Laptop", 1200.00, Status.SHIPPED);
        orders[3] = new Order("Klawiatura", 100.00, Status.DELIVERED);
        orders[4] = new Order("Mysz", 50.00, Status.PAID);
        orders[5] = new Order("Słuchawki", 150.00, Status.NEW);
        orders[6] = new Order("Ładowarka", 20.00, Status.NEW);
        return orders;
    }

    private static Order[] getOrdersWithStatus(Order[] orders, Status status) {
        Order[] selectedOrders = new Order[orders.length];
        int count = 0;
        for (Order order : orders) {
            if (order!=null && order.getStatus() == status) {
                selectedOrders[count++] = order;
            }
        }
        return selectedOrders;
    }
}
