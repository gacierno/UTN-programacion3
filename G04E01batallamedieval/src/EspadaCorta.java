public class EspadaCorta extends Espada {

    private double aceroForjado = 1.3;

    /*
    *   CONSTRUCTOR
    * */

    public EspadaCorta() {
        super.setDanyo( 6 );
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
        return this.aceroForjado;
    }
}
