package pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student vova = new Student();
        vova.setAdmission(new Date());
        vova.setFio("Владимиров В.А.");
        vova.setGroup(345);

        System.out.println("Student: " + vova.getFio() + " in group - " + vova.getGroup()
                + ", receipt date " + vova.getAdmission());
    }
}
