package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* loaded from: classes2.dex */
public class M8 implements L8 {
    private final Context a;
    private final String b;
    private final E8 c;
    private final C2663bn d;
    private C3176w8 e;

    public M8(Context context, String str, C2663bn c2663bn, E8 e8) {
        this.a = context;
        this.b = str;
        this.d = c2663bn;
        this.c = e8;
    }

    @Override // com.yandex.metrica.impl.ob.L8
    public synchronized SQLiteDatabase a() {
        C3176w8 c3176w8;
        try {
            this.d.a();
            c3176w8 = new C3176w8(this.a, this.b, this.c);
            this.e = c3176w8;
        } catch (Throwable unused) {
            return null;
        }
        return c3176w8.getWritableDatabase();
    }

    @Override // com.yandex.metrica.impl.ob.L8
    public synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        U2.a((Closeable) this.e);
        this.d.b();
        this.e = null;
    }
}
