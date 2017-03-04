package br.com.k19.android.cap05_02;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Edi Carlos on 04/03/2017.
 */

public class NotesDao {

    private SQLiteDatabase database;
    private String[] columns = { CustomSQLiteOpenHelper.COLUMN_ID,
        CustomSQLiteOpenHelper.COLUMN_NOTES};
    private CustomSQLiteOpenHelper sqLiteOpenHelper;

    public NotesDao(Context context) {
        sqLiteOpenHelper = new CustomSQLiteOpenHelper(context);
    }

    public void open() throws SQLException {
        database = sqLiteOpenHelper.getWritableDatabase();
    }

    public void close() {
        sqLiteOpenHelper.close();
    }

    public Note create(String note ) {

        ContentValues values = new ContentValues();
        values.put(CustomSQLiteOpenHelper.COLUMN_NOTES, note);
        

    }

}
