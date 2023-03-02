public class MainArrays {
    public static void main(String[] args) {
        //java Arrays
        int a = 6;
        int[] arr = {1, 100, 5, 6, 7, 4};

        int[] arr2 = new int[4];
        arr2[0] = 5;
        arr2[1] = 7;
        arr2[2] = 3;
        arr2[3] = 8;

        String s[] = {"Hey", "Hello", "Come Back", "Go"};

        int as = s.length;

        double db[] = {1.3, 3.5, 6.1, 7, 8, 10.8};

        System.out.println(s[3]);
        System.out.println(as);
        System.out.println(db[4]);
        System.out.println("---------------------------------");
//for is called for each

        for (String s1 : s) {
            System.out.println(s1);

        }
        System.out.println("---------------------------------");

        for (double j:db){
            System.out.println(j);
        }
        System.out.println("---------------------------------");

        for(int tempName: arr2){
            System.out.println(tempName);

        }
        System.out.println("---------------------------------");
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("---------------------------------");
        for (int i = 0; i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
