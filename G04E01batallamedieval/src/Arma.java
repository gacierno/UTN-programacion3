abstract class Arma {
    protected double danyo;

    /*
     *  SETTERS
     * */

    public void setDanyo(double danyo) {
        this.danyo = danyo;
    }

    /*
     *  GETTERS
     */
    public double getDanyo(){
        return danyo;
    }

    abstract double getModificador();

    /*
     *   HACER DANYO
     * */
    abstract double hacerDanyo();
}
