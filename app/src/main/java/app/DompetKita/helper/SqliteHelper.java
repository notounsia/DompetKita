package app.DompetKita.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * KELOMPOK "DompetKita App"
 * UAS Pemrograman Bergerak [PJJ Informatika S1 UNSIA]
 * Triyanto [200401070057]
 * Noto Susanto [200401010154]
 * Didik Rusmanto [200401072091]
 */


public class SqliteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "dompetKita";
    private static final int DATABASE_VERSION = 1;

    public SqliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "CREATE TABLE transaksi (transaksi_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, status TEXT," +
                        "jumlah LONG, keterangan TEXT, tanggal DATE DEFAULT CURRENT_DATE );"
        );
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS transaksi");
    }
}
