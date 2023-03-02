public class AppMethodOver {
    //finding prime numbers from 2-100
//    boolean b = true;
//    boolean a = false;
    public static boolean isPrime(int number){
        for (int i =2; i < number; i++){
            if (number% i==0){
                return false;
                //not prime
            }

        }
        //prime number
        return true;

    }


    public static void main(String[] args) {
        for (int i=2; i<1000; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }

    }

}
