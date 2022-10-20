/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Inputs {

    private static Scanner sc = new Scanner(System.in);
    private static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public static int getAnInt(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    //nhập int theo giới hạn
    public static int getAnInt(String inputMsg, String errorMsg,
            int lowerNum, int upperNum) {
        if (lowerNum > upperNum) {
            int tmp = lowerNum;
            lowerNum = upperNum;
            upperNum = tmp;
        }
        int n;
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if (n < lowerNum || n > upperNum) {
                    throw new Exception();
                }
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static double getADouble(String inputMsg, String errorMsg) {
        double n;
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    //nhập double theo giới hạn 
    public static double getADouble(String inputMsg, String errorMsg,
            double lowerNum, double upperNum) {

        if (lowerNum > upperNum) {
            double tmp = lowerNum;
            lowerNum = upperNum;
            upperNum = tmp;
        }
        double n;
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                if (n < lowerNum || n > upperNum) {
                    throw new Exception();
                }
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    //nhập chuỗi
    public static String getStr(String inputMsg, String errorMsg) {
        String id;
        while (true) {
            System.out.println(inputMsg);
            id = sc.nextLine().trim();//trim là xóa dấu cách
            if (id.length() == 0 || id.isEmpty()) {
                System.err.println(errorMsg);
            } else {
                return id;
            }
        }
    }

    //nhập String theo 1 dịnh dạng nào đó
    public static String getStrFormat(String inputMsg, String errorMsg, String format) {
        boolean match;
        String id;
        while (true) {
            System.out.println(inputMsg);
            id = sc.nextLine().trim().toUpperCase();
            match = id.matches(format);
            if (id.length() == 0 || id.isEmpty() || match == false) {
                System.out.println(errorMsg);
            } else {
                return id;
            }
        }
    }

    public static String getStr2(String inputMsg) {
        String id;
        while (true) {
            System.out.println(inputMsg);
            id = sc.nextLine().trim();
            if (id.length() == 0 || id.isEmpty()) {
                id ="No Place";
                return id;
            } else {
                return id;
            }
        }
    }

    

    
   

    
}