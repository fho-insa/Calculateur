
public abstract class Package {

    protected static double prixPoidsGabarit = 17.59;
    protected static int prixDimensionGabarit =  12;
    protected static double frais_fixes = 2.86;
    protected static double prixKg = 21.62;
    protected static double prixdmCube = 1.43;


    protected int height;
    protected int depth;
    protected int weight;
    protected int volume;
    protected double poids;


    public abstract double calculateLocalShippingCost();
}