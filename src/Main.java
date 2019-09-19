import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int first=0;
        int second=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите задачу: ");
        String str=sc.nextLine();
        System.out.println("ваша строка: "+str);

        int slojenie= str.indexOf('+');
        int vichitanie=str.indexOf('-');
        int umnojenie=str.indexOf('*');
        int delenie=str.indexOf('/');


        char myArray[] = str.toCharArray();
        char firstZnachenie=myArray[0];

        int number1 = Character.getNumericValue(firstZnachenie);
        char secondZnachenie=myArray[2];
        int number2 =Character.getNumericValue(secondZnachenie);
        if (slojenie>0){

            System.out.println(Operations.Slojenie(number1,number2));

        }
        if (vichitanie>0){
            System.out.println(Operations.Vichitanie(number1,number2));

        }if (umnojenie>0){
            System.out.println(Operations.Umnojenie(number1,number2));

        }if (delenie>0){
            System.out.println(Operations.Delenie(number1,number2));

        }










    }

}

