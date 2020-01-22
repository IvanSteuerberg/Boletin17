package boletin17;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Boletin17 {

    public static void main(String[] args) {
    Avestruz avestruz = new Avestruz();
        System.out.println("Avestruz:");
    avestruz.camiñar();
    Gato gato = new Gato();
        System.out.println("Gato:");
    gato.camiñar();
    gato.nadar();
    Morcego morcego = new Morcego();
        System.out.println("Morcego:");
    morcego.camiñar();
    morcego.voar();
    Papagaio papagaio = new Papagaio();
        System.out.println("Papagaio:");
    papagaio.camiñar();
    papagaio.voar();
    Tigre tigre = new Tigre();
        System.out.println("Tigre:");
    tigre.camiñar();
    tigre.nadar();
    }
    
}
