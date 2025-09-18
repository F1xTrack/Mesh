package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.rk */
/* loaded from: classes2.dex */
public final class C5429rk implements InterfaceC5590y6 {

    /* renamed from: a */
    public final C4942Y6 f32519a;

    public C5429rk(C4942Y6 c4942y6) {
        this.f32519a = c4942y6;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5590y6
    /* renamed from: a */
    public final void mo19760a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5590y6
    /* renamed from: a */
    public final SQLiteDatabase mo19759a() {
        try {
            return this.f32519a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
