package com.yandex.metrica.impl.ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class G8 implements F8 {
    private final HashMap<String, List<String>> a;

    public G8(String str, HashMap<String, List<String>> map) {
        this.a = map;
    }

    public boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean zEquals = true;
            for (Map.Entry<String, List<String>> entry : this.a.entrySet()) {
                try {
                    Cursor cursorQuery = sQLiteDatabase.query(entry.getKey(), null, null, null, null, null, null);
                    if (cursorQuery == null) {
                        U2.a(cursorQuery);
                        return false;
                    }
                    entry.getKey();
                    List<String> value = entry.getValue();
                    List listAsList = Arrays.asList(cursorQuery.getColumnNames());
                    Collections.sort(listAsList);
                    zEquals &= value.equals(listAsList);
                    U2.a(cursorQuery);
                } catch (Throwable th) {
                    U2.a((Cursor) null);
                    throw th;
                }
            }
            return zEquals;
        } catch (Throwable unused) {
            return false;
        }
    }
}
