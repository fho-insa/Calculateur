
public class PackageFactory {

    protected static int DIMENSIONSGABARIT = 229*162*25;
    protected static double poidsGabaritlimite = 1.800;

    protected Package monPackage;


    public PackageFactory(int height, int depth, int weight, double poids){
        int volume = height*depth*weight;

        if(volume<= DIMENSIONSGABARIT){
            this.monPackage = new SmallPackage(height, depth, weight, poids);
        }else if(poids<= poidsGabaritlimite){
            this.monPackage = new MediumPackage(height, depth, weight, poids);
        }else{
            this.monPackage = new BigPackage(volume, poids);
        }
    }
}