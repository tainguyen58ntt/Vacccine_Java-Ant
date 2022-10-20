/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tools;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Menu extends ArrayList<String> {

    public Menu() {
        super();
    }
    
    public int integerInput(String i) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            try {
                System.out.print("\nEnter your" + " choice: ");
                n = Integer.parseInt(sc.nextLine());
                if (n < 1) {
                    throw new Exception();
                }
                return n;
            } catch (Exception ex) {
                System.out.println("Your choice is only from 1 to 6 !!");
            }
        } while (true);
    }
//    ---------------------------------------------------
    public int getChoice() {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        if (this.size() > 0) {
            for (int i = 0; i < this.size(); i++) {
                System.out.println((i + 1) + ". " + this.get(i));
            }
            result = integerInput("Choice");
        }
        return result;
    }
}