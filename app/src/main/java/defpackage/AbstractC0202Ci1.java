package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: Ci1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0202Ci1 {
    public static final /* synthetic */ int a = 0;

    static {
        AbstractC6911rp0.a("media3.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i, String str) throws C6353ou {
        try {
            int i2 = AbstractC0277Dh1.a;
            if (!(DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0)) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i3 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i3;
            } finally {
            }
        } catch (SQLException e) {
            throw new C6353ou(e);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", (Integer) 1);
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new C6353ou(e);
        }
    }
}
