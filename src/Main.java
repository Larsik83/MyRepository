import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int znakOperation=0;
        int roman1=0;
        int roman2=0;
        int arabic1=0;
        int arabic2=0;
        String a;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пример с арабскими или римскими цифрами от 1 до 10: ");
        String str = sc.nextLine();

        System.out.println("введенная  строка: " + str);


        int slojenie = str.indexOf('+');
        int vichitanie = str.indexOf('-');
        int umnojenie = str.indexOf('*');
        int delenie = str.indexOf('/');
        if (slojenie>0){
            znakOperation=0;
            Operations.Slojenie();
        }
        if (vichitanie>0){
            znakOperation=1;
        }
        if (umnojenie>0){
            znakOperation=2;
        }
        if (delenie>0){
            znakOperation=3;
        }


        String newPart[] = str.split("\\+");

//        int firstPart = Integer.parseInt(newPart[0]);
//        int secondPart = Integer.parseInt(newPart[1]);

        if (newPart[0].equals("I")||(newPart[0].equals("II"))||(newPart[0].equals("III"))||(newPart[0].equals("IV"))||
                (newPart[0].equals("V"))||(newPart[0].equals("VI"))||(newPart[0].equals("VII"))||
                (newPart[0].equals("VIII"))||(newPart[0].equals("IX"))||(newPart[0].equals("X"))){


            System.out.println("парт ноль "+roman1);
        } else roman1=1;
        System.out.println("иначе римские1 "+roman1);

        if (newPart[1].equals("I")||(newPart[1].equals("II"))||(newPart[1].equals("III"))||(newPart[1].equals("IV"))||
                (newPart[1].equals("V"))||(newPart[1].equals("VI"))||(newPart[1].equals("VII"))||
                (newPart[1].equals("VIII"))||(newPart[1].equals("IX"))||(newPart[1].equals("X"))){

            System.out.println(roman2);
        } else roman2=1;
        System.out.println("иначе римские 2 "+ roman2);


        if (newPart[0].equals("1")||(newPart[0].equals("2"))||(newPart[0].equals("3"))||(newPart[0].equals("4"))||
                (newPart[0].equals("5"))||(newPart[0].equals("6"))||(newPart[0].equals("7"))||
                (newPart[0].equals("8"))||(newPart[0].equals("9"))||(newPart[0].equals("10"))){


            System.out.println("арабские "+arabic1);
        } else arabic1=1;
        System.out.println("иначе арабские1"+arabic1);


        if ((roman1==roman2)&&(arabic1==arabic2)) {
            System.out.println("выполняем операцию");
        } else
            PrintMassage.PrintWarning();



//        int vichitanie = str.indexOf('-');
//        int umnojenie = str.indexOf('*');
//        int delenie = str.indexOf('/');
//
//        if (slojenie > 0) {
//            String newPart[] = str.split("\\+");
//            int firstPart = Integer.parseInt(newPart[0]);
//            int secondPart= Integer.parseInt(newPart[1]);
//
//            System.out.println(Operations.Slojenie(firstPart,secondPart));
//            System.out.println(newPart[0].equalsIgnoreCase("I"));
//        }
//
//        if (vichitanie > 0) {
//            String newPart[] = str.split("\\-");
//            int firstPart = Integer.parseInt(newPart[0]);
//            int secondPart= Integer.parseInt(newPart[1]);
//            System.out.println(Operations.Vichitanie(firstPart,secondPart));
//
//
//        }
//
//
//        if (umnojenie > 0) {
//            String newPart[] = str.split("\\*");
//            int firstPart = Integer.parseInt(newPart[0]);
//            int secondPart= Integer.parseInt(newPart[1]);
//            System.out.println(Operations.Umnojenie(firstPart,secondPart));
//        }
//
//        if (delenie > 0) {
//            String newPart[] = str.split("\\/");
//            int firstPart = Integer.parseInt(newPart[0]);
//            int secondPart= Integer.parseInt(newPart[1]);
//            System.out.println(Operations.Delenie(firstPart,secondPart));
//        }


    }
    }



