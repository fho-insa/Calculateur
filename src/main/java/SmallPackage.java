public class SmallPackage extends Package{
    public SmallPackage (int height, int depth, int weight, double poids){
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.poids = poids;

    }

    @Override
    public double calculateLocalShippingCost(){
        return prixDimensionGabarit;
    }

}
