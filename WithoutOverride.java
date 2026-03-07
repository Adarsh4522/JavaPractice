// multiplayer guess game in which one player write the word and second player will guess the word if word is matched than he will win. In this problem we have to take
// two strings and compare them without override function

import java.util.Scanner;

class Word {
    String text;
    Word(String text) {
        this.text = text;
    }

    //overriding equlas() without @override annotation

    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(obj == null || getClass()!= obj.getClass())
            return false;

        Word other = (Word) obj;
        return this.text.equalsIgnoreCase(other.text);
    }
}
public class WithoutOverride {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);

    System.out.print("player 1: ");
    Word secret = new Word(sc.nextLine());

    for(int i = 0 ; i<25; i++)
        System.err.println();

    System.out.print("player 2 guess word: ");
    Word guess = new Word(sc.nextLine());

    if(secret.equals(guess))
        System.out.println("player 2 wins");
    else
        System.err.println(("player 1 wins"));

    sc.close();
    }
}
