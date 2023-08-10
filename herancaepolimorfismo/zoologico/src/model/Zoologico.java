package model;

class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
        jaulas[0] = new Cachorro("Bento");
        jaulas[1] = new Gato("Frajola");
        jaulas[2] = new Passaro("Canarinho");
        jaulas[3] = new Cachorro("Alemao");
        jaulas[4] = new Gato("Tom");
        jaulas[5] = new Passaro("Jujuba");
        jaulas[6] = new Gato("Mimi");
        jaulas[7] = new Cachorro("Luna");
        jaulas[8] = new Passaro("Tucano");
        jaulas[9] = new Cachorro("Buddy");
    }

    public void emitirSonsECorrer() {
        for (Animal animal : jaulas) {
            animal.emitirSom();
            if (animal instanceof Cachorro || animal instanceof Passaro) {
                ((Corredor) animal).correr();
            }
        }
    }
}