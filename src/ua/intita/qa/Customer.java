package ua.intita.qa;

public class Customer {
    private int id;
    private String surname;
    private String firstName;
    private String secondName;
    private String address;
    private int creditCard;
    private int bankAccount;


    Customer(int id, String surname, String firstName, String secondName, String address,
             int creditCard, int bankAccount) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }

    public static void creditCard(Customer cust, int credCardBegin, int credCardEnd){
        if((cust.creditCard >= credCardBegin) & (cust.creditCard <= credCardEnd)){
            System.out.println(cust.getFirstName()+" "+cust.getSecondName()+" "+cust.getSurname());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getBankAccount() {
        return bankAccount;
    }
}