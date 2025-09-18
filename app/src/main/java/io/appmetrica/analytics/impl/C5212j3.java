package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.j3 */
/* loaded from: classes2.dex */
public final class C5212j3 implements IBinaryDataHelper {

    /* renamed from: a */
    public final InterfaceC5590y6 f31955a;

    public C5212j3(C5429rk c5429rk) {
        this.f31955a = c5429rk;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:7:0x001c, B:9:0x0023, B:11:0x0029, B:15:0x003e), top: B:27:0x001c }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] get(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            io.appmetrica.analytics.impl.y6 r1 = r10.f31955a     // Catch: java.lang.Throwable -> L44
            android.database.sqlite.SQLiteDatabase r1 = r1.mo19759a()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L42
            java.lang.String r3 = "binary_data"
            java.lang.String r5 = "data_key = ?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L42
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            r2 = r1
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L42
            if (r11 == 0) goto L3c
            int r2 = r11.getCount()     // Catch: java.lang.Throwable -> L46
            r3 = 1
            if (r2 != r3) goto L3c
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L3c
            java.lang.String r2 = "value"
            int r2 = r11.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L46
            byte[] r0 = r11.getBlob(r2)     // Catch: java.lang.Throwable -> L46
            io.appmetrica.analytics.impl.AbstractC5182hn.m20509a(r11)
            io.appmetrica.analytics.impl.y6 r11 = r10.f31955a
            r11.mo19760a(r1)
            return r0
        L3c:
            if (r11 == 0) goto L46
            r11.getCount()     // Catch: java.lang.Throwable -> L46
            goto L46
        L42:
            r11 = r0
            goto L46
        L44:
            r11 = r0
            r1 = r11
        L46:
            io.appmetrica.analytics.impl.AbstractC5182hn.m20509a(r11)
            io.appmetrica.analytics.impl.y6 r11 = r10.f31955a
            r11.mo19760a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5212j3.get(java.lang.String):byte[]");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(String str, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseMo19759a;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseMo19759a = this.f31955a.mo19759a();
            if (sQLiteDatabaseMo19759a != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabaseMo19759a.insertWithOnConflict("binary_data", null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseMo19759a;
                    sQLiteDatabaseMo19759a = sQLiteDatabase;
                    this.f31955a.mo19760a(sQLiteDatabaseMo19759a);
                }
            }
        } catch (Throwable unused2) {
        }
        this.f31955a.mo19760a(sQLiteDatabaseMo19759a);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(String str) {
        SQLiteDatabase sQLiteDatabaseMo19759a;
        try {
            sQLiteDatabaseMo19759a = this.f31955a.mo19759a();
            if (sQLiteDatabaseMo19759a != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabaseMo19759a.delete("binary_data", "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseMo19759a = null;
        }
        this.f31955a.mo19760a(sQLiteDatabaseMo19759a);
    }
}
