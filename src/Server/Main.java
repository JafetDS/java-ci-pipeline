package Server;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("escriba el numero de operación que desea , 1)sum, 2)res, 3)mul, 4)div ");
            int ope = entrada.nextInt();
            System.out.println("escriba el primer numero");
            int data1 = entrada.nextInt();
            System.out.println("escriba el segundo numero");
            int data2 = entrada.nextInt();
            // write your code here
            switch (ope) {
                case 1:
                    System.out.println("resultado:  " + (data1 + data2));

                    break;
                case 2:
                    System.out.println("resultado:  " + (data1 - data2));
                    break;
                case 3:
                    System.out.println("resultado:  " + (data1 * data2));
                    break;

                case 4:
                    System.out.println("resultado:  " + (data1 / data2));
                    break;

            }
        }
    }
}
