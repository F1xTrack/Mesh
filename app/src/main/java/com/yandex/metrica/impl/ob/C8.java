package com.yandex.metrica.impl.ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class C8 {
    private final L8 a;

    public C8(C3176w8 c3176w8, String str) {
        this(new N8(c3176w8), str);
    }

    public void a() {
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.execSQL("DROP TABLE IF EXISTS permissions");
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseA = null;
        }
        this.a.a(sQLiteDatabaseA);
    }

    public List<C2829ie> b() {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorQuery;
        try {
            sQLiteDatabaseA = this.a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    cursorQuery = sQLiteDatabaseA.query("permissions", null, null, null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ArrayList arrayList = new ArrayList();
                                do {
                                    arrayList.add(new C2829ie(cursorQuery.getString(cursorQuery.getColumnIndex("name")), cursorQuery.getLong(cursorQuery.getColumnIndex("granted")) == 1));
                                } while (cursorQuery.moveToNext());
                                this.a.a(sQLiteDatabaseA);
                                U2.a(cursorQuery);
                                return arrayList;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
            } else {
                cursorQuery = null;
            }
        } catch (Throwable unused3) {
            sQLiteDatabaseA = null;
            cursorQuery = null;
        }
        this.a.a(sQLiteDatabaseA);
        U2.a(cursorQuery);
        return null;
    }

    public C8(L8 l8, String str) {
        this.a = l8;
    }
}
