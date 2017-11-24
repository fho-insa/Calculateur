public class ShippingCostsCalculator {

    public double calculateShippingCost(Package monPackage, Destination destination){
        double tarif = 0;
        // Retourne les frais de port du package en fonction de la destination
        if(destination == Destination.FR){
            tarif = monPackage.calculateLocalShippingCost();
        }
        if (destination == Destination.MC){
            tarif = monPackage.calculateLocalShippingCost() *1.087;
        }
        if(destination == Destination.DOM_TOM){
            tarif = (monPackage.calculateLocalShippingCost() * 1.054) + 1.26;
        }
        return tarif;
    }
}