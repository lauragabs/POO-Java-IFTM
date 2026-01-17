public class EqGrau2 {
    private double  a, b, c;
    
    public EqGrau2(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    public double delta(){
        return (b*b) - (4*a*c);
    }

    public double calcularX1(){
        double delta = delta();
        return (-b + Math.sqrt(delta))/(2*a);
    }

    public double calcularX2(){
        double delta = delta();
        return (-b - Math.sqrt(delta))/(2*a);
    }

}
