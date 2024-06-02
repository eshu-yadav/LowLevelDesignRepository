package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements  NotificationAlertObserver {

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String mail, StocksObservable iphoneStockObservable) {
        this.observable = iphoneStockObservable;
        this.emailId = mail;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product is in stock hurry up! ");
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("mail sent to: " + emailId);
        //Sends the actual email to the end user.
    }
}
