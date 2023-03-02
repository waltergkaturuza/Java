import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        //method one of creating multiple arrays
        int[][] multiple = new int[2][2];
        multiple[0][0]=10;
        multiple[0][1]=5;
        multiple[1][0]=7;
        multiple[1][1]=1;


        int[][] nine = new int[3][3];
        nine[0][0]=5;
        nine[0][1]=6;
        nine[0][2]=7;
        nine[1][0]=10;
        nine[1][1]=11;
        nine[1][2]=12;
        nine[2][0]=20;
        nine[2][1]=21;
        nine[2][2]=22;

        for(int i=0;i<nine.length;i++){
            for(int j=0;j<nine.length;j++){
                System.out.print(nine[i][j] +" ");
            }
            System.out.println(" ");

        }
        System.out.println("****************************************");
        int [][] myArr=new int [3][3];
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Arry Elements");
        for(int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                myArr[i][j]=scanner.nextInt();
            }
        }

        //printing myArr
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.println(myArr[i][j]+ " ");
//            }
//            System.out.println("");
//        }
//
        for(int i=0;i<nine.length;i++){
            for(int j=0;j<nine.length;j++){
                System.out.print(myArr[i][j] +" ");
            }
            System.out.println(" ");

        }


        //method two of creating multiple arrays
       // int[][] arr2 = {{1,0},{2,3}};
    }
}
