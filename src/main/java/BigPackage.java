public class BigPackage extends Package {


    public BigPackage (int volume, double poids){
        this.volume = volume;
        this.poids = poids;
    }

    @Override
    public double calculateLocalShippingCost(){
        double volume_dm = (double) this.volume/1000000;
        double tarif_Volume = volume_dm * prixdmCube;
        double tarif_Poids = this.poids * prixKg;
        double tarif;

        if(tarif_Poids<tarif_Volume){
            tarif = tarif_Volume;
        }else{
            tarif =  tarif_Poids;
        }
        return tarif;
    }
}