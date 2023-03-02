
public class Main_OOPBank {
    public static void main(String[] args) {


        Account ac1 = new Account(
                "Walter",
                "Katuruza",
                "waltergkaturuza@gmail.com",
                2000,
                1,
                "0777937721"
               );
        ac1.putMoney(500);
        ac1.withdraw(200);
        System.out.println(ac1.getName());
        System.out.println(ac1.getAccountNo());
    }

    }



