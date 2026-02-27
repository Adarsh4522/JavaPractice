class Animal {
    void sound() {
        System.out.println("Sound of different animals");
    }
}

class dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

class cat extends Animal {
    void sound() {
        System.out.println("cat meows");
    }
}

class cow extends Animal {
    void sound() {
        System.out.println("cows moos");
    }
}

public class inher {

    public static void main(String[] args) {
        Animal a;
        a = new dog();
        a.sound();

        a = new cat();
        a.sound();

        a = new cow();
        a.sound();
    }

}



    

 