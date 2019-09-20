import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int indexZnakOperation;
        int second;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите задачу: ");
        String str = sc.nextLine();
        System.out.println("ваша строка: " + str);

        int slojenie = str.indexOf('+');
        int vichitanie = str.indexOf('-');
        int umnojenie = str.indexOf('*');
        int delenie = str.indexOf('/');
//        System.out.println("slojenie= "+slojenie);
//        System.out.println("vichitanie"+vichitanie);
//        System.out.println("umnojenie "+umnojenie);
//        System.out.println("delenie "+delenie);
        if (slojenie > 0) {
            String newPart[] = str.split("\\+");
            int firstPart = Integer.parseInt(newPart[0]);
            int secondPart= Integer.parseInt(newPart[1]);

            System.out.println("1 часть " + firstPart);
            System.out.println("2 часть " + secondPart);
        }

        if (vichitanie > 0) {
            String newPart[] = str.split("\\-");

            System.out.println("1 часть " + newPart[0]);
            System.out.println("2 часть " + newPart[1]);
        }


        if (umnojenie > 0) {
            String newPart[] = str.split("\\*");
        }

        if (delenie > 0) {
            String newPart[] = str.split("\\/");
        }






        char myArray[] = str.toCharArray();
        char firstZnachenie = myArray[0];

        int number1 = Character.getNumericValue(firstZnachenie);
        char secondZnachenie = myArray[2];
        int number2 = Character.getNumericValue(secondZnachenie);


        if (slojenie > 0) {

            System.out.println(Operations.Slojenie(number1, number2));

        }
        if (vichitanie > 0) {
            System.out.println(Operations.Vichitanie(number1, number2));

        }
        if (umnojenie > 0) {
            System.out.println(Operations.Umnojenie(number1, number2));

        }
        if (delenie > 0) {
            System.out.println(Operations.Delenie(number1, number2));

        }


    }

}