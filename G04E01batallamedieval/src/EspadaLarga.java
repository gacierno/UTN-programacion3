public class EspadaLarga extends Espada {
    private double aceroForjado = 1.45;
    private double filoExterno = 1.1;

    /*
    *   CONSTRUCTOR
    * */
    public EspadaLarga(){
        super.setDanyo( 8 );
    }

    /*
     *   HACER DANYO
     * */
    public double hacerDanyo(){
        return super.getDanyo()*this.getModificador();
    }

    /*
     *   GETTERS
     * */
    public double getModificador(){
        return this.aceroForjado + this.filoExterno;
    }
}
