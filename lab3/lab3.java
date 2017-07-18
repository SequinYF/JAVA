//8.8
/*
public class lab3 {
  public static void main(String[] args) {
    Fan1 fan1 = new Fan1();
    fan1.setSpeed(Fan1.FAST);
    fan1.setRadius(10);
    fan1.setColor("yellow");
    fan1.setOn(true);
    System.out.println(fan1.toString());

    Fan1 fan2 = new Fan1();
    fan2.setSpeed(Fan1.MEDIUM);
    fan2.setRadius(5);
    fan2.setColor("blue");
    fan2.setOn(false);
    System.out.println(fan2.toString());
  }
}

class Fan1 {
  public static int SLOW = 1;
  public static int MEDIUM = 2;
  public static int FAST = 3;

  private int speed = SLOW;
  private boolean on = false;
  private double radius = 5;
  private String color = "white";

  public Fan1() {
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int newSpeed) {
    speed = newSpeed;
  }

  public boolean isOn() {
    return on;
  }

  public void setOn(boolean trueOrFalse) {
    this.on = trueOrFalse;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double newRadius) {
    radius = newRadius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String newColor) {
    color = newColor;
  }

  public String toString() {
    return "speed " + speed + "\n"
      + "color " + color + "\n"
      + "radius " + radius + "\n"
      + ((on) ? "fan is on" : " fan is off");
  }
}


*/

//8.7


public class lab3{
  public static void main (String[] args) {
    Account account = new Account(1122, 20000);
    Account.setAnnualInterestRate(4.5);
    
    account.withdraw(2500);
    account.deposit(3000);
    System.out.println("Balance is " + account.getBalance());
    System.out.println("Monthly interest is " +
      account.getMonthlyInterest());
    System.out.println("This account was created at " +
      account.getDateCreated());
  }
}


class Account {
  private int id;
  private double balance;
  private static double annualInterestRate;
  private java.util.Date dateCreated;

  public Account() {
    dateCreated = new java.util.Date();
  }

  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    dateCreated = new java.util.Date();
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return balance;
  }

  public static double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setId(int newId) {
    id = newId;
  }

  public void setBalance(double newBalance) {
    balance = newBalance;
  }

  public static void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }

  public double getMonthlyInterest() {
    return balance * (annualInterestRate / 1200);
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  public void deposit(double amount) {
    balance += amount;
  }
}
