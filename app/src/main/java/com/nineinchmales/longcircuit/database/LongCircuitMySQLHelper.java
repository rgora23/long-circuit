package com.nineinchmales.longcircuit.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by bmaxwell2 on 2/18/16.
 */
public class LongCircuitMySQLHelper extends SQLiteOpenHelper {

    static final String DATABASE_TESTING = "long_circuit_testing.db";
    static final String DATABASE_DEVELOPMENT = "long_circuit_development.db";
    private static final int DATABASE_VERSION = 1;

    public LongCircuitMySQLHelper(Context c, String databaseName) {
        super(c, databaseName, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(LongCircuitSQLQueries.CREATE_USERS_TABLE);
        db.execSQL(LongCircuitSQLQueries.CREATE_LEVELS_TABLE);
        db.execSQL(LongCircuitSQLQueries.CREATE_LEVEL_COMPLETIONS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
