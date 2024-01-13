package Otros;

import java.util.Date;

public class ClientSheet {

    String clientName;
    Date date;
    String notes;
    Tratamiento[] treatmentsSelected;
    double moneyOwed = 0;
    Diente[] dentadura = new Diente[32];
    MaterialSheet[] materialSheets;
    Boolean Cancelado;

    public ClientSheet(){
        this.clientName = "";
        this.date = new Date();
        this.notes = "";
        this.Cancelado = false;
        for (int i = 0; i < dentadura.length; i++) {
            int j=i+1;
            Diente diente = new Diente();
            diente.setId(j);
            diente.setMonto(5.00);
            diente.setNombre("Diente "+j);
            diente.setSeleccionado(false);
            dentadura[i] = diente;
        }
    }

    public ClientSheet(String clientName, String notes){
        this.clientName = clientName;
        this.notes = notes;
    }

    public String getName(){
        return clientName;
    }
    public double showClientDebt(){
        return moneyOwed;
    }

    public void calcDownPayment(){
        if(this.Cancelado){
            moneyOwed = 0.00;
        }
        else{
            moneyOwed = 0;
            for (Tratamiento t : treatmentsSelected) {
                if(t.getActivo()){
                    moneyOwed = moneyOwed+t.monto;
                }
            }
            for (Diente d : dentadura) {
                if(d.getSeleccionado()){
                    moneyOwed = moneyOwed+d.monto;
                }
            }
            if(materialSheets!=null){
                for (MaterialSheet m : materialSheets) {
                    if(m==null){
                        break;
                    }
                    moneyOwed = moneyOwed+m.getCostPerGram();
                }
            }
            
        }
    }

    public void gibData(){
        System.out.println(clientName);
        System.out.println(notes);
        System.out.println(moneyOwed);
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Tratamiento[] getTreatmentsSelected() {
        return treatmentsSelected;
    }

    public void setTreatmentsSelected(Tratamiento[] treatmentsSelected) {
        this.treatmentsSelected = treatmentsSelected;
    }

    public double getMoneyOwed() {
        return moneyOwed;
    }

    public void setMoneyOwed(double moneyOwed) {
        this.moneyOwed = moneyOwed;
    }

    public Diente[] getDentadura() {
        return dentadura;
    }

    public void setDentadura(Diente[] dentadura) {
        this.dentadura = dentadura;
    }

    public MaterialSheet[] getMaterialSheets() {
        return materialSheets;
    }

    public void setMaterialSheets(MaterialSheet[] materialSheets) {
        this.materialSheets = materialSheets;
    }

    public Boolean getCancelado() {
        return Cancelado;
    }

    public void setCancelado(Boolean cancelado) {
        Cancelado = cancelado;
    }

    
}
