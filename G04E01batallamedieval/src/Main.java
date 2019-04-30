public class Main {
    public static void main(String[] args) {

        Arma lanza1 = new Lanza();
        Arma corta = new EspadaCorta();
        //String nombre, String clase, int puntosVida, int puntosDefensa, int numeroVidas, Arma arma
        Personaje humanito = new Humano( "German", "descripcion", 20, 3, 3, lanza1 );
        Personaje vikinguito = new Vikingo( "Ragnar", "desc", 22, 5, 3, corta);

        while( humanito.getPuntosVida() > 0 && vikinguito.getPuntosVida() > 0 ){
            System.out.println("ataca Vikingo");
            System.out.println("la vida de humano es "+ humanito.getPuntosVida() );
            humanito.recibirDanyo( vikinguito.atacar( humanito ) );
            System.out.println("la vida de humano despues del ataque es "+ humanito.getPuntosVida() );
            System.out.println("=============================================");
            System.out.println("ataca Humano");
            System.out.println("la vida de Vikingo es "+ vikinguito.getPuntosVida() );
            vikinguito.recibirDanyo( humanito.atacar( vikinguito ) );
            System.out.println("la vida de Vikingo despues del ataque es "+ vikinguito.getPuntosVida() );
            System.out.println("=============================================");

        }

    }
}
