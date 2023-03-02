public class Campany1 implements  Bank {

    @Override
    public void payTaxes() {
        System.out.println("This Company will pay 100$");

    }

    @Override
    public void payCredit() {
        System.out.println("This company will credits in two months ");

    }

    @Override
    public void verifyYourself() {
        System.out.println("This company verified itself");

    }
    @Override
    public String transfer(){
        return "Hey, I did not transfer money";
    }
}
