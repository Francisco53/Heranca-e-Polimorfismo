package view;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Cachorro;
import model.Cavalo;
import model.Preguica;

public class ProgramaAnimais {
    
    public static void main(String[] args) {
        
        List<Animal> animais = new ArrayList<>();

        
        animais.add(new Cachorro("Rex", 3));
        animais.add(new Cavalo("Pé de Pano", 8));
        animais.add(new Preguica("Pregui", 2));

        
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
    
}
