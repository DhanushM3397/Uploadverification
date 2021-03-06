package com.example.uploadverification;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;
import java.util.ArrayList;

public class DatabaseHelper extends Application {

    private FunctionsCall functionsCall = new FunctionsCall();
    private MyHelper mh;
    private SQLiteDatabase myDataBase;
    private String DATABASE_PATH;

    //Constructor
    public DatabaseHelper(Context context) {
        DATABASE_PATH = String.format("%s%s", functionsCall.filepath("Database"), File.separator);
        String DATABASE_NAME = String.format("%s%s", DATABASE_PATH, "transport.db");
        mh = new MyHelper(context, DATABASE_NAME, null, 2);
    }


    public Long insertdata(Transport_Model transport_model, DatabaseHelper databaseHelper) {
        open();
        ContentValues contentValues = new ContentValues();
        contentValues.put("GreenEnergy", transport_model.getGreenEnergy());
        contentValues.put("JeevanaMadhura", transport_model.getJeevanaMadhura());
        contentValues.put("Niranthara", transport_model.getNiranthara());
        contentValues.put("NPSS", transport_model.getNPSS());
        contentValues.put("sHGLoanRecovery", transport_model.getsHGLoanRecovery());
        contentValues.put("Suraksha", transport_model.getSuraksha());
        contentValues.put("DivisionUploaded", transport_model.getDivisionUpload());
        contentValues.put("DivisionwiseTransaction", transport_model.getDivisionwiseTransaction1());
        contentValues.put("GroupwiseOtherTrans", transport_model.getGroupwiseOtherTrans());
        contentValues.put("GroupwiseTrans", transport_model.getGroupwiseTrans());
        contentValues.put("MembRecoveryStlmnt", transport_model.getMembRecoveryStlmnt());
        contentValues.put("MemberLoanAdjustment", transport_model.getMemberLoanAdjustment());
        contentValues.put("MemberLoanClosure", transport_model.getMemberLoanClosure());
        contentValues.put("MemberLoanRegularDisbursement", transport_model.getMemberLoanRegularDisbursemen());
        contentValues.put("MemberLoanSpecialDisbursement", transport_model.getMemberLoanSpecialDisbursement());
        contentValues.put("MemberTermination", transport_model.getMemberTermination());
        contentValues.put("MemberwiseTransaction", transport_model.getMemberwiseTransaction());
        contentValues.put("NonCardAmount", transport_model.getNonCardAmount());
        contentValues.put("SHGLoanRecoverynoncash", transport_model.getSHGLoanRecoverynoncash());
        contentValues.put("TerminatedSHGBalance", transport_model.getTerminatedSHGBalance());
        contentValues.put("GSTUnregistered", transport_model.getGSTUnregistered());
        contentValues.put("TerminatedSHGBalance2", transport_model.getTerminatedSHGBalance2());
        contentValues.put("DestituteCompensation", transport_model.getDestituteCompensation());
        contentValues.put("DivisionwiseTransaction2", transport_model.getDivisionwiseTransaction2());
        contentValues.put("NirantharaSubscription2", transport_model.getNirantharaSubscription2());
        contentValues.put("LICPremiumCashCollection", transport_model.getLICPremiumCashCollection());
        contentValues.put("PHSCCollection", transport_model.getPHSCCollection());
        long result = myDataBase.insert("TRANSPORT", null, contentValues);
        close();
        return result ;
    }

  /*  public boolean insertInMastOut(ContentValues cv) {
        long result = myDataBase.insertOrThrow("TRANSPORT", null, cv);
        return result != -1;
    }*/
/*
    public long Regdata_insert(RegModel regModel) {
        open();
        ContentValues contentValues = new ContentValues();
        contentValues.put("NAME", regModel.getNAME());
        contentValues.put("EMAIL", regModel.getEMAIL());
        contentValues.put("PHONE", regModel.getPHONE());
        contentValues.put("PASSWORD", regModel.getPASSWORD());
        long reg = myDataBase.insert("REGISTARTION", null, contentValues);
        close();
        return reg;
    }*/


    public ArrayList<Transport_Model> getAllTransport() {
        ArrayList<Transport_Model> transportModelArrayList = new ArrayList<Transport_Model>();
        // Select All Query
        String selectQuery = "SELECT  * FROM TRANSPORT";

        open();
        Cursor cursor = myDataBase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Transport_Model transport_model = new Transport_Model();
                transport_model.setGreenEnergy(cursor.getString(1));
                transport_model.setJeevanaMadhura(cursor.getString(2));
                transport_model.setNiranthara(cursor.getString(3));
                transport_model.setNPSS(cursor.getString(4));
                transport_model.setsHGLoanRecovery(cursor.getString(5));
                transport_model.setSuraksha(cursor.getString(6));
                transport_model.setDivisionUpload(cursor.getString(7));
                transport_model.setDivisionwiseTransaction1(cursor.getString(8));
                transport_model.setGroupwiseOtherTrans(cursor.getString(9));
                transport_model.setGroupwiseTrans(cursor.getString(10));
                transport_model.setMembRecoveryStlmnt(cursor.getString(11));

                transport_model.setMemberLoanAdjustment(cursor.getString(12));
                transport_model.setMemberLoanClosure(cursor.getString(13));
                transport_model.setMemberLoanRegularDisbursemen(cursor.getString(14));
                transport_model.setMemberLoanSpecialDisbursement(cursor.getString(15));
                transport_model.setMemberTermination(cursor.getString(16));
                transport_model.setMemberwiseTransaction(cursor.getString(17));
                transport_model.setNonCardAmount(cursor.getString(18));
                transport_model.setSHGLoanRecoverynoncash(cursor.getString(19));
                transport_model.setTerminatedSHGBalance(cursor.getString(20));
                transport_model.setGSTUnregistered(cursor.getString(21));
                transport_model.setTerminatedSHGBalance2(cursor.getString(22));
                transport_model.setDestituteCompensation(cursor.getString(23));
                transport_model.setDivisionwiseTransaction2(cursor.getString(24));
                transport_model.setNirantharaSubscription2(cursor.getString(25));
                transport_model.setLICPremiumCashCollection(cursor.getString(26));
                transport_model.setPHSCCollection(cursor.getString(27));

                // Adding contact to list
                transportModelArrayList.add(transport_model);
            } while (cursor.moveToNext());
        }
        close();
        // return contact list
        return transportModelArrayList;
    }

    //Open database
    public void open() {
        myDataBase = mh.getWritableDatabase();
    }

    //Close database
    public void close() {
        myDataBase.close();
    }

    private class MyHelper extends SQLiteOpenHelper {
        MyHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE TRANSPORT (_id INTEGER PRIMARY KEY , GreenEnergy TEXT , JeevanaMadhura TEXT , Niranthara TEXT, " +
                    "NPSS TEXT, sHGLoanRecovery TEXT, Suraksha TEXT, DivisionUploaded TEXT, DivisionwiseTransaction TEXT, GroupwiseOtherTrans TEXT, " +
                    "GroupwiseTrans TEXT, MembRecoveryStlmnt TEXT, MemberLoanAdjustment TEXT, MemberLoanClosure TEXT, MemberLoanRegularDisbursement TEXT, MemberLoanSpecialDisbursement TEXT, MemberTermination TEXT,MemberwiseTransaction TEXT,NonCardAmount TEXT,SHGLoanRecoverynoncash TEXT,TerminatedSHGBalance TEXT,GSTUnregistered TEXT,TerminatedSHGBalance2 TEXT,DestituteCompensation TEXT,DivisionwiseTransaction2 TEXT,NirantharaSubscription2 TEXT,LICPremiumCashCollection TEXT,PHSCCollection TEXT)");
            // db.execSQL("CREATE TABLE REGISTARTION(_id INTEGER  PRIMARY KEY ,NAME TEXT unique,EMAIl TEXT,PHONE TEXT,PASSWORD TEXT)");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            if (newVersion > oldVersion)
                db.execSQL("ALTER TABLE TRANSPORT ADD NO_SILT_TRANSPORTATION TEXT");
        }
    }
}
