public class Main {
    public static void main(String[] args) {

        Arma lanza = new Lanza();
        Arma corta = new EspadaCorta();
        Arma larga = new EspadaLarga();
        //String nombre, String clase, int puntosVida, int puntosDefensa, int numeroVidas, Arma arma
        Personaje humanito = new Humano( "German", "descripcion", 20, 3, 3, larga );
        Personaje vikinguito = new Vikingo( "Ragnar", "desc", 22, 5, 3, lanza);

        SimularArena.lucharEntre( humanito, vikinguito );

    }
}
