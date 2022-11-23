import java.util.Scanner;

public class Ochroniarz {

    public static void main(String[] args) {
        System.out.println("Witaj w Aplikacji Ochroniarz");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Poniżej wpisz swoje imię:");
        String firstName=scanner.nextLine();
        System.out.println("Poniżej wpisz swoje nazwisko:");
        String lastName=scanner.nextLine();
        System.out.println("Poniżej wprowadź Twoje miasto zamieszkania:");
        String address=scanner.nextLine();
        System.out.println("Poniżej wpisz swój wiek:");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Poniżej wpisz czy jesteś w związku True/Fals:");
        boolean relationship= scanner.nextBoolean();
        if (relationship==true) {
            System.out.println("Witam Cię " +firstName+ " " + lastName + " z " +address + " masz " + age + " lat i " + " jesteś w związaku zatem WITAM w KLUBIE TESTERSI :)");
        }else {

        }

    }





}



