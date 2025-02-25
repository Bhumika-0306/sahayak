package com.example.sahayakapp;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "SahayakDB";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_USERS = "users";

    // Column Names
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "fullName";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_PASSWORD = "password";
    private static final String COLUMN_CONTACT = "contact";
    private static final String COLUMN_LOCATION = "location";
    private static final String COLUMN_USER_TYPE = "userType";
    private static final String COLUMN_SKILLS = "skills";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_USERS_TABLE = "CREATE TABLE " + TABLE_USERS + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_NAME + " TEXT, "
                + COLUMN_EMAIL + " TEXT UNIQUE, "
                + COLUMN_PASSWORD + " TEXT, "
                + COLUMN_CONTACT + " TEXT, "
                + COLUMN_LOCATION + " TEXT, "
                + COLUMN_USER_TYPE + " TEXT, "
                + COLUMN_SKILLS + " TEXT)";
        db.execSQL(CREATE_USERS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        onCreate(db);
    }

    public boolean registerUser(String fullName, String email, String password, String contact, String location, String userType, String skills) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COLUMN_NAME, fullName);
        values.put(COLUMN_EMAIL, email);
        values.put(COLUMN_PASSWORD, password);
        values.put(COLUMN_CONTACT, contact);
        values.put(COLUMN_LOCATION, location);
        values.put(COLUMN_USER_TYPE, userType);
        values.put(COLUMN_SKILLS, skills);

        long result = db.insert(TABLE_USERS, null, values);
        db.close();

        return result != -1; // Returns true if insertion is successful
    }

    public boolean checkUserExists(String email, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_USERS + " WHERE email=? AND password=?", new String[]{email, password});
        boolean exists = cursor.getCount() > 0;
        cursor.close();
        db.close();
        return exists;
    }
}
