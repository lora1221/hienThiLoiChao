package hienThiLoiChao;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class hienThiLoiChao {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = keyboard.nextLine();

        System.out.println("Hello: " + name);
    }
}
