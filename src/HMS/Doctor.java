/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS;

/**
 *
 * @author ru368
 */
public class Doctor {
    private  int id,fees;
    private String name,specification,gender,contact;
    
    public Doctor() {
        this.id = 0;
        this.fees = 0;
        this.name = "";
        this.specification = "";
        this.gender = "";
        this.contact ="";
    }

    public Doctor(int id, int fees, String name, String specification, String gender, String contact) {
        this.id = id;
        this.fees = fees;
        this.name = name;
        this.specification = specification;
        this.gender = gender;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender= gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", fees=" + fees + ", name=" + name + ", specification=" + specification + ", gender=" + gender + ", contact=" + contact + '}';
    }
    
    
    
}
