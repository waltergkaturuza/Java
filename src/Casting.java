public class Casting {
    public static void main(String[] args) {
//        widening Type Casting


//        narrowing Type Casting (you lose data)
        int a = (int) 4.5;
        System.out.println(a);

        double b =7L; //L means its wrapper classes

        int c =6;
        double d = (int) c;
        int g = (int)d; //explicit casting

//        implicit Casting
        int f = 7;
        double h = f;
        System.out.println(h);
        System.out.println(d);

    }
}
//double -->float-->long-->int-->short-->byte (narrowing) opposite direction is widening