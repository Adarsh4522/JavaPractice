// multiplayer guess game in which one player write the word and second player will guess the word if word is matched than he will win. In this problem we have to take
// two strings and compare them with override function

import java.util.Scanner;

class word {
    String text;

    word(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(obj == null || getClass()!= obj.getClass())
            return false;

        word other = (word) obj;

        return this.text.equalsIgnoreCase(other.text);
    }
}

public class override {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Player 1: ");
        word secret = new word(sc.nextLine());

        for(int i = 0; i<25;i++) System.out.println();

        System.out.print("Player 2: ");
        word guess = new word(sc.nextLine());

        if(secret.equals(guess)) {
            System.out.println("Player 2 wins");
        } else {
            System.out.println("player 1 wins");
        }

        sc.close();
    }
}