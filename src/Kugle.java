public class Kugle {

    double radius;

    Kugle (double radius){
        this.radius =radius;

    }

    public double beregnVolumen(){
        double volumen = (4.0/3.0)* (Math.PI)*Math.pow(radius,3);
        return volumen;
    }
}
