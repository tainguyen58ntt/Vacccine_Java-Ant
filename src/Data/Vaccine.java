/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class Vaccine implements Serializable {

    /// có 2 thuốc tính là id vacine và name vacine
    String vaccineID;
    String vaccineName;

    public Vaccine() {
    }

    public Vaccine(String vaccineID, String vaccineName) {
        this.vaccineID = vaccineID;
        this.vaccineName = vaccineName;
    }

    public String getVacineID() {
        return vaccineID;
    }

    public void setVacineID(String vaccineID) {
        this.vaccineID = vaccineID;
    }

    public String getVacineName() {
        return vaccineName;
    }

    public void setVacineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    @Override
    public String toString() {
        return "Vacine{" + "vacineID=" + vaccineID + ", vacineName=" + vaccineName + '}';
    }

    public void showAll() {
        System.out.printf("|VACID: %13s|NAME: %15s|\n",
                            vaccineID, vaccineName);
    }
}