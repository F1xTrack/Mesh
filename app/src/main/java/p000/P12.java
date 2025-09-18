package p000;

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
    /* renamed from: a */
    public static final boolean m6204a(String str) {
        O90.m5968f(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: b */
    public static HashSet m6205b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* renamed from: c */
    public static void m6206c(OL1 ol1, SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        int i = C8953cD1.f17369d;
        File file = new File(path);
        boolean readable = file.setReadable(false, false);
        C6792rx c6792rx = ol1.f8381j;
        if (!readable) {
            c6792rx.m24555d("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c6792rx.m24555d("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c6792rx.m24555d("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c6792rx.m24555d("Failed to turn on database write permission for owner");
    }

    /* renamed from: d */
    public static void m6207d(OL1 ol1, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLException {
        boolean zMoveToFirst;
        C6792rx c6792rx = ol1.f8381j;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
            } catch (SQLiteException e) {
                c6792rx.m24553b(str, e, "Error querying for table");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                zMoveToFirst = false;
            }
            if (!zMoveToFirst) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                HashSet hashSetM6205b = m6205b(sQLiteDatabase, str);
                for (String str4 : str3.split(StringUtils.COMMA)) {
                    if (!hashSetM6205b.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i += 2) {
                        if (!hashSetM6205b.remove(strArr[i])) {
                            sQLiteDatabase.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (hashSetM6205b.isEmpty()) {
                    return;
                }
                c6792rx.m24553b(str, TextUtils.join(", ", hashSetM6205b), "Table has extra columns. table, columns");
            } catch (SQLiteException e2) {
                ol1.f8378g.m24554c(str, "Failed to verify columns on table that was just created");
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
