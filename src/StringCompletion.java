import java.util.Scanner;

public class StringCompletion {
    public static void main(String[]args){
        String name, breed;
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Greetings. What is your pet's name? ");
        name = keyboard.nextLine();

        System.out.printf("What kind of animal is %s? ", name );
        breed = keyboard.nextLine();
        System.out.printf("How old is %s? ",name);
        age = keyboard.nextInt();

        System.out.printf("%s is your %s, and it is %d years old", name, breed, age);
    }
}
