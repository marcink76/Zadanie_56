import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String[] names = new String[5];
        Scanner inputaName = new Scanner(System.in);

        int index = 0;
        do {
            System.out.println("Podaj imię nr: " + (index+1));
            names[index] = inputaName.nextLine();
            index++;
        }while (index < names.length);

        for (index = names.length - 1; index >= 0; index--){
            System.out.println("Cześć " + names[index] +"!");
        }
    }
}
