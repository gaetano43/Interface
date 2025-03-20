// Definizione dell'interfaccia Forma
interface Forma {
    double calcolaArea(); // Metodo astratto per il calcolo dell'area
}

// Implementazione della classe Rettangolo
class Rettangolo implements Forma {
    private double larghezza, altezza;

    // Costruttore
    public Rettangolo(double larghezza, double altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    // Implementazione del metodo calcolaArea per il rettangolo
    @Override
    public double calcolaArea() {
        return larghezza * altezza;
    }
}

// Implementazione della classe Triangolo
class Triangolo implements Forma {
    private double base, altezza;

    // Costruttore
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Implementazione del metodo calcolaArea per il triangolo
    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }
}

// Classe principale per testare il programma
public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo(5, 10);
        Forma triangolo = new Triangolo(4, 6);

        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Area del triangolo: " + triangolo.calcolaArea());
    }
}