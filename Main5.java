class Payment {

    protected int paymentID;
    protected String customerName;
    protected double amount;

    public Payment(int id,String name,double amount){
        paymentID=id;
        customerName=name;
        this.amount=amount;
    }

    public void processPayment(){
        System.out.println("Processing payment");
    }
}


class CashPayment extends Payment {

    public CashPayment(int id,String name,double amount){
        super(id,name,amount);
    }

    public void processPayment(){
        System.out.println("Cash payment completed");
    }
}


class CardPayment extends Payment {

    String cardNumber;

    public CardPayment(int id,String name,double amount,String card){
        super(id,name,amount);
        cardNumber=card;
    }

    public void processPayment(){
        System.out.println("Card payment completed");
    }
}


class OnlinePayment extends Payment {

    String platform;

    public OnlinePayment(int id,String name,double amount,String platform){
        super(id,name,amount);
        this.platform=platform;
    }

    public void processPayment(){
        System.out.println("Online payment completed");
    }
}


public class Main5 {

    public static void main(String[] args){

        Payment p;

        p = new CashPayment(1,"John",500);
        p.processPayment();

        p = new CardPayment(2,"Alex",1000,"1234");
        p.processPayment();

        p = new OnlinePayment(3,"Sam",2000,"PayPal");
        p.processPayment();
    }
}