//1. WAP in Java to add ,substract ,multiply ,divide using 2 variable s .

import java.lang.*;

class A_calculate {
    public static void main(String arrs[]) {
        int num_1 = 13, num_2 = 2;

        int sum = 0, product = 0, difference = 0;
        float divide = 0;

        sum = num_1 + num_2;
        product = num_1 * num_2;
        difference = num_1 - num_2;
        divide = (float) num_1/num_2;

        System.out.println("Given values are " + num_1 + " and " + num_2);
        System.out.println("SUM : " + sum);
        System.out.println("DIFFERENCE : " + difference);
        System.out.println("PRODUCT : " + product);
        System.out.println("DIVIDE : " + divide);

    }
}
