package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable){
        this.stocksObservable = observable;
        this.userName = emailId;
    }
    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is in stock hurry up!!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("msg sent to "+userName);
        //send the actual email to the end user.
    }
}
