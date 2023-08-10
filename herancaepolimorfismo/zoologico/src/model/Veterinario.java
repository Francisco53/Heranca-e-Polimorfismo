package model;
class Veterinario {
    public void examinar(Animal animal) {
        animal.emitirSom();
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();

        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Frajola");
        Passaro passaro = new Passaro("Canarinho");

        veterinario.examinar(cachorro);
        veterinario.examinar(gato);
        veterinario.examinar(passaro);
    }
}