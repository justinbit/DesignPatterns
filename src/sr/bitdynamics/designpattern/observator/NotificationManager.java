package sr.bitdynamics.designpattern.observator;

public class NotificationManager implements PaymentListener {
    @Override
    public void paymentMade() {
        sendNotification();
    }

    public void sendNotification() {
        System.out.println("Notification sent");
    }
}
