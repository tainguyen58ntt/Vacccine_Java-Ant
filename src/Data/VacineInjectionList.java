/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Main.Table;
import Tools.Inputs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class VacineInjectionList {

    // sau khi làm 2 cái phương thức WriteVacine với WriteStudent thì 
    // 2 cái arraylist này có dữ liệu
    ArrayList<Student> listStudent = new ArrayList<>();
    ArrayList<Vaccine> listVacine = new ArrayList<>();
    ArrayList<VacineInjection> listVaccineInjection = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Tại sao 2 phương thức này lại đặt trong constructor rỗng
    // vì ta phải chắc chắn 1 điều rằng hàm main, mik phải tạo đối tượng của
    // lớp này để gọi mấy cái phương  thức này thông qua tên class
    // vì vậy phải đặt trong constructor, để khi bên main khởi tạo đối tượng là bên này chạy luôn
    // và để chúng ta có ds vacine và ds sinh viên
    public VacineInjectionList() {

        WriteVaccineV1();
        WriteStudentV1();
//        WriteInjection();
//        saveToInjection();

    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public ArrayList<Vaccine> getListVacine() {
        return listVacine;
    }

    public void setListVacine(ArrayList<Vaccine> listVacine) {
        this.listVacine = listVacine;
    }

    public ArrayList<VacineInjection> getListVaccineInjection() {
        return listVaccineInjection;
    }

    public void setListVaccineInjection(ArrayList<VacineInjection> listVaccineInjection) {
        this.listVaccineInjection = listVaccineInjection;
    }

    // Các phương thức còn lại trong chương trình
    // show thông tin sinh viên
    public void WriteVaccineV1() {
        try {
            String fileName = "vaccine.dat";
            File f = new File(fileName);
            FileWriter fw = new FileWriter(f); // Writer
            PrintWriter pw = new PrintWriter(fw); // println()
            List<Vaccine> list = new ArrayList<>();
            list.add(new Vaccine("Covid-V001", "AstraZeneca"));
            list.add(new Vaccine("Covid-V002", "SPUTNUK V"));
            list.add(new Vaccine("Covid-V003", "Vero Cell"));
            list.add(new Vaccine("Covid-V004", "Pfizer"));
            list.add(new Vaccine("Covid-V005", "Moderna"));
            for (Vaccine vc : list) {
                pw.println(vc.getVacineID() + "," + vc.getVacineName());
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
//------------------------------------------------------------------------------

    public void loadFileVaccine() {
        try {
            FileReader f = new FileReader("vaccine.dat");
            BufferedReader br = new BufferedReader(f);
            Scanner o = new Scanner(f);

            while (o.hasNextLine()) {
                String data = o.nextLine();
                String[] split = data.split(",");
                String vacID = split[0];
                String vacName = split[1];
                listVacine.add(new Vaccine(vacID, vacName));

            }
            br.close();
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//------------------------------------------------------------------------------
    public void printVaccineList() {
        if (listVacine.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            System.out.println(" --------------^v^v^v^v^v^v---------------- ");
            System.out.println("|--------------VACCINE LIST----------------|");
            System.out.println("|--------------v^v^v^v^v^v^----------------|");
            for (Vaccine o : listVacine) {
                o.showAll();
            }
            System.out.println("|------------------------------------------|");
        }
    }
//------------------------------------------------------------------------------

    public void WriteStudentV1() {
        try {
            String fileName = "student.dat";
            File f = new File(fileName);
            FileWriter fw = new FileWriter(f); // Writer
            PrintWriter pw = new PrintWriter(fw); // println()
            List<Student> list = new ArrayList<>();
            list.add(new Student("SE15000", "Thanh Hiep"));
            list.add(new Student("SE15001", "Quoc Bao"));
            list.add(new Student("SE15002", "Khanh Van"));
            list.add(new Student("SE15003", "Chien Co"));
            list.add(new Student("SE15004", "Phuc Thien"));
            list.add(new Student("SE15005", "Tri Thuc"));
            list.add(new Student("SE15006", "Huu Tai"));
            list.add(new Student("SE15007", "Anh Khoa"));
            list.add(new Student("SE15008", "Trung Hieu"));
            list.add(new Student("SE15012", "Minh Son"));
            for (Student x : list) {
                pw.println(x.getStudentID() + "," + x.getStudentName());
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadFileStudent() {
        try {
            FileReader f = new FileReader("student.dat");
            BufferedReader br = new BufferedReader(f);
            Scanner o = new Scanner(f);

            while (o.hasNextLine()) {
                String data = o.nextLine();
                String[] split = data.split(",");
                String stuID = split[0];
                String stuName = split[1];
                listStudent.add(new Student(stuID, stuName));

            }
            br.close();
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void printStudentList() {
        if (listStudent.isEmpty()) {
            System.out.println("The list is empty!!");
        } else {
            System.out.println(" --------------^v^v^v^v^v^v--------------- ");
            System.out.println("|--------------STUDENT LIST---------------|");
            System.out.println("|--------------v^v^v^v^v^v^---------------|");
            for (Student stu : listStudent) {
                stu.showAll();

            }
            System.out.println("|-----------------------------------------|");
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------

    public void WriteInjection() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String fileName = "injectionList5.dat";
            File f = new File(fileName);
            FileWriter fw = new FileWriter(f); // Writer
            PrintWriter pw = new PrintWriter(fw); // println()
            for (VacineInjection v : listVaccineInjection) {
                pw.println(v.getInjectionID() + ", " + v.getPlace1() + ", " + df.format(v.getDate1()) + ", " + v.getPlace2() + ", " + v.getDate2() + ", " + v.getStudentID() + ", " + v.getVaccineID() + ", " + v.injection1 + ", " + v.injection2);
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//---------------------------------------------------------------------------------------------------------------------------------------------
    public void loadFileInjection() {
        try {

            FileReader f = new FileReader("injectionList5.dat");
            BufferedReader br = new BufferedReader(f);
            Scanner o = new Scanner(f);

            while (o.hasNextLine()) {
                Date date_V1;
                String place_2 = null;
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                String data = o.nextLine();
                String[] s2 = data.split(", ");
                String injID = s2[0];
                String place_1 = s2[1];
                String date_1 = s2[2];
                place_2 = s2[3];
                String date_2 = s2[4];
                String stuID = s2[5];
                String vacID = s2[6];
                String injection_1 = s2[7];
                String injection_2 = s2[8];
                date_V1 = df.parse(date_1);
                boolean injection_V1 = Boolean.parseBoolean(injection_1);
                boolean injection_V2 = Boolean.parseBoolean(injection_2);
                listVaccineInjection.add(new VacineInjection(injID, place_1, date_V1, place_2, date_2, stuID, vacID, injection_V1, injection_V2));

            }
            br.close();
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
//------------------------------------------------------------------------------

    public void addNewInjection() throws ParseException {
        String injID = "", firstInjPlace = "", secondInjPlace = null, stuID = "", vacID = "";
        boolean injection_1 = false, injection_2 = false;
        long days = 0;
        boolean cont = false;
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date firstInjDate, secondInjDate = null;
        Date firstInjDate_1, secondInjDate_2 = null;
        Date today = new Date();
        int dem = 0;
        String date1 = null, date2 = null;
        String again = "";
        if (listVaccineInjection.size() >= 10) {
            System.out.println("The Injection Is Full, You Don't Add Continue!!!");
        } else {

            do {
                do {
                    try {

                        dem = 0;
                        String patter = "^(S\\d{3}$)";
                        System.out.println("Input ID(Sxxx | x is an Integer) : ");
                        injID = sc.nextLine().toUpperCase();
                        if (!injID.matches(patter)) {
                            throw new Exception();
                        }
                        if (checkID(injID) == true) {
                            System.err.println("The Duplicate Id -> Please input againt!");
                            dem++;
                        }

                    } catch (Exception e) {
                        System.err.println("Id Invalid or Id Empty!");
                        dem++;
                    }
                } while (dem != 0);
                //Nhập nơi tiêm 1
                firstInjPlace = Inputs.getStr("Input first Injection place: ", "Not empty").toUpperCase();
                //Ngày tiêm mũi 1
                do {
                    try {
                        System.out.println("PLEASE ENTER FIRST DATE (Format: dd-MM-yyyy): ");
                        date1 = sc.nextLine();
                        df.setLenient(false);
                        df.parse(date1);
                        cont = false;
                    } catch (Exception ex) {
                        System.err.println("ERROL ---> ENTER FIRST DATE IS NOT THE CORRECT FORMAT(dd-MM-yyyy)");
                        cont = true;
                    }
                } while (cont);
                if (firstInjPlace != null && date1 != null) {
                    injection_1 = true;
                    System.out.println("Injection 1 succesfully!!!");
                }
                secondInjPlace = "No Place";
                if (secondInjPlace == "No Place") {
                    System.out.println("----> Students who have not been given injections 2!!!");
                    date2 = null;
                    date2 = "No Date";
                    injection_2 = false;
                }
                do {
                    System.out.println("Please enter the corresponding Stu ID in the existing list with the format(SExxxxx)!!! ");
                    printStudentList();
                    try {
                        dem = 0;
                        String patter = "^(SE\\d{5}$)";
                        System.out.println("Input student ID in list (SExxxxx | x is an Integer) : ");
                        stuID = sc.nextLine().toUpperCase();

                        if (!stuID.matches(patter)) {
                            throw new Exception();

                        } else {
                            if (checkStuID(stuID) == false) {
                                System.err.println("THE STUDENT ID NOT EXIST!!");
                                dem++;
                            } else if (checkStuIdDupli(stuID) == true) {
                                System.err.println("THE STUDENT HAS A INJECTON 1!!");
                                dem++;
                            }
                        }

                    } catch (Exception e) {
                        System.err.println("Id Invalid!! ");
                        dem++;
                    }    
                } while (dem != 0);
                
                do {
                    System.out.println("Please enter the vaccine in the list with the code format(Covid-Vxxx)!!! ");
                    printVaccineList();
                    try {
                        dem = 0;
                        String patter = "^(Covid-V\\d{3}$)";
                        System.out.println("Input vaccine ID in list (Covid-Vxxx | x is an Integer): ");
                        vacID = sc.nextLine();
                        if (!vacID.matches(patter)) {
                            throw new Exception();
                        }
                        if (checkVacID(vacID) == false) {
                            System.err.println("THE VACCINE ID NOT EXIST!!");
                            dem++;
                        }

                    } catch (Exception e) {
                        System.err.println("The ID Vaccine Invalid or ID Is Empty!! ");
                        dem++;
                    }
                } while (dem != 0);
                firstInjDate = df.parse(date1);
                listVaccineInjection.add(new VacineInjection(injID, firstInjPlace, firstInjDate, secondInjPlace, date2, stuID, vacID, injection_1, injection_2));

                do {
                    System.out.println("Do you want to add more(YES/NO): ");
                    again = sc.nextLine();
                } while (!again.equalsIgnoreCase("YES") && !again.equalsIgnoreCase("NO"));
            } while (again.equalsIgnoreCase("YES"));
        }
    }

    public void showInjectionListV2() {

        Table st = new Table();
        //st.setRightAlign(true);//if true then cell text is right aligned
        st.setShowVerticalLines(true);//if false (default) then no vertical lines are shown

        st.setHeaders("Injection ID", "Place 1", "Date 1", "Place 2", "Date 2", "Student ID", "Vaccine ID", "Injection 1", "Injection 2");//optional - if not used then there will be no header and horizontal lines

        //đoạn này thì trong addRow sẽ thay bằng các phần tử trong list (chạy vòng lặp)
        for (VacineInjection f : listVaccineInjection) {
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String date_V1 = df.format(f.date1);
            st.addRow(f.getInjectionID(), f.getPlace1(), date_V1, f.getPlace2(), f.getDate2(), f.getStudentID(), f.getVaccineID(), f.isInjection1() ? "Yes" : "No", f.isInjection2() ? "Yes" : "No");

        }
        st.print();

    }

//------------------------------------------------------------------------------
    public void updateInforByIdInj() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String _injIdUp = null, _placeUp2 = null, _dateUp2 = null;
        int dem = 0;
        VacineInjection pos;
        boolean cont = false;
        Date date_1 = null;
        String date_1V2 = null;
        if (!listVaccineInjection.isEmpty()) {
            do {
                System.out.println("List Student Injection");
                showInjectionListV2();
                do {
                    try {
                        dem = 0;
                        String patter = "^(S\\d{3}$)";
                        System.out.println("Input ID(Sxxx | x is an Integer) : ");
                        _injIdUp = sc.nextLine().toUpperCase();
                        if (!_injIdUp.matches(patter)) {
                            throw new Exception();
                        }
                    } catch (Exception e) {
                        System.err.println("Id Invalid or Id is Empty!! ");
                        dem++;
                    }
                } while (dem != 0);

                pos = checkIdInjUp(_injIdUp);
                if (pos != null) {
                    System.out.println("The ID DUPLICATED, READY FOR UPDATE!!");
                } else {
                    System.err.println("The Injection does not exist!!");
                }
            } while (pos == null);

            if (pos.getPlace2().equalsIgnoreCase("No Place")) {
                _placeUp2 = Inputs.getStr("Input second Injection place: ", "Not empty").toUpperCase();
                do {
                    do {
                        try {
                            System.out.println("PLEASE ENTER TWO DATE (Format: dd-MM-yyyy): ");
                            _dateUp2 = sc.nextLine();

                            df.setLenient(false);
                            df.parse(_dateUp2);
                            cont = false;

                        } catch (Exception ex) {
                            System.err.println("ERROL ---> ENTER TWO DATE IS NOT THE CORRECT FORMAT(dd-MM-yyyy) "
                                    + "OR DAY TWO CAN NOT BE LEFT BLANK!");
                            cont = true;
                        }
                    } while (cont);
                    date_1 = pos.getDate1();
                    //String date_1V2
                    date_1V2 = df.format(date_1);
                    if (checkDate(date_1V2, _dateUp2) > 28 && checkDate(date_1V2, _dateUp2) < 84) {
                        pos.setPlace2(_placeUp2);
                        pos.setDate2(_dateUp2);
                        pos.setInjection2(true);
                        System.out.println("Success");
                        break;
                    } else {
                        System.err.println("Input Day 2 injection is not enough 4 weeks or Input Day 2 injection max 12 weeks!!");
                    }
                } while (checkDate(date_1V2, _dateUp2) < 28 || checkDate(date_1V2, _dateUp2) > 84);

            } else {
                System.out.println("Student has completed 2 injections");
            }
        } else {
            System.err.println("The injection is empty you don't update");
        }

    }

    public VacineInjection checkIdInjUp(String _injIdUp) {
        for (VacineInjection o : listVaccineInjection) {
            if (o.getInjectionID().equals(_injIdUp)) {
                return o;
            }
        }
        return null;
    }

//------------------------------------------------------------------------------
    public void removeInjectionByIdInj() {
        String again = "";
        int count = 0;
        System.out.println("TYPE Injection ID YOU WANT TO REMOVE: ");
        String _InjIdRemove = sc.nextLine().toUpperCase();
        for (int i = 0; i < listVaccineInjection.size(); i++) {
            if (listVaccineInjection.get(i).getInjectionID().equals(_InjIdRemove)) {

                do {
                    System.out.println("Do you sure about remove this Injections(YES/NO): ");
                    again = sc.nextLine();
                } while (!again.equalsIgnoreCase("YES") && !again.equalsIgnoreCase("NO"));
                if (again.equalsIgnoreCase("YES")) {
                    listVaccineInjection.remove(i);
                    System.out.println("REMOVE SUCCESFULLY");
                    count++;
                } else if (again.equalsIgnoreCase("NO")) {
                    System.err.println("REMOVE FAIL!!");
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("DON'T HAVE ID YOU NEED TO REMOVE!");
            System.out.println("SEE YOU LATER^^");
        }

    }
//------------------------------------------------------------------------------

    public void searchInjectionByStuId() {
        int count = 0;

        System.out.println("Input Student ID you want to search: ");
        String _StuId = sc.nextLine().toUpperCase();
        Table st = new Table();

        for (VacineInjection stu : listVaccineInjection) {

            if (stu.getStudentID().equalsIgnoreCase(_StuId)) {

                st.setShowVerticalLines(true);

                st.setHeaders("Injection ID", "Place 1", "Date 1", "Place 2", "Date 2", "Student ID", "Vaccine ID", "Injection 1", "Injection 2");//optional - if not used then there will be no header and horizontal lines

                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                String date_V1 = df.format(stu.date1);
                st.addRow(stu.getInjectionID(), stu.getPlace1(), date_V1, stu.getPlace2(), stu.getDate2(), stu.getStudentID(), stu.getVaccineID(), stu.isInjection1() ? "Yes" : "No", stu.isInjection2() ? "Yes" : "No");
                count++;
            }
        }
        if (count != 0) {
            System.out.println("The Injection Information");
            st.print();
        }
        if (count == 0) {
            System.err.println("The Injections does not exist !");
        }

    }
//------------------------------------------------------------------------------
    // hàm check ID  injec có trùng hay không

    public boolean checkID(String _injID) {
        for (int i = 0; i < listVaccineInjection.size(); i++) {
            if (listVaccineInjection.get(i).getInjectionID().equals(_injID)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkStuIdDupli(String stuID) {
        for (VacineInjection stu : listVaccineInjection) {
            if (stu.getStudentID().equalsIgnoreCase(stuID)) {
                return true;
            }
        }
        return false;
    }

//------------------------------------------------------------------------------    
    // Hàm dùng để Check nhập StuID vào để coi thử có trùng hay không!!
    public boolean checkStuID(String stuID) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getStudentID().equalsIgnoreCase(stuID)) {
                return true;
            }
        }
        return false;
    }
//------------------------------------------------------------------------------    
    // Hàm check này dùng để check VacID mà đã nhập vào coi thử có trùng hay ko!!

    public boolean checkVacID(String vacID) {
        for (int i = 0; i < listVacine.size(); i++) {
            if (listVacine.get(i).getVacineID().equalsIgnoreCase(vacID)) {
                return true;
            }
        }
        return false;
    }
//------------------------------------------------------------------------------

    public long checkDate(String date1, String date2) {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        long days = 0;
        try {
            Date d1 = df.parse(date1);
            Date d2 = df.parse(date2);
            long getTime = d2.getTime() - d1.getTime(); // trả ra m/s
            days = getTime / (86400000);  // 24*60p*60s*1000 m/s
        } catch (Exception e) {
            System.out.println(e);
        }
        return days;
    }

}