public class Roman {
    private String a;
    int number;

    public void Roman() {


    }
    public  void RomanZamena(String a) {

        this.a = a;
        switch (a) {
            case "I":
                number = 1;
                break;
            case "II":
                number = 2;
                break;
            case "III":
                number = 3;
                break;
            case "IV":
                number = 4;
                break;
            case "V":
                number = 5;
                break;
            case "VI":
                number = 6;
                break;
            case "VII":
                number = 7;
                break;
            case "VIII":
                number = 8;
                break;
            case "IX":
                number = 9;
                break;
            case "X":
                number = 10;
                break;
            default:
                System.out.println("Введите пример:");

        }
    }


}
