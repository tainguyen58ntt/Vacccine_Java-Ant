/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class VacineInjection {

    //fields
    String injectionID;
    String place1; // nơi tiêm lần 1
    Date date1;   //ngày tiêm lần 1
    String place2;   // nơi tiêm lần 2
    String date2;     // ngày tiêm lần 2
    String studentID;
    String vaccineID;
    boolean injection1;  // tiêm mũi 1 đã tiêm hay chưa
    boolean injection2;  //tiêm mũi 2 đã tiêm hay chưa

    //Tạo constructor
    public VacineInjection() {
    }

    public VacineInjection(String injectionID, String place1, Date date1, String place2, String date2, String studentID, String vaccineID, boolean injection1, boolean injection2) {
        this.injectionID = injectionID;
        this.place1 = place1;
        this.date1 = date1;
        this.place2 = place2;
        this.date2 = date2;
        this.studentID = studentID;
        this.vaccineID = vaccineID;
        this.injection1 = injection1;
        this.injection2 = injection2;
    }

    public String getInjectionID() {
        return injectionID;
    }

    public void setInjectionID(String injectionID) {
        this.injectionID = injectionID;
    }

    public String getPlace1() {
        return place1;
    }

    public void setPlace1(String place1) {
//        this.place1 = place1.isEmpty() ? "none" : place1;
        this.place1 = place1;

    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public String getPlace2() {
        return place2;
    }

    public void setPlace2(String place2) {
//       this.place2 = place2.isEmpty() ? "none" : place2;
        this.place2 = place2;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getVaccineID() {
        return vaccineID;
    }

    public void setVaccineID(String vaccineID) {
        this.vaccineID = vaccineID;
    }

    public boolean isInjection1() {
        return injection1;
    }

    public void setInjection1(boolean injection1) {
        this.injection1 = injection1;
    }

    public boolean isInjection2() {
        return injection2;
    }

    public void setInjection2(boolean injection2) {
        this.injection2 = injection2;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "VacineInjection{" + "injectionID=" + injectionID + "place1=" + place1 + ",date1=" + df.format(date1) + ",place2=" + place2 + ", date2=" + date2 + ", studentID=" + studentID + ",vaccineID=" + vaccineID + ",injection1=" + injection1 + ",injection2=" + injection2 + '}';
    }
    

}