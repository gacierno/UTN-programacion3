public class SimularArena {
    public static void lucharEntre( Personaje personaje1, Personaje personaje2 ){
        while( personaje1.getPuntosVida() > 0 && personaje2.getPuntosVida() > 0 ){

            System.out.println("la vida de "+ personaje2.getNombre()+" es "+ personaje2.getPuntosVida() );
            System.out.println("ataca " + personaje1.getNombre() );
            personaje1.atacar( personaje2 ) ;
            System.out.println("la vida de "+ personaje2.getNombre()+" despues del ataque es "+ personaje2.getPuntosVida() );
            System.out.println("=============================================");

            System.out.println("la vida de "+personaje1.getNombre()+" es "+ personaje1.getPuntosVida() );
            System.out.println("ataca "+ personaje2.getNombre() );
            personaje2.atacar( personaje1 );
            System.out.println("la vida de "+personaje1.getNombre()+" despues del ataque es "+ personaje1.getPuntosVida() );
            System.out.println("=============================================");

        }
    }
}
