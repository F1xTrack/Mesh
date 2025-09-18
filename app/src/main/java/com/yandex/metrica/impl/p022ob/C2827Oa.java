package com.yandex.metrica.impl.p022ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.Oa */
/* loaded from: classes2.dex */
class C2827Oa implements InterfaceC3748y8 {

    /* renamed from: a */
    private final InterfaceC2750L8 f21862a;

    public C2827Oa(InterfaceC2750L8 interfaceC2750L8, String str) {
        this.f21862a = interfaceC2750L8;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3748y8
    /* renamed from: a */
    public void mo14696a(String str, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseMo14512a;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseMo14512a = this.f21862a.mo14512a();
            if (sQLiteDatabaseMo14512a != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabaseMo14512a.insertWithOnConflict("binary_data", null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseMo14512a;
                    sQLiteDatabaseMo14512a = sQLiteDatabase;
                    this.f21862a.mo14513a(sQLiteDatabaseMo14512a);
                }
            }
        } catch (Throwable unused2) {
        }
        this.f21862a.mo14513a(sQLiteDatabaseMo14512a);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3748y8
    /* renamed from: b */
    public void mo14698b(String str) {
        SQLiteDatabase sQLiteDatabaseMo14512a;
        try {
            sQLiteDatabaseMo14512a = this.f21862a.mo14512a();
            if (sQLiteDatabaseMo14512a != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabaseMo14512a.delete("binary_data", "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseMo14512a = null;
        }
        this.f21862a.mo14513a(sQLiteDatabaseMo14512a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: all -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0046, blocks: (B:8:0x001c, B:10:0x0023, B:12:0x0029, B:16:0x003e), top: B:28:0x001c }] */
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3748y8
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] mo14697a(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            com.yandex.metrica.impl.ob.L8 r1 = r10.f21862a     // Catch: java.lang.Throwable -> L44
            android.database.sqlite.SQLiteDatabase r1 = r1.mo14512a()     // Catch: java.lang.Throwable -> L44
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
            com.yandex.metrica.impl.p022ob.C2968U2.m15239a(r11)
            com.yandex.metrica.impl.ob.L8 r11 = r10.f21862a
            r11.mo14513a(r1)
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
            com.yandex.metrica.impl.p022ob.C2968U2.m15239a(r11)
            com.yandex.metrica.impl.ob.L8 r11 = r10.f21862a
            r11.mo14513a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2827Oa.mo14697a(java.lang.String):byte[]");
    }
}
