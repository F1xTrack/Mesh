package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4844rk implements InterfaceC4998y6 {
    public final Y6 a;

    public C4844rk(Y6 y6) {
        this.a = y6;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4998y6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4998y6
    public final SQLiteDatabase a() {
        try {
            return this.a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
