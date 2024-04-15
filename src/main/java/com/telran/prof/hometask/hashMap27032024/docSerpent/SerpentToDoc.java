package com.telran.prof.hometask.hashMap27032024.docSerpent;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SerpentToDoc {

    public static void main(String[] args) throws ParseException {
        Termin termin = new Termin();

        Map<Date, String> visits = new TreeMap<>();

        for (int j = 0; j < 17; j++) {

            for (int i = 1; i < 17; i++) {
                System.out.println("Visit N " + i + " " + termin.terminPick(i));
            }
            System.out.println("Enter the number of the visit ");
            int num = goodScan();

            if (!visits.containsKey(termin.terminPick(num))) {
                System.out.println("N " + num + " " + termin.terminPick(num));

            } else {
                System.out.println(num + "The time has already been " +
                        "reserved.");
                System.out.println("Enter the number of the visit again ");
                num = goodScan();
            }
            Date namberOfTime = termin.terminPick(num);
            System.out.println("Enter your Id");
            Scanner scstr = new Scanner(System.in);
            String name = scstr.nextLine();
            System.out.println("namberOfTime  " + namberOfTime + "\n   name  " +
                    " " + name);
            visits.put(namberOfTime, name);

            System.out.println("Dear " + name);
            System.out.println("  We are waiting for you   " + visits.entrySet());
            String string = visits.get(namberOfTime);
            System.out.println("Continue? Yes - 1    No - 0");
            num = goodScan();
            if (num == 1) {
                continue;
            }
            for (Map.Entry<Date, String> element : visits.entrySet()) {
                System.out.println(element);
            }
            break;

        }
    }

    public static int goodScan() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return goodScan();
        int chose = sc.nextInt();
        return chose;
    }
}












