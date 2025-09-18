package com.yandex.metrica.impl.p022ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.C8 */
/* loaded from: classes2.dex */
public class C2525C8 {

    /* renamed from: a */
    private final InterfaceC2750L8 f20974a;

    public C2525C8(C3696w8 c3696w8, String str) {
        this(new C2800N8(c3696w8), str);
    }

    /* renamed from: a */
    public void m13957a() {
        SQLiteDatabase sQLiteDatabaseMo14512a;
        try {
            sQLiteDatabaseMo14512a = this.f20974a.mo14512a();
            if (sQLiteDatabaseMo14512a != null) {
                try {
                    sQLiteDatabaseMo14512a.execSQL("DROP TABLE IF EXISTS permissions");
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseMo14512a = null;
        }
        this.f20974a.mo14513a(sQLiteDatabaseMo14512a);
    }

    /* renamed from: b */
    public List<C3338ie> m13958b() {
        SQLiteDatabase sQLiteDatabaseMo14512a;
        Cursor cursorQuery;
        try {
            sQLiteDatabaseMo14512a = this.f20974a.mo14512a();
            if (sQLiteDatabaseMo14512a != null) {
                try {
                    cursorQuery = sQLiteDatabaseMo14512a.query("permissions", null, null, null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ArrayList arrayList = new ArrayList();
                                do {
                                    arrayList.add(new C3338ie(cursorQuery.getString(cursorQuery.getColumnIndex("name")), cursorQuery.getLong(cursorQuery.getColumnIndex("granted")) == 1));
                                } while (cursorQuery.moveToNext());
                                this.f20974a.mo14513a(sQLiteDatabaseMo14512a);
                                C2968U2.m15239a(cursorQuery);
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
            sQLiteDatabaseMo14512a = null;
            cursorQuery = null;
        }
        this.f20974a.mo14513a(sQLiteDatabaseMo14512a);
        C2968U2.m15239a(cursorQuery);
        return null;
    }

    public C2525C8(InterfaceC2750L8 interfaceC2750L8, String str) {
        this.f20974a = interfaceC2750L8;
    }
}
