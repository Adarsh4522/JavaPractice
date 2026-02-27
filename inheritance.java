class Parent {   // to access the parent class value we use super keyword
 int x;

 Parent() {
    this.x = 10;
 }
}

class Child extends Parent { // to access the child class value we use this keyword
    int y;

    Child() {
        this.y = 20;
        System.out.println(super.x);
        System.out.println(this.y);
    }
}

public class inheritance{
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println(c.y);

    }
}