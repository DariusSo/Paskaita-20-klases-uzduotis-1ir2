import java.util.Scanner;

public class Main {
    private static int nuo = 0;
    private static int iki = 0;
    public static void main(String[] args) {
        // 1 Uzduotis
        Scanner scanner = new Scanner(System.in);
        //nuoIki(scanner);
        //pirminiai();


        //2 uzduotis
        sudejimas(scanner);
    }
    public static void nuoIki(Scanner scanner){
        System.out.println("Iveskite skaiciu nuo: ");
        nuo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Iveskite skaiciu iki: ");
        iki = scanner.nextInt();
        scanner.nextLine();
    }
    public static void pirminiai(){
        for (int i = nuo; i <= iki; i++){
            int dalinamieji = 0;
            for (int j = 1; j < iki; j++){
                if(i % j == 0){
                    dalinamieji++;
                }
            }
            if(dalinamieji <= 2){
                if(i == 2){

                }else{
                    System.out.println(i + " yra pirminis skaicius");
                }
            }
            if(i % 11 == 0){
                System.out.println(i + " dalinasi is 11");
            }
        }
    }
    public static void sudejimas(Scanner scanner){
        System.out.println("Iveskite skaiciu: ");
        String skaicius = String.valueOf(scanner.nextInt());
        scanner.nextLine();
        int suma = 0;
        String s = "";
        for(int i = 0; i < skaicius.length(); i++){
            suma = suma + Integer.parseInt(String.valueOf(skaicius.charAt(i)));
            if (i == skaicius.length() - 1){
                s = s + skaicius.charAt(i);
            }else{
                s = s + skaicius.charAt(i) + "+";
            }
        }
        System.out.println(suma + "(" + s + ")");
    }

}