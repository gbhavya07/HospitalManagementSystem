
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ru368
 */
public class BillingInfo {
    Patient patient;
    ArrayList<Medicine> medicine;
    String recommendations, date;
   int fee;

    public BillingInfo() {
        this.patient = null;
        this.medicine = new ArrayList<>();
        this.recommendations = "";
        this.fee = 0;
        this.date="";
        
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public ArrayList<Medicine> getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicines) {
        this.medicine.add(medicines);
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    
   
   
    
}
