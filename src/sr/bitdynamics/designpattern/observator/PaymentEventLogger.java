package sr.bitdynamics.designpattern.observator;

public class PaymentEventLogger implements PaymentListener {
    @Override
    public void paymentMade() {
        logEvent();
    }

    public void logEvent() {
        System.out.println("Payment received");
    }
}
