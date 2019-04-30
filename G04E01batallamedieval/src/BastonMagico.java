public class BastonMagico extends Arma {
    private double modificadorMagico = 1.35;

    /*
    *   CONSTRUCTOR
    * */
    public BastonMagico(){
        //simulo un D10
        super.setDanyo( 10 );
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
        return this.modificadorMagico;
    }
}
