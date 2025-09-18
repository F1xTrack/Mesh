package com.yandex.metrica.impl.p022ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.G8 */
/* loaded from: classes2.dex */
public class C2625G8 implements InterfaceC2600F8 {

    /* renamed from: a */
    private final HashMap<String, List<String>> f21288a;

    public C2625G8(String str, HashMap<String, List<String>> map) {
        this.f21288a = map;
    }

    /* renamed from: a */
    public boolean m14162a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean zEquals = true;
            for (Map.Entry<String, List<String>> entry : this.f21288a.entrySet()) {
                try {
                    Cursor cursorQuery = sQLiteDatabase.query(entry.getKey(), null, null, null, null, null, null);
                    if (cursorQuery == null) {
                        C2968U2.m15239a(cursorQuery);
                        return false;
                    }
                    entry.getKey();
                    List<String> value = entry.getValue();
                    List listAsList = Arrays.asList(cursorQuery.getColumnNames());
                    Collections.sort(listAsList);
                    zEquals &= value.equals(listAsList);
                    C2968U2.m15239a(cursorQuery);
                } catch (Throwable th) {
                    C2968U2.m15239a((Cursor) null);
                    throw th;
                }
            }
            return zEquals;
        } catch (Throwable unused) {
            return false;
        }
    }
}
