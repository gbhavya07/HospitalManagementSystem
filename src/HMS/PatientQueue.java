/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HMS;

/**
 *
 * @author ru368
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;


import java.util.Iterator;


public class PatientQueue {
    private PriorityQueue<Patient> patientPriorityQueue;

    public PatientQueue() {
        // Initializing the priority queue with a comparator that compares patients based on their priority
        patientPriorityQueue = new PriorityQueue<>((p1, p2) -> p2.getPriority() - p1.getPriority());
    }

    public void addPatient(Patient patient) {
        patientPriorityQueue.add(patient);
    }

    public Patient getNextPatient() {
        return patientPriorityQueue.poll();
    }

    public boolean isEmpty() {
        return patientPriorityQueue.isEmpty();
    }

    public void loadPatientsFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] parts = line.split(";");
                if (parts.length != 7) {
                    System.err.println("Error parsing line " + lineNumber + ": " + line);
                    System.err.println("Expected 7 fields but found " + parts.length);
                    continue; // Skip this line and move to the next one
                }
                String id = parts[0];
                int age = Integer.parseInt(parts[2]);
                String name = parts[1];
                String gender = parts[3];
                String address = parts[4];
                String contact = parts[5];
                int priority = Integer.parseInt(parts[6]);

                Patient patient = new Patient(id, age, name, gender, address, contact, priority);
                addPatient(patient);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public Patient findPatientById(String id) {
        // Iterate through the patient queue to find the patient with the specified ID
        Iterator<Patient> iterator = patientPriorityQueue.iterator();
        while (iterator.hasNext()) {
            Patient patient = iterator.next();
            if (patient.getId().equals(id)) {
                return patient;
            }
        }
        // If no patient is found with the specified ID, return null
        return null;
    }


}

