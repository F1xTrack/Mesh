package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class Rb implements InterfaceC4998y6 {
    public final Context a;
    public final String b;
    public final C4584gm c;
    public final V9 d;
    public Y6 e;

    public Rb(Context context, String str, C4584gm c4584gm) {
        this(context, str, new V9(str), c4584gm);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4998y6
    public final synchronized SQLiteDatabase a() {
        Y6 y6;
        try {
            this.d.a();
            y6 = new Y6(this.a, this.b, this.c, PublicLogger.getAnonymousInstance());
            this.e = y6;
        } catch (Throwable unused) {
            return null;
        }
        return y6.getWritableDatabase();
    }

    public Rb(Context context, String str, V9 v9, C4584gm c4584gm) {
        this.a = context;
        this.b = str;
        this.d = v9;
        this.c = c4584gm;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4998y6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        hn.a((Closeable) this.e);
        this.d.b();
        this.e = null;
    }
}
