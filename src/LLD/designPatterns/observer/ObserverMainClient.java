package LLD.designPatterns.observer;

public class ObserverMainClient {
    public static void main(String[] args) {
        OrderService orderService =OrderService.getInstance();
        CustomerNotificationService notificationService = new CustomerNotificationService();
        InvoiceGenerationService invoiceService = new InvoiceGenerationService();

        orderService.add(notificationService);
        orderService.add(invoiceService);

        orderService.placeOrder();
        orderService.placeOrder();
        orderService.placeOrder();
    }
}
