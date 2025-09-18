package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.hm */
/* loaded from: classes2.dex */
public final class C5181hm {

    /* renamed from: a */
    public final HashMap f31875a;

    public C5181hm(String str, HashMap<String, List<String>> map) {
        this.f31875a = map;
    }

    /* renamed from: a */
    public final HashMap<String, List<String>> m20505a() {
        return this.f31875a;
    }

    /* renamed from: a */
    public final boolean m20506a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean zEquals = true;
            for (Map.Entry entry : this.f31875a.entrySet()) {
                try {
                    Cursor cursorQuery = sQLiteDatabase.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (cursorQuery == null) {
                        AbstractC5182hn.m20509a(cursorQuery);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List listAsList = Arrays.asList(cursorQuery.getColumnNames());
                    Collections.sort(listAsList);
                    zEquals &= list.equals(listAsList);
                    AbstractC5182hn.m20509a(cursorQuery);
                } catch (Throwable th) {
                    AbstractC5182hn.m20509a((Cursor) null);
                    throw th;
                }
            }
            return zEquals;
        } catch (Throwable unused) {
            return false;
        }
    }
}
