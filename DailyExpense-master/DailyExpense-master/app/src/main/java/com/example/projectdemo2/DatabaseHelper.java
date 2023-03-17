package com.example.projectdemo2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static String DBNAME = "expensedb";
    private static String TABLENAME = "expense";
    private static int VERSION = 1;

    public static String COL_ID = "Id";
    public static String COL_TYPE = "ExpType";
    public static String COL_DATE = "ExpDate";
    public static String COL_TIME = "ExpTime";
    public static String COL_IMG = "ExpImage";
    public static String COL_AMOUNT = "ExpAmount";

    private String createSQl = "CREATE TABLE " + TABLENAME + " (Id integer primary key, ExpType TEXT, ExpDate Real, ExpTime Real, ExpImage TEXT, ExpAmount Real )";


    public DatabaseHelper(Context context) {
        super(context, DBNAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createSQl);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long insertData(String expTyep, double expAmount, long expDate, long expTime, String expImage)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_TYPE,expTyep);
        contentValues.put(COL_AMOUNT,expAmount);
        contentValues.put(COL_DATE,expDate);
        contentValues.put(COL_TIME,expTime);
        contentValues.put(COL_IMG,expImage);

        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        long id = sqLiteDatabase.insert(TABLENAME,null,contentValues);
        sqLiteDatabase.close();
        return id;
    }

    public Cursor showData(){
        return getReadableDatabase().rawQuery("SELECT * FROM "+TABLENAME,null);
    }

    public Cursor showData(String expTyepInput,long fromDate, long toDate){
        String sql1 = "Select * from "+TABLENAME+" where ExpType = '"+expTyepInput+"' AND ExpDate between '"+fromDate+"' AND '"+toDate+"' ";
        return getReadableDatabase().rawQuery(sql1,null);
    }

    public Cursor showData(long fromDate, long toDate){
        String sql1 = "Select * from "+TABLENAME+" where ExpDate between '"+fromDate+"' AND '"+toDate+"' ";
        return getReadableDatabase().rawQuery(sql1,null);
    }

    public Cursor showData(String expTyepInput){
        Log.d("Check", "showData: "+expTyepInput);
        String sql1 = "Select * from "+TABLENAME+" Where ExpType = '"+expTyepInput+"'";
        return getReadableDatabase().rawQuery(sql1,null);
    }

    public  Cursor getAmount(String expTyepInput,long fromDate, long toDate) {
        String sql1;
        if (expTyepInput.equals("")) {
             sql1= "Select SUM(ExpAmount) AS sumAmount from " + TABLENAME + " where  ExpDate between '" + fromDate + "' AND '" + toDate + "' ";
        } else {
            sql1 = "Select SUM(ExpAmount) AS sumAmount from " + TABLENAME + " where ExpType = '" + expTyepInput + "' AND ExpDate between '" + fromDate + "' AND '" + toDate + "' ";
        }


        return getReadableDatabase().rawQuery(sql1, null);
    }


    public  int  deleteData(int Id){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        int id =  sqLiteDatabase.delete(TABLENAME,"Id=?",new String[]{String.valueOf(Id)});
        sqLiteDatabase.close();
        return id;
    }

    public  int  updateData(int id, String expTyep, double expAmount, long expDate, long expTime, String expImage){
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_TYPE,expTyep);
        contentValues.put(COL_AMOUNT,expAmount);
        contentValues.put(COL_DATE,expDate);
        contentValues.put(COL_TIME,expTime);
        contentValues.put(COL_IMG,expImage);
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        int upid = sqLiteDatabase.update(TABLENAME,contentValues,"Id=?",new String[]{String.valueOf(id)});
        sqLiteDatabase.close();
        return  upid;
    }
}
