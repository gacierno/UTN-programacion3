public class Lanza extends Arma {

    private double puntaAcero = 1.2;

    //CONSTRUCTOR
    public Lanza() {
        super.setDanyo( 10 );
    }

    // hacer danyo
    public double hacerDanyo(){
        return super.getDanyo()*this.getModificador();
    }

    //getters
    public double getModificador(){
        return this.puntaAcero;
    }
}
