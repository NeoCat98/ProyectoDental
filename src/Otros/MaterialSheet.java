package Otros;

public class MaterialSheet {

    String materialName;
    double costPerGram;
    double quantityStored;
    String description;
    String ruta;
    Integer id;

    public MaterialSheet(){}

    public MaterialSheet(Integer id,String materialName, double costPerGram, double quantityStored, String description, String ruta){
        this.materialName = materialName;
        this.costPerGram = costPerGram;
        this.description = description;
        this.quantityStored = quantityStored;
        this.ruta = ruta;
        this.id = id;
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

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

}