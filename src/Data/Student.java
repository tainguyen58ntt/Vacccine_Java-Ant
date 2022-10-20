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
// Bài này đọc- ghi theo kiểu object cho nên phải triển khai lớp Serializable 
// để chuyển đối tượng thành luồng các byte thì nó mới ghi xuống file được
// và đọc dữ liệu từ file lên được
// nếu ko triển khai Serializable thì nó ko chuyển xuống được vì ta dùng FileOutPutStream vì nó ko có chức năng 
//đó nên ta nhờ Serializable làm điều đó
public class Student  implements Serializable {
    // lớp này có 2 thuộc tính là id và name
    String studentID;
    String studentName;

    public Student() {
    }

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", studentName=" + studentName + '}';
    }
    
    public void showAll() {
        System.out.printf("|ID: %10s|NAME: %20s|\n",
                            studentID, studentName);
    }
    
}