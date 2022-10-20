/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Data.VacineInjectionList;
import Tools.Menu;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DemoVacineInjection {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("|----------------------Vaccine manager-----------------------------|");
        menu.add("|------------------------------------------------------------------|");
        menu.add("|       1-->Show all Student Information  from file                |");
        menu.add("|       2-->Add student's information to vaccine injection         |");
        menu.add("|       3-->Update information of student's vaccine injection      |");
        menu.add("|       4-->Remove student vaccine injection information           |");
        menu.add("|       5-->Search injection by StudentID                          |");
        menu.add("|       6-->Save to file and Quit                                  |");
        menu.add("|-----------------------------------------------------------------|");
        int choice;
        VacineInjectionList listObj = new VacineInjectionList();
        String again = "";
        listObj.loadFileVaccine();
        listObj.loadFileStudent();
        listObj.loadFileInjection();
//        listObj.printStudentListV1();
        do {
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    listObj.printStudentList();
                    break;
                case 2:
                    listObj.addNewInjection();
                    break;
                case 3:

                    listObj.updateInforByIdInj();
                    break;
                case 4:
                    listObj.removeInjectionByIdInj();
                    break;
                case 5:
                    listObj.searchInjectionByStuId();
                    break;

                case 6:
                    listObj.WriteInjection();
                    break;
            }
        } while ((choice >= 1) && choice < 6);
    }

}