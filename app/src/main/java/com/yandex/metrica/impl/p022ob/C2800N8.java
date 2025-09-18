package com.yandex.metrica.impl.p022ob;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.N8 */
/* loaded from: classes2.dex */
public class C2800N8 implements InterfaceC2750L8 {

    /* renamed from: a */
    private final C3696w8 f21770a;

    public C2800N8(C3696w8 c3696w8) {
        this.f21770a = c3696w8;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2750L8
    /* renamed from: a */
    public void mo14513a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2750L8
    /* renamed from: a */
    public SQLiteDatabase mo14512a() {
        try {
            return this.f21770a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
