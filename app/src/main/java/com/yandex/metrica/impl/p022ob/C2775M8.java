package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.M8 */
/* loaded from: classes2.dex */
public class C2775M8 implements InterfaceC2750L8 {

    /* renamed from: a */
    private final Context f21707a;

    /* renamed from: b */
    private final String f21708b;

    /* renamed from: c */
    private final C2575E8 f21709c;

    /* renamed from: d */
    private final C3165bn f21710d;

    /* renamed from: e */
    private C3696w8 f21711e;

    public C2775M8(Context context, String str, C3165bn c3165bn, C2575E8 c2575e8) {
        this.f21707a = context;
        this.f21708b = str;
        this.f21710d = c3165bn;
        this.f21709c = c2575e8;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2750L8
    /* renamed from: a */
    public synchronized SQLiteDatabase mo14512a() {
        C3696w8 c3696w8;
        try {
            this.f21710d.m15695a();
            c3696w8 = new C3696w8(this.f21707a, this.f21708b, this.f21709c);
            this.f21711e = c3696w8;
        } catch (Throwable unused) {
            return null;
        }
        return c3696w8.getWritableDatabase();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2750L8
    /* renamed from: a */
    public synchronized void mo14513a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        C2968U2.m15241a((Closeable) this.f21711e);
        this.f21710d.m15696b();
        this.f21711e = null;
    }
}
