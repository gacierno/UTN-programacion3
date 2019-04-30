abstract class Personaje {
    private String nombre;
    private String clase;
    private int puntosVida;
    private int puntosDefensa;
    private int numeroVidas;
    private Arma arma;

    /*
    *   CONSTRUCTOR
    **/

    public Personaje(String nombre, String clase, int puntosVida, int puntosDefensa, int numeroVidas, Arma arma) {
        this.setNombre( nombre );
        this.setClase( clase );
        this.setPuntosVida( puntosVida );
        this.setPuntosDefensa( puntosDefensa );
        this.setNumeroVidas( numeroVidas );
        this.setArma( arma );
    }

    /*
    *  SETTERS
    * */
    public void setNombre( String nombre ){
        this.nombre = nombre;
    }
    public void setClase( String clase ){
        this.clase = clase;
    }
    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }
    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    /*
    *   GETTERS
    * */
    public String getNombre() {
        return nombre;
    }
    public String getClase() {
        return clase;
    }
    public int getPuntosVida() {
        return puntosVida;
    }
    public int getPuntosDefensa() {
        return puntosDefensa;
    }
    public int getNumeroVidas() {
        return numeroVidas;
    }

    /*
     *  atacar() METODO
     *  calcula una probabilidad random de que el personaje golpee al objetivo
     *  @PARAM target
     *  @returns int
     */
    public void atacar( Personaje target ){
        int danyoReal = 0;
        int probabilidadGolpe = (int)( Math.ceil( 20* Math.random() ) ); //multiplico por 20 para simular un D20
        if( probabilidadGolpe > target.getPuntosDefensa() ){
            danyoReal = (int)Math.ceil( this.arma.hacerDanyo()*Math.random()+1 );
        }
        target.recibirDanyo( danyoReal );
    }

    /*
     *  recibirDanyo() METODO
     *  @param danyo : int
     *  @return void
     */
     public void recibirDanyo( int danyo ){
         this.setPuntosVida( this.getPuntosVida() - danyo );
     }

}
