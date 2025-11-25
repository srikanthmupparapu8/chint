class Animal {
void sound() {
System.out.println("Animal Makes a sound");
}
}
class Dog extends Animal {
void barks() {
System.out.println("Dog Barks");
}
}
public class Main {
public static void main(String[] args) {
Dog d=new Dog();
d.sound();
d.barks();
}
}

