package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes2.dex */
public class N8 implements L8 {
    private final C3176w8 a;

    public N8(C3176w8 c3176w8) {
        this.a = c3176w8;
    }

    @Override // com.yandex.metrica.impl.ob.L8
    public void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.yandex.metrica.impl.ob.L8
    public SQLiteDatabase a() {
        try {
            return this.a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
