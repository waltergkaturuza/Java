public class SoftwareDevOP {
    public static void main(String[] args) {
GameDev gameDev = new GameDev("Walter","katuruza","Java",33);
FrontDev frontDev = new FrontDev("Baron", "Walter", "JavaScript",3);

gameDev.comeEarly();
gameDev.testCode();
gameDev.writecode();
        System.out.println("-----------------------------------------");

frontDev.writecode();
frontDev.comeEarly();
frontDev.testCode();
    }
}
