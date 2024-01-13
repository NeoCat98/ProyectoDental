package Otros;

public class MaterialSheet {

    String materialName;
    double costPerGram;
    double quantityStored;
    String description;
    String ruta;

    public MaterialSheet(){}

    public MaterialSheet(String materialName, double costPerGram, double quantityStored, String description, String ruta){
        this.materialName = materialName;
        this.costPerGram = costPerGram;
        this.description = description;
        this.quantityStored = quantityStored;
    }


    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

     public String getMaterialName() {
        return materialName;
    }

    public double getCostPerGram() {
        return costPerGram;
    }

    public void setCostPerGram(double costPerGram) {
        this.costPerGram = costPerGram;
    }

    public double getQuantityStored() {
        return quantityStored;
    }

    public void setQuantityStored(double quantityStored) {
        this.quantityStored = quantityStored;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}