/**********************************************************************
	> File Name: lab6.java
	> Author: 
	> Mail: 
	> Created Time: Thu 27 Oct 2016 12:14:18 CST
 ************************************************************************/


//11_1

//P375
class GeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    } 

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    } 
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

}

class Triangle extends GeometricObject{
    public double side1 = 1.0, side2 = 1.0, side3 = 1.0;
    
    public Triangle(){};
    
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getArea(){
        double helen = (side1 + side2 + side3) / 2;
        return Math.sqrt( helen * (helen - side1) * (helen - side2) * (helen - side3) );
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}




//11_3

//lab3_Account

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





class CheckingAccount extends Account{
    private int overdraftLimit = 123456;

    public String toString(){
        return "checking";
    }
}

class SavingAccount extends Account{
   private int overdraftLimit = 123456;

    public String toString(){
        return "saving";
    }
}



public class lab6{
    
    //11_1

    /*
    public static void main(String[] args){
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);

        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getColor());
        System.out.println(triangle.isFilled());
    }

    */

    //11_3
    
    
    public static void main(String[] args){
        
        Account account = new Account();
        CheckingAccount checkingaccount = new CheckingAccount();
        SavingAccount savingaccount = new SavingAccount();

        System.out.println(account.toString());
        System.out.println(checkingaccount.toString());
        System.out.println(savingaccount.toString());
    }
}

