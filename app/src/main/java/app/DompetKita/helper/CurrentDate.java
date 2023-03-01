package app.DompetKita.helper;

import java.util.Calendar;

/**
 * KELOMPOK "DompetKita App"
 * UAS Pemrograman Bergerak [PJJ Informatika S1 UNSIA]
 * Triyanto [200401070057]
 * Noto Susanto [200401010154]
 * Didik Rusmanto [200401072091]
 */


public class CurrentDate {

    public static Calendar calendar   = Calendar.getInstance();
    public static int year            = calendar.get(Calendar.YEAR); // current year
    public static int month           = calendar.get(Calendar.MONTH); // current month
    public static int day             = calendar.get(Calendar.DAY_OF_MONTH); // current day

}
