import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int indexZnakOperation;
        int second;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пример с арабскими или римскими цифрами от 1 до 10: ");
        String str = sc.nextLine();

        System.out.println("введенная  строка: " + str);

        int slojenie = str.indexOf('+');
        int vichitanie = str.indexOf('-');
        int umnojenie = str.indexOf('*');
        int delenie = str.indexOf('/');

        if (slojenie > 0) {
            String newPart[] = str.split("\\+");
            int firstPart = Integer.parseInt(newPart[0]);
            int secondPart= Integer.parseInt(newPart[1]);

            System.out.println(Operations.Slojenie(firstPart,secondPart));
            System.out.println(newPart[0].equalsIgnoreCase("I"));
        }

        if (vichitanie > 0) {
            String newPart[] = str.split("\\-");
            int firstPart = Integer.parseInt(newPart[0]);
            int secondPart= Integer.parseInt(newPart[1]);
            System.out.println(Operations.Vichitanie(firstPart,secondPart));


        }


        if (umnojenie > 0) {
            String newPart[] = str.split("\\*");
            int firstPart = Integer.parseInt(newPart[0]);
            int secondPart= Integer.parseInt(newPart[1]);
            System.out.println(Operations.Umnojenie(firstPart,secondPart));
        }

        if (delenie > 0) {
            String newPart[] = str.split("\\/");
            int firstPart = Integer.parseInt(newPart[0]);
            int secondPart= Integer.parseInt(newPart[1]);
            System.out.println(Operations.Delenie(firstPart,secondPart));
        }













    }

}