package AnimalCast;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("O objeto nao eh um Cachorro");
        }
    }
}
