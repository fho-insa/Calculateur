public class MediumPackage extends Package {

    public MediumPackage (int height, int depth, int weight, double poids){
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.poids = poids;
    }


    @Override
    public double calculateLocalShippingCost() {
        return (prixPoidsGabarit * this.poids) + frais_fixes;

    }
}