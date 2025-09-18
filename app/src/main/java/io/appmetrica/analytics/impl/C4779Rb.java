package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.Rb */
/* loaded from: classes2.dex */
public final class C4779Rb implements InterfaceC5590y6 {

    /* renamed from: a */
    public final Context f30686a;

    /* renamed from: b */
    public final String f30687b;

    /* renamed from: c */
    public final C5156gm f30688c;

    /* renamed from: d */
    public final C4873V9 f30689d;

    /* renamed from: e */
    public C4942Y6 f30690e;

    public C4779Rb(Context context, String str, C5156gm c5156gm) {
        this(context, str, new C4873V9(str), c5156gm);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5590y6
    /* renamed from: a */
    public final synchronized SQLiteDatabase mo19759a() {
        C4942Y6 c4942y6;
        try {
            this.f30689d.m19915a();
            c4942y6 = new C4942Y6(this.f30686a, this.f30687b, this.f30688c, PublicLogger.getAnonymousInstance());
            this.f30690e = c4942y6;
        } catch (Throwable unused) {
            return null;
        }
        return c4942y6.getWritableDatabase();
    }

    public C4779Rb(Context context, String str, C4873V9 c4873v9, C5156gm c5156gm) {
        this.f30686a = context;
        this.f30687b = str;
        this.f30689d = c4873v9;
        this.f30688c = c5156gm;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5590y6
    /* renamed from: a */
    public final synchronized void mo19760a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC5182hn.m20510a((Closeable) this.f30690e);
        this.f30689d.m19916b();
        this.f30690e = null;
    }
}
