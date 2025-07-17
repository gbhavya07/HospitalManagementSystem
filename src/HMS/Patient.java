package HMS;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ru368
 */
public class Patient {
    private  int age, priority;
    private String id,name,gender,address,contact;
    
    public Patient(){
        this.priority=0;
        this.id="";
        this.age=0;
        this.name="";
        this.gender="";
        this.address="";
        this.contact="";
   
    }
    
    public Patient(String id, int age, String name, String gender, String address, String contact,int priority){
        this.priority=priority;
        this.id=id;
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.contact=contact;
    }

    public String getId() {
        return id;
    }
    
    public int getPriority() {
        return priority;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", address=" + address + ", contact=" + contact + ", priority=" + priority + '}';
    }
    
}
