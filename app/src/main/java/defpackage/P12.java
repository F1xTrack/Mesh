package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class P12 {
    public static final boolean a(String str) {
        O90.f(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static HashSet b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    public static void c(OL1 ol1, SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        int i = C2474cD1.d;
        File file = new File(path);
        boolean readable = file.setReadable(false, false);
        C6934rx c6934rx = ol1.j;
        if (!readable) {
            c6934rx.d("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c6934rx.d("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c6934rx.d("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c6934rx.d("Failed to turn on database write permission for owner");
    }

    public static void d(OL1 ol1, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLException {
        boolean zMoveToFirst;
        C6934rx c6934rx = ol1.j;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
            } catch (SQLiteException e) {
                c6934rx.b(str, e, "Error querying for table");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                zMoveToFirst = false;
            }
            if (!zMoveToFirst) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                HashSet hashSetB = b(sQLiteDatabase, str);
                for (String str4 : str3.split(StringUtils.COMMA)) {
                    if (!hashSetB.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i += 2) {
                        if (!hashSetB.remove(strArr[i])) {
                            sQLiteDatabase.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (hashSetB.isEmpty()) {
                    return;
                }
                c6934rx.b(str, TextUtils.join(", ", hashSetB), "Table has extra columns. table, columns");
            } catch (SQLiteException e2) {
                ol1.g.c(str, "Failed to verify columns on table that was just created");
                throw e2;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
