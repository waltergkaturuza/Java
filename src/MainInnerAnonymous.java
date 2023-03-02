public class MainInnerAnonymous {
    public static void main(String[] args) {
        //Anonymous Inner Classes
        Test test = new Test() {
            @Override
            public String callName() {
                return null;
            }

            @Override
            public int increment() {
                return 0;
            }

            @Override
            public double doDecimal() {
                return 0;
            }
        };

    }
    interface Test{
        String callName();
        int increment();

        double doDecimal();
    }
}
