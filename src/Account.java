public class Account {
    private String name;
    private  String surname;
    private String email;
    private int accountNo;
    private  String tel;
    private int balance;
//        public Account(){
//
//        }
    public Account(String name, String surname, String email,int balance, int accountNo, String tel) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.balance= balance;
        this.accountNo = accountNo;
        this.tel = tel;
    }
    public void putMoney(int money){
        balance = balance + money;
        System.out.println("You new balance is " + balance);
    }
    public void withdraw(int money){
            balance = balance-money;
        System.out.println("Your balance is " + balance);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
