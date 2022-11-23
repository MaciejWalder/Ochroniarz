import java.util.Scanner;

public class Ochroniarz {

    public static void main(String[] args) {
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
        System.out.println("Poniżej wpisz czy jesteś w związku Yes/No:");
        String relationship= scanner.nextLine();
        Boolean yes=true;
        Boolean no=false;
        if (yes) {
            System.out.println(yes);
        }else {
            System.out.println(no);
        }
        System.out.println("Witam Cię " +firstName+ " " + lastName + " w KLUBIE TESTERSI :)");

    }





}



