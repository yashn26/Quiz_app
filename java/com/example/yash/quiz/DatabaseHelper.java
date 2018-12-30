package com.example.yash.quiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yash on 29/12/18.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "questions_db";
    public static final String TABLE_NAME = "questions";

    public static final String CREATE_TABLE =
            "create table if not exists "
                    + TABLE_NAME
                    + " ( _id integer primary key autoincrement, COL1  TEXT , COL2 TEXT ,COL3 TEXT, COL4 TEXT, COL5 TEXT,"
                    + " COL6 TEXT, COL7 TEXT, COL8 TEXT, COL9 TEXT,COL10 TEXT,"
                    + " COL11 TEXT, COL12 TEXT, COL13 TEXT, COL14 TEXT,COL15 TEXT,"
                    + " COL16 TEXT, COL17 TEXT, COL18 TEXT, COL19 TEXT,COL20 TEXT,"
                    + " COL21 TEXT, COL22 TEXT, COL23 TEXT, COL24 TEXT);";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        // create questions table
        db.execSQL(CREATE_TABLE);

        ContentValues values = new ContentValues();

        values.put("COL1", "Which of the following is used to represent alphanumeric characters in Computers?");
        values.put("COL2", "ASCII");
        values.put("COL3", "EBCDIC");
        values.put("COL4", "BCD");
        values.put("COL5", "ANCH");
        values.put("COL6", "ASCII");

        values.put("COL7", "If you want to translate digital codes to audio signals and vice versa, your computer needs a");
        values.put("COL8", "Sound Card");
        values.put("COL9", "CD-Rom");
        values.put("COL10", "Scanner");
        values.put("COL11", "Ram");
        values.put("COL12", "CD-Rom");

        values.put("COL13", "Which of the following is not an example of a utility program?");
        values.put("COL14", "Backup Software");
        values.put("COL15", "Operationg Software");
        values.put("COL16", "Anti-virus Software");
        values.put("COL17", "Normal Software");
        values.put("COL18", "Operationg Software");

        values.put("COL19", "In the context of 4G wireless technology, expand LTE?");
        values.put("COL20", "Long Term Edge");
        values.put("COL21", "Long Term Evolution");
        values.put("COL22", "Light Transmission Emission");
        values.put("COL23", "Light Technological Evolution");
        values.put("COL24", "Light Transmission Emission");
        long x=db.insert(TABLE_NAME, null, values);



        ContentValues values_2 = new ContentValues();

        values_2.put("COL1", "Of the following who died as political prisoner in Lahore prison?");
        values_2.put("COL2", "Bhagat Singh");
        values_2.put("COL3", "Batukeshwar Dutt");
        values_2.put("COL4", "Jatin Das");
        values_2.put("COL5", "Sukh Dev");
        values_2.put("COL6", "Jatin Das");

        values_2.put("COL7", "Which of the following animals was not native to India ? ");
        values_2.put("COL8", "Rhinoceros");
        values_2.put("COL9", "Elephant");
        values_2.put("COL10", "Horse");
        values_2.put("COL11", "Tiger");
        values_2.put("COL12", "Horse");

        values_2.put("COL13", "How many times the preamble was amended");
        values_2.put("COL14", "Once");
        values_2.put("COL15", "Twice");
        values_2.put("COL16", "Thrice");
        values_2.put("COL17", "Four times ");
        values_2.put("COL18", "Once");

        values_2.put("COL19", "Vardhamana Mahavira died at:");
        values_2.put("COL20", "Pavapuri");
        values_2.put("COL21", "Kundagrama ");
        values_2.put("COL22", "Pataliputra");
        values_2.put("COL23", "Taxila");
        values_2.put("COL24", "Pavapuri");
        long x_2=db.insert(TABLE_NAME, null, values_2);


        ContentValues values_3 = new ContentValues();

        values_3.put("COL1", "How many zeroes are in a googol?");
        values_3.put("COL2", "1,000");
        values_3.put("COL3", "10,000");
        values_3.put("COL4", "100");
        values_3.put("COL5", "10");
        values_3.put("COL6", "100");

        values_3.put("COL7", "In poker, what are the odds of drawing a royal flush?");
        values_3.put("COL8", "1,704,199 to 1");
        values_3.put("COL9", "1,243,961 to 1");
        values_3.put("COL10", "327,123 to 1");
        values_3.put("COL11", "649,740 to 1");
        values_3.put("COL12", "649,740 to 1");

        values_3.put("COL13", "What is the best way to represent a subset?");
        values_3.put("COL14", "table");
        values_3.put("COL15", "pie chart");
        values_3.put("COL16", "exploding diagram");
        values_3.put("COL17", "Venn diagram");
        values_3.put("COL18", "Venn diagram");

        values_3.put("COL19", "Which of these numbers did the ancient Egyptians consider to be sacred?");
        values_3.put("COL20", "4");
        values_3.put("COL21", "1");
        values_3.put("COL22", "9");
        values_3.put("COL23", "5");
        values_3.put("COL24", "9");
        long x_3=db.insert(TABLE_NAME, null, values_3);


        ContentValues values_4 = new ContentValues();

        values_4.put("COL1", "What is the toxicity caused by silicon called? ");
        values_4.put("COL2", "Silicosis");
        values_4.put("COL3", "Silicon");
        values_4.put("COL4", "Oxygen");
        values_4.put("COL5", "Carbon");
        values_4.put("COL6", "Silicosis");

        values_4.put("COL7", "Which polymer is used to manufacture electric switches, computer disks etc.? ");
        values_4.put("COL8", "Bakelite");
        values_4.put("COL9", "Polythene");
        values_4.put("COL10", "Nylon");
        values_4.put("COL11", "Teri cot");
        values_4.put("COL12", "Bakelite");

        values_4.put("COL13", " Which element is a liquid at ordinary temperature? ");
        values_4.put("COL14", "Mercury");
        values_4.put("COL15", "Iron");
        values_4.put("COL16", "copper");
        values_4.put("COL17", "Tustin");
        values_4.put("COL18", "Mercury");

        values_4.put("COL19", "What is sodium carbonate commonly known as? ");
        values_4.put("COL20", "Washing soda or soda ash");
        values_4.put("COL21", "Bathing Soap");
        values_4.put("COL22", "Washing Soap");
        values_4.put("COL23", "Surf");
        values_4.put("COL24", "Washing soda or soda ash");
        long x_4=db.insert(TABLE_NAME, null, values_4);

    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

        // Create tables again
        onCreate(db);
    }

    public FirstTableData getquestions(long id,int question) {
        // get readable database as we are not inserting anything
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from "
                        + TABLE_NAME+ " where " + "_id" + "=?",
                new String[] {""+id});

        if (cursor != null)
            cursor.moveToFirst();
        List< FirstTableData > firstTableDataList = new ArrayList< FirstTableData >();
        FirstTableData itemData = new FirstTableData();

        question=question*6;

       // if(question==0) {
            itemData.setQuestion(cursor.getString(question+1));
            itemData.setOption_1(cursor.getString(question+2));
            itemData.setOption_2(cursor.getString(question+3));
            itemData.setOption_3(cursor.getString(question+4));
            itemData.setOption_4(cursor.getString(question+5));
            itemData.setAnswer(cursor.getString(question+6));
        /*}

        if(question==1) {
            itemData.setQuestion(cursor.getString(7));
            itemData.setOption_1(cursor.getString(8));
            itemData.setOption_2(cursor.getString(9));
            itemData.setOption_3(cursor.getString(10));
            itemData.setOption_4(cursor.getString(11));
            itemData.setAnswer(cursor.getString(12));
        }

        if(question==2) {
            itemData.setQuestion(cursor.getString(13));
            itemData.setOption_1(cursor.getString(14));
            itemData.setOption_2(cursor.getString(15));
            itemData.setOption_3(cursor.getString(16));
            itemData.setOption_4(cursor.getString(17));
            itemData.setAnswer(cursor.getString(18));
        }

        if(question==3) {
            itemData.setQuestion(cursor.getString(19));
            itemData.setOption_1(cursor.getString(20));
            itemData.setOption_2(cursor.getString(21));
            itemData.setOption_3(cursor.getString(22));
            itemData.setOption_4(cursor.getString(23));
            itemData.setAnswer(cursor.getString(24));
        }*/

// close the db connection
        cursor.close();


        return itemData;

    }
}
