import java.util.*;
public class lesson8Code<row00, arr1> {

    public static void main(String[] args) {

        String [][] names = new String [3][4];
        String [] row0 = {"Abby", "Don", "George", "Kim"};
        String [] row1 = {"Brian", "Elenor", "Harry", "Lenny"};
        String [] row2 = {"Cathy", "Fred", "Jill", "Mat"};
        names = new String[][]{row0, row1, row2};
        names[1][2] = "Paul";
        String temp = names[2][3];
        names[2][3] = names[0][0];
        names[0][0] = temp;
        String [] temp1 = names[0];
        names[0] = names[1];
        names[1] = temp1;
for (String [] name: names){
    System.out.println(Arrays.toString(name));
}
        System.out.println(names[0][2] + names[2][0]);
        int [][] arr1 = new int [2][3];
        int [] row00 = {1,2,3};
        int [] row01 = {4,5,6};
        arr1 = new int [][]{row00, row01};
for (int[] print: arr1){
    System.out.println(Arrays.toString(print));
}
        int [][] arr2 = new int [3][2];
        int [] row02 = {1,4};
        int [] row03 = {2,5};
        int [] row04 = {3,6};
        arr2 = new int [][]{row02, row03, row04};
        for (int [] printNum : arr2){
            System.out.println(Arrays.toString(printNum));
        }
        System.out.println(arr1[0][2] + arr2[2][0]);
    }


}
