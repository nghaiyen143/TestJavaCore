package cau1;

import javax.naming.PartialResultException;

public class Cau1 {
    public static void main(String[] args) {
        // write your code here
        String chuoi = "Software testing is the process of evaluating and verifying that a software product or application " +
                "does what it is supposed to do.";
        chuoi = chuoi.toLowerCase();
        System.out.println(chuoi);
        int sum = 0, demU = 0, demE = 0, demO = 0, demA = 0, demI = 0;
        String[] arr = chuoi.split("");
        for (int i = 0; i < arr.length; i++) {
            String tu = arr[i];
            for (int j = 0; j < tu.length(); j++) {
                char kiTu = tu.charAt(j);
                if (kiTu=='u') {
                    demU++;
                    sum++;
                } else if (kiTu=='e') {
                    demE++;
                    sum++;
                } else if (kiTu=='o') {
                    demO++;
                    sum++;
                } else if (kiTu=='a') {
                    demA++;
                    sum++;
                } else if (kiTu=='i') {
                    demI++;
                    sum++;
                }
            }
        }
        System.out.println("Tổng số nguyên âm trong chuỗi trên là "+sum+", trong đó có:");
        System.out.println(demU+" nguyên âm u");
        System.out.println(demE+" nguyên âm e");
        System.out.println(demO+" nguyên âm o");
        System.out.println(demA+" nguyên âm a");
        System.out.println(demI+" nguyên âm i");
    }
}
